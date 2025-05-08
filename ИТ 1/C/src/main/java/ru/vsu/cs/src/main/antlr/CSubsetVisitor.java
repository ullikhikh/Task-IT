// Generated from src\main\antlr\CSubset.g4 by ANTLR 4.9.3
package ru.vsu.cs;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSubsetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CSubsetVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CSubsetParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CSubsetParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link CSubsetParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(CSubsetParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayDeclaration}
	 * labeled alternative in {@link CSubsetParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(CSubsetParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleDeclaration}
	 * labeled alternative in {@link CSubsetParser#initDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDeclaration(CSubsetParser.SingleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSubsetParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CSubsetParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDefinition}
	 * labeled alternative in {@link CSubsetParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(CSubsetParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code procedureDefinition}
	 * labeled alternative in {@link CSubsetParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDefinition(CSubsetParser.ProcedureDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSubsetParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(CSubsetParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSubsetParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(CSubsetParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSubsetParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CSubsetParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link CSubsetParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(CSubsetParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link CSubsetParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(CSubsetParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link CSubsetParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(CSubsetParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link CSubsetParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(CSubsetParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link CSubsetParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(CSubsetParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link CSubsetParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(CSubsetParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doWhileStatement}
	 * labeled alternative in {@link CSubsetParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(CSubsetParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link CSubsetParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(CSubsetParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeStatement}
	 * labeled alternative in {@link CSubsetParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStatement(CSubsetParser.WriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readStatement}
	 * labeled alternative in {@link CSubsetParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(CSubsetParser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link CSubsetParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(CSubsetParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link CSubsetParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(CSubsetParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleAssignment}
	 * labeled alternative in {@link CSubsetParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAssignment(CSubsetParser.SimpleAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAssignment}
	 * labeled alternative in {@link CSubsetParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignment(CSubsetParser.ArrayAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSubsetParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(CSubsetParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSubsetParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(CSubsetParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSubsetParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(CSubsetParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSubsetParser#doWhileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStmt(CSubsetParser.DoWhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSubsetParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(CSubsetParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSubsetParser#writeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStmt(CSubsetParser.WriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSubsetParser#readStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStmt(CSubsetParser.ReadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSubsetParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(CSubsetParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link CSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(CSubsetParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link CSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(CSubsetParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code absFunction}
	 * labeled alternative in {@link CSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsFunction(CSubsetParser.AbsFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postDecrement}
	 * labeled alternative in {@link CSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrement(CSubsetParser.PostDecrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalAnd}
	 * labeled alternative in {@link CSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAnd(CSubsetParser.LogicalAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incFunction}
	 * labeled alternative in {@link CSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncFunction(CSubsetParser.IncFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decFunction}
	 * labeled alternative in {@link CSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecFunction(CSubsetParser.DecFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charLiteral}
	 * labeled alternative in {@link CSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteral(CSubsetParser.CharLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicative}
	 * labeled alternative in {@link CSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative(CSubsetParser.MultiplicativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additive}
	 * labeled alternative in {@link CSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive(CSubsetParser.AdditiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesized}
	 * labeled alternative in {@link CSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesized(CSubsetParser.ParenthesizedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link CSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CSubsetParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link CSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(CSubsetParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link CSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(CSubsetParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relational}
	 * labeled alternative in {@link CSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(CSubsetParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postIncrement}
	 * labeled alternative in {@link CSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrement(CSubsetParser.PostIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link CSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(CSubsetParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOr}
	 * labeled alternative in {@link CSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOr(CSubsetParser.LogicalOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link CSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(CSubsetParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equality}
	 * labeled alternative in {@link CSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(CSubsetParser.EqualityContext ctx);
}