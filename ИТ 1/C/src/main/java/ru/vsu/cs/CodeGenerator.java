package ru.vsu.cs;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import ru.vsu.cs.CSubsetParser.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CodeGenerator extends ru.vsu.cs.CSubsetBaseVisitor<Void> {
    private final FileWriter writer;
    private final Map<String, Integer> variableOffsets = new HashMap<>();
    private final Map<String, String> stringConstants = new HashMap<>();
    private int currentOffset = 0;
    private int labelCounter = 0;
    private int stringCounter = 0;

    public CodeGenerator(String outputFile) throws IOException {
        this.writer = new FileWriter(outputFile);
    }

    @Override
    public Void visitProgram(ProgramContext ctx) {
        emit(".386");
        emit(".model flat, stdcall");
        emit("option casemap :none");
        emit("include \\masm32\\include\\kernel32.inc");
        emit("include \\masm32\\include\\msvcrt.inc");
        emit("includelib \\masm32\\lib\\kernel32.lib");
        emit("includelib \\masm32\\lib\\msvcrt.lib");
        emit("");

        emit(".data");
        emit("_output_format db \"%d\", 0");
        emit("_input_format db \"%d\", 0");
        emit("_newline db 10, 0");
        emit("");

        for (ParseTree child : ctx.children) {
            if (child instanceof FunctionDeclContext) {
                collectStrings((FunctionDeclContext) child);
            }
        }
        emit("");

        emit(".code");
        emit("");

        for (ParseTree child : ctx.children) {
            if (child instanceof FunctionDefinitionContext) {
                visitFunctionDefinition((FunctionDefinitionContext) child);
            } else if (child instanceof ProcedureDefinitionContext) {
                visitProcedureDefinition((ProcedureDefinitionContext) child);
            }
        }

        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    private void collectStrings(ParseTree node) {
        if (node instanceof TerminalNode) {
            TerminalNode terminal = (TerminalNode) node;
            if (terminal.getSymbol().getType() == ru.vsu.cs.CSubsetLexer.STRING) {
                String str = terminal.getText();
                String label = "str_" + stringCounter++;
                stringConstants.put(str, label);
                emit(label + " db " + str + ", 0");
            }
        } else if (node instanceof ParserRuleContext) {
            for (int i = 0; i < node.getChildCount(); i++) {
                collectStrings(node.getChild(i));
            }
        }
    }
    @Override
    public Void visitFunctionDefinition(FunctionDefinitionContext ctx) {
        String funcName = ctx.ID().getText();
        emit(funcName + " PROC");

        // Обработка параметров
        if (ctx.params() != null) {
            for (ParamContext param : ctx.params().param()) {
                String paramName = param.ID().getText();
                emit(paramName + " DWORD ?");
            }
        }

        // Генерация тела функции
        visitBlock(ctx.block());

        emit(funcName + " ENDP");
        emit("");
        return null;
    }
    @Override
    public Void visitIfStmt(IfStmtContext ctx) {
        String elseLabel = newLabel();
        String endLabel = newLabel();

        // Генерация условия
        visit(ctx.expr());
        emit("cmp eax, 0");
        emit("je " + elseLabel);

        // Генерация then-блока
        visit(ctx.statement(0));
        emit("jmp " + endLabel);

        // Генерация else-блока (если есть)
        emit(elseLabel + ":");
        if (ctx.statement().size() > 1) {
            visit(ctx.statement(1));
        }

        emit(endLabel + ":");
        return null;
    }
    @Override
    public Void visitForStmt(ForStmtContext ctx) {
        String startLabel = newLabel();
        String endLabel = newLabel();

        // Получаем части for-цикла из контекста
        ParseTree initPart = ctx.getChild(2); // часть инициализации
        ParseTree conditionPart = ctx.getChild(4); // часть условия
        ParseTree incrementPart = ctx.getChild(6); // часть инкремента

        // Инициализация
        if (!initPart.getText().equals(";")) {
            visit(initPart);
        }

        emit(startLabel + ":");

        // Условие
        if (!conditionPart.getText().equals(";")) {
            visit(conditionPart);
            emit("cmp eax, 0");
            emit("je " + endLabel);
        }

        // Тело цикла
        visit(ctx.statement());

        // Инкремент
        if (ctx.getChildCount() > 6 && !ctx.getChild(6).getText().equals(")")) {
            visit(incrementPart);
        }

        emit("jmp " + startLabel);
        emit(endLabel + ":");
        return null;
    }
    @Override
    public Void visitWriteStmt(WriteStmtContext ctx) {
        for (int i = 0; i < ctx.expr().size(); i++) {
            ExprContext expr = ctx.expr(i);
            if (expr instanceof TerminalNode && ((TerminalNode)expr).getSymbol().getType() == ru.vsu.cs.CSubsetLexer.STRING) {
                String str = ((TerminalNode)expr).getText();
                emit("push offset " + str.replace("\"", "") + "_str");
            } else {
                visit(expr);
                emit("push eax");
                emit("push offset _output_format");
            }
            emit("call crt_printf");
            emit("add esp, 8");
        }

        if (ctx.getChild(0).getText().equals("WriteLn")) {
            emit("push offset _newline");
            emit("call crt_printf");
            emit("add esp, 4");
        }
        return null;
    }

    @Override
    public Void visitFunctionCall(FunctionCallContext ctx) {
        // Подготовка аргументов
        for (int i = ctx.expr().size() - 1; i >= 0; i--) {
            visit(ctx.expr(i));
            emit("push eax");
        }

        // Вызов функции
        String funcName = ctx.expr(0).getText();
        emit("call " + funcName);

        // Очистка стека
        if (ctx.expr().size() > 1) {
            emit("add esp, " + (4 * (ctx.expr().size() - 1)));
        }
        return null;
    }

    @Override
    public Void visitIncFunction(IncFunctionContext ctx) {
        visit(ctx.expr());
        emit("inc DWORD PTR [eax]");
        return null;
    }

    @Override
    public Void visitDecFunction(DecFunctionContext ctx) {
        if (ctx.expr().size() == 1) {
            visit(ctx.expr(0));
            emit("dec DWORD PTR [eax]");
        } else {
            visit(ctx.expr(0));
            emit("mov ebx, eax");
            visit(ctx.expr(1));
            emit("sub DWORD PTR [ebx], eax");
        }
        return null;
    }

    @Override
    public Void visitAbsFunction(AbsFunctionContext ctx) {
        visit(ctx.expr());
        emit("cdq");
        emit("xor eax, edx");
        emit("sub eax, edx");
        return null;
    }

    @Override
    public Void visitArrayAccess(ArrayAccessContext ctx) {
        visit(ctx.expr(1)); // Индекс
        emit("mov ebx, eax");
        emit("mov eax, " + ctx.expr(0).getText() + "[ebx*4]");
        return null;
    }

    @Override
    public Void visitProcedureDefinition(ProcedureDefinitionContext ctx) {
        String procName = ctx.ID().getText();
        emit(procName + " PROC");

        if (ctx.params() != null) {
            for (ParamContext param : ctx.params().param()) {
                String paramName = param.ID().getText();
                variableOffsets.put(paramName, currentOffset);
                currentOffset += 4;
            }
        }

        visitBlock(ctx.block());
        emit(procName + " ENDP");
        emit("");
        return null;
    }

    @Override
    public Void visitVariableDeclaration(VariableDeclarationContext ctx) {
        String type = ctx.type().getText();
        for (InitDeclContext initDecl : ctx.initDecl()) {
            String varName = ((SingleDeclarationContext) initDecl).ID().getText();
            emit(varName + " " + type + " ?");
        }
        return null;
    }

    @Override
    public Void visitArrayDeclaration(ArrayDeclarationContext ctx) {
        String type = ctx.type().getText();
        String varName = ctx.ID().getText();
        int size = Integer.parseInt(ctx.INT().getText());
        emit(varName + " " + type + " " + size + " DUP(?)");
        return null;
    }

    @Override
    public Void visitSimpleAssignment(SimpleAssignmentContext ctx) {
        String varName = ctx.ID().getText();
        visit(ctx.expr());
        emit("mov " + varName + ", eax");
        return null;
    }

    @Override
    public Void visitArrayAssignment(ArrayAssignmentContext ctx) {
        String varName = ctx.ID().getText();
        visit(ctx.expr(0));
        emit("mov ebx, eax");
        visit(ctx.expr(1));
        emit("mov [" + varName + " + ebx*4], eax");
        return null;
    }

    @Override
    public Void visitIntegerLiteral(IntegerLiteralContext ctx) {
        emit("mov eax, " + ctx.getText());
        return null;
    }

    @Override
    public Void visitAdditive(AdditiveContext ctx) {
        visit(ctx.expr(0));
        emit("push eax");
        visit(ctx.expr(1));
        emit("pop ebx");

        if (ctx.getChild(1).getText().equals("+")) {
            emit("add eax, ebx");
        } else {
            emit("sub eax, ebx");
        }
        return null;
    }

    @Override
    public Void visitMultiplicative(MultiplicativeContext ctx) {
        visit(ctx.expr(0));
        emit("push eax");
        visit(ctx.expr(1));
        emit("pop ebx");

        if (ctx.getChild(1).getText().equals("*")) {
            emit("imul eax, ebx");
        } else {
            emit("cdq");
            emit("idiv ebx");
        }
        return null;
    }

    @Override
    public Void visitReturnStmt(ReturnStmtContext ctx) {
        if (ctx.expr() != null) {
            visit(ctx.expr());
        }
        emit("ret");
        return null;
    }


    @Override
    public Void visitReadStmt(ReadStmtContext ctx) {
        for (TerminalNode id : ctx.ID()) {
            emit("push offset " + id.getText());
            emit("push offset _input_format");
            emit("call crt_scanf");
            emit("add esp, 8");
        }
        return null;
    }

    private void emit(String code) {
        try {
            writer.write(code + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String newLabel() {
        return "label_" + (labelCounter++);
    }
}