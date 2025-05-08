package ru.vsu.cs;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import ru.vsu.cs.CSubsetParser.*;

import java.util.Stack;

public class SemanticAnalyzer extends ru.vsu.cs.CSubsetBaseVisitor<Void> {
    private final Stack<SymbolTable> symbolTables = new Stack<>();
    private final ErrorReporter errorReporter;
    private Type currentFunctionReturnType;

    public SemanticAnalyzer(ErrorReporter errorReporter) {
        this.errorReporter = errorReporter;
        symbolTables.push(new SymbolTable());
    }

    private void enterScope() {
        symbolTables.push(new SymbolTable(symbolTables.peek()));
    }

    private void exitScope() {
        symbolTables.pop();
    }

    @Override
    public Void visitProgram(ProgramContext ctx) {
        for (ParseTree child : ctx.children) {
            if (child instanceof FunctionDefinitionContext) {
                visitFunctionDefinition((FunctionDefinitionContext) child);
            } else if (child instanceof ProcedureDefinitionContext) {
                visitProcedureDefinition((ProcedureDefinitionContext) child);
            } else if (child instanceof VariableDeclarationContext) {
                visitVariableDeclaration((VariableDeclarationContext) child);
            } else if (child instanceof ArrayDeclarationContext) {
                visitArrayDeclaration((ArrayDeclarationContext) child);
            }
        }
        return null;
    }

    @Override
    public Void visitFunctionDefinition(FunctionDefinitionContext ctx) {
        String funcName = ctx.ID().getText();
        Type returnType = Type.fromString(ctx.type().getText());

        if (symbolTables.peek().contains(funcName)) {
            errorReporter.reportError(ctx, "Duplicate declaration of function '" + funcName + "'");
            return null;
        }

        symbolTables.peek().addSymbol(new Symbol(funcName, returnType, false));
        enterScope();
        currentFunctionReturnType = returnType;

        if (ctx.params() != null) {
            for (ParamContext param : ctx.params().param()) {
                String paramName = param.ID().getText();
                Type paramType = Type.fromString(param.type().getText());
                symbolTables.peek().addSymbol(new Symbol(paramName, paramType, false));
            }
        }

        visitBlock(ctx.block());
        exitScope();
        currentFunctionReturnType = null;
        return null;
    }

    @Override
    public Void visitProcedureDefinition(ProcedureDefinitionContext ctx) {
        String procName = ctx.ID().getText();
        Type returnType = Type.VOID;

        if (symbolTables.peek().contains(procName)) {
            errorReporter.reportError(ctx, "Duplicate declaration of procedure '" + procName + "'");
            return null;
        }

        symbolTables.peek().addSymbol(new Symbol(procName, returnType, false));
        enterScope();
        currentFunctionReturnType = returnType;

        if (ctx.params() != null) {
            for (ParamContext param : ctx.params().param()) {
                String paramName = param.ID().getText();
                Type paramType = Type.fromString(param.type().getText());
                symbolTables.peek().addSymbol(new Symbol(paramName, paramType, false));
            }
        }

        visitBlock(ctx.block());
        exitScope();
        currentFunctionReturnType = null;
        return null;
    }

    @Override
    public Void visitVariableDeclaration(VariableDeclarationContext ctx) {
        Type type = Type.fromString(ctx.type().getText());

        for (InitDeclContext initDecl : ctx.initDecl()) {
            SingleDeclarationContext singleDecl = (SingleDeclarationContext) initDecl;
            String varName = singleDecl.ID().getText();
            boolean isArray = singleDecl.INT() != null;

            if (symbolTables.peek().contains(varName)) {
                errorReporter.reportError(ctx, "Duplicate declaration of variable '" + varName + "'");
                continue;
            }

            symbolTables.peek().addSymbol(new Symbol(varName, type, isArray));

            if (singleDecl.expr() != null) {
                checkExpressionType(singleDecl.expr(), type, ctx);
            }
        }
        return null;
    }

    @Override
    public Void visitSimpleAssignment(SimpleAssignmentContext ctx) {
        String varName = ctx.ID().getText();
        Symbol symbol = symbolTables.peek().lookup(varName);

        if (symbol == null) {
            errorReporter.reportError(ctx, "Undeclared variable '" + varName + "'");
            return null;
        }

        checkExpressionType(ctx.expr(), symbol.getType(), ctx);
        return null;
    }

    @Override
    public Void visitReturnStmt(ReturnStmtContext ctx) {
        if (ctx.expr() != null) {
            if (currentFunctionReturnType == Type.VOID) {
                errorReporter.reportError(ctx, "Void function cannot return a value");
            } else {
                checkExpressionType(ctx.expr(), currentFunctionReturnType, ctx);
            }
        } else if (currentFunctionReturnType != Type.VOID) {
            errorReporter.reportError(ctx, "Non-void function must return a value");
        }
        return null;
    }

    private void checkExpressionType(ExprContext expr, Type expectedType, ParserRuleContext ctx) {
        Type actualType = getExpressionType(expr);
        if (actualType != expectedType && actualType != Type.UNKNOWN) {
            errorReporter.reportError(ctx,
                    "Type mismatch: expected " + expectedType + ", but found " + actualType);
        }
    }

    private Type getExpressionType(ExprContext expr) {
        if (expr instanceof IntegerLiteralContext) {
            return Type.INT;
        } else if (expr instanceof CharLiteralContext) {
            return Type.CHAR;
        } else if (expr instanceof BooleanLiteralContext) {
            return Type.BOOL;
        } else if (expr instanceof IdentifierContext) {
            String varName = ((IdentifierContext) expr).ID().getText();
            Symbol symbol = symbolTables.peek().lookup(varName);
            return symbol != null ? symbol.getType() : Type.UNKNOWN;
        } else if (expr instanceof AdditiveContext || expr instanceof MultiplicativeContext) {
            return Type.INT;
        } else if (expr instanceof RelationalContext || expr instanceof EqualityContext ||
                expr instanceof LogicalAndContext || expr instanceof LogicalOrContext) {
            return Type.BOOL;
        } else if (expr instanceof FunctionCallContext) {
            FunctionCallContext call = (FunctionCallContext) expr;
            String funcName = call.expr(0).getText(); // Первое выражение - имя функции
            Symbol symbol = symbolTables.peek().lookup(funcName);
            return symbol != null ? symbol.getType() : Type.UNKNOWN;
        }
        return Type.UNKNOWN;
    }
}