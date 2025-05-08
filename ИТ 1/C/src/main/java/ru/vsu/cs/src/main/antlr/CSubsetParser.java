// Generated from src\main\antlr\CSubset.g4 by ANTLR 4.9.3
package ru.vsu.cs;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSubsetParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, ID=43, INT=44, CHAR=45, BOOL=46, 
		STRING=47, WS=48, COMMENT=49, BLOCK_COMMENT=50;
	public static final int
		RULE_program = 0, RULE_varDecl = 1, RULE_initDecl = 2, RULE_type = 3, 
		RULE_functionDecl = 4, RULE_params = 5, RULE_param = 6, RULE_block = 7, 
		RULE_statement = 8, RULE_assignment = 9, RULE_ifStmt = 10, RULE_forStmt = 11, 
		RULE_whileStmt = 12, RULE_doWhileStmt = 13, RULE_returnStmt = 14, RULE_writeStmt = 15, 
		RULE_readStmt = 16, RULE_arrayInitializer = 17, RULE_expr = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "varDecl", "initDecl", "type", "functionDecl", "params", "param", 
			"block", "statement", "assignment", "ifStmt", "forStmt", "whileStmt", 
			"doWhileStmt", "returnStmt", "writeStmt", "readStmt", "arrayInitializer", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "';'", "'['", "']'", "'='", "'int'", "'char'", "'bool'", 
			"'('", "')'", "'void'", "'{'", "'}'", "'if'", "'else'", "'for'", "'while'", 
			"'do'", "'return'", "'Write'", "'WriteLn'", "'Read'", "'ReadLn'", "'Inc'", 
			"'Dec'", "'Abs'", "'++'", "'--'", "'-'", "'!'", "'*'", "'/'", "'%'", 
			"'+'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ID", "INT", "CHAR", "BOOL", 
			"STRING", "WS", "COMMENT", "BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CSubset.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public static class CompileError extends RuntimeException {
	        public CompileError(String message) {
	            super(message);
	        }
	    }

	    public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException e) {
	        throw new CompileError("Syntax error at line " + offendingToken.getLine() +
	                             ":" + offendingToken.getCharPositionInLine() + " - " + msg);
	    }

	public CSubsetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CSubsetParser.EOF, 0); }
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(40);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(38);
					functionDecl();
					}
					break;
				case 2:
					{
					setState(39);
					varDecl();
					}
					break;
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10))) != 0) );
			setState(44);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	 
		public VarDeclContext() { }
		public void copyFrom(VarDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayDeclarationContext extends VarDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CSubsetParser.ID, 0); }
		public TerminalNode INT() { return getToken(CSubsetParser.INT, 0); }
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayDeclarationContext(VarDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableDeclarationContext extends VarDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<InitDeclContext> initDecl() {
			return getRuleContexts(InitDeclContext.class);
		}
		public InitDeclContext initDecl(int i) {
			return getRuleContext(InitDeclContext.class,i);
		}
		public VariableDeclarationContext(VarDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDecl);
		int _la;
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				type();
				setState(47);
				initDecl();
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(48);
					match(T__0);
					setState(49);
					initDecl();
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(55);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new ArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				type();
				setState(58);
				match(ID);
				setState(59);
				match(T__2);
				setState(60);
				match(INT);
				setState(61);
				match(T__3);
				setState(62);
				match(T__4);
				setState(63);
				arrayInitializer();
				setState(64);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclContext extends ParserRuleContext {
		public InitDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDecl; }
	 
		public InitDeclContext() { }
		public void copyFrom(InitDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleDeclarationContext extends InitDeclContext {
		public TerminalNode ID() { return getToken(CSubsetParser.ID, 0); }
		public TerminalNode INT() { return getToken(CSubsetParser.INT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SingleDeclarationContext(InitDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitSingleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclContext initDecl() throws RecognitionException {
		InitDeclContext _localctx = new InitDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_initDecl);
		int _la;
		try {
			_localctx = new SingleDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ID);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(69);
				match(T__2);
				setState(70);
				match(INT);
				setState(71);
				match(T__3);
				}
			}

			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(74);
				match(T__4);
				setState(75);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclContext extends ParserRuleContext {
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
	 
		public FunctionDeclContext() { }
		public void copyFrom(FunctionDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDefinitionContext extends FunctionDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CSubsetParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FunctionDefinitionContext(FunctionDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProcedureDefinitionContext extends FunctionDeclContext {
		public TerminalNode ID() { return getToken(CSubsetParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ProcedureDefinitionContext(FunctionDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitProcedureDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDecl);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				_localctx = new FunctionDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				type();
				setState(81);
				match(ID);
				setState(82);
				match(T__8);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
					{
					setState(83);
					params();
					}
				}

				setState(86);
				match(T__9);
				setState(87);
				block();
				}
				break;
			case T__10:
				_localctx = new ProcedureDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(T__10);
				setState(90);
				match(ID);
				setState(91);
				match(T__8);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
					{
					setState(92);
					params();
					}
				}

				setState(95);
				match(T__9);
				setState(96);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			param();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(100);
				match(T__0);
				setState(101);
				param();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CSubsetParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			type();
			setState(108);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__11);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << ID) | (1L << INT) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				{
				setState(111);
				statement();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationStatementContext extends StatementContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatementContext extends StatementContext {
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyStatementContext extends StatementContext {
		public EmptyStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteStatementContext extends StatementContext {
		public WriteStmtContext writeStmt() {
			return getRuleContext(WriteStmtContext.class,0);
		}
		public WriteStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitWriteStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatementContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentStatementContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatementContext extends StatementContext {
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public ForStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadStatementContext extends StatementContext {
		public ReadStmtContext readStmt() {
			return getRuleContext(ReadStmtContext.class,0);
		}
		public ReadStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitReadStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionStatementContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoWhileStatementContext extends StatementContext {
		public DoWhileStmtContext doWhileStmt() {
			return getRuleContext(DoWhileStmtContext.class,0);
		}
		public DoWhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StatementContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends StatementContext {
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new DeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				varDecl();
				}
				break;
			case 2:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				assignment();
				setState(121);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				expr(0);
				setState(124);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				ifStmt();
				}
				break;
			case 5:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				forStmt();
				}
				break;
			case 6:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				whileStmt();
				}
				break;
			case 7:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(129);
				doWhileStmt();
				}
				break;
			case 8:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(130);
				returnStmt();
				}
				break;
			case 9:
				_localctx = new WriteStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(131);
				writeStmt();
				}
				break;
			case 10:
				_localctx = new ReadStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(132);
				readStmt();
				}
				break;
			case 11:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(133);
				block();
				}
				break;
			case 12:
				_localctx = new EmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(134);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayAssignmentContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(CSubsetParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitArrayAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleAssignmentContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(CSubsetParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SimpleAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitSimpleAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new SimpleAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(ID);
				setState(138);
				match(T__4);
				setState(139);
				expr(0);
				}
				break;
			case 2:
				_localctx = new ArrayAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(ID);
				setState(141);
				match(T__2);
				setState(142);
				expr(0);
				setState(143);
				match(T__3);
				setState(144);
				match(T__4);
				setState(145);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__13);
			setState(150);
			match(T__8);
			setState(151);
			expr(0);
			setState(152);
			match(T__9);
			setState(153);
			statement();
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(154);
				match(T__14);
				setState(155);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStmtContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__15);
			setState(159);
			match(T__8);
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				{
				setState(160);
				varDecl();
				}
				break;
			case T__1:
			case T__8:
			case T__23:
			case T__24:
			case T__25:
			case T__28:
			case T__29:
			case ID:
			case INT:
			case CHAR:
			case BOOL:
				{
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(161);
					assignment();
					}
					break;
				case 2:
					{
					setState(162);
					expr(0);
					}
					break;
				}
				setState(165);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << ID) | (1L << INT) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				setState(168);
				expr(0);
				}
			}

			setState(171);
			match(T__1);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << ID) | (1L << INT) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				setState(172);
				expr(0);
				}
			}

			setState(175);
			match(T__9);
			setState(176);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__16);
			setState(179);
			match(T__8);
			setState(180);
			expr(0);
			setState(181);
			match(T__9);
			setState(182);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStmtContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DoWhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitDoWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStmtContext doWhileStmt() throws RecognitionException {
		DoWhileStmtContext _localctx = new DoWhileStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_doWhileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__17);
			setState(185);
			statement();
			setState(186);
			match(T__16);
			setState(187);
			match(T__8);
			setState(188);
			expr(0);
			setState(189);
			match(T__9);
			setState(190);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__18);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << ID) | (1L << INT) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				setState(193);
				expr(0);
				}
			}

			setState(196);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteStmtContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(CSubsetParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(CSubsetParser.STRING, i);
		}
		public WriteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitWriteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStmtContext writeStmt() throws RecognitionException {
		WriteStmtContext _localctx = new WriteStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_writeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(199);
			match(T__8);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << ID) | (1L << INT) | (1L << CHAR) | (1L << BOOL) | (1L << STRING))) != 0)) {
				{
				setState(202);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__23:
				case T__24:
				case T__25:
				case T__28:
				case T__29:
				case ID:
				case INT:
				case CHAR:
				case BOOL:
					{
					setState(200);
					expr(0);
					}
					break;
				case STRING:
					{
					setState(201);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(204);
					match(T__0);
					setState(207);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
					case T__23:
					case T__24:
					case T__25:
					case T__28:
					case T__29:
					case ID:
					case INT:
					case CHAR:
					case BOOL:
						{
						setState(205);
						expr(0);
						}
						break;
					case STRING:
						{
						setState(206);
						match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(216);
			match(T__9);
			setState(217);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadStmtContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CSubsetParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CSubsetParser.ID, i);
		}
		public ReadStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitReadStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStmtContext readStmt() throws RecognitionException {
		ReadStmtContext _localctx = new ReadStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_readStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(220);
			match(T__8);
			setState(221);
			match(ID);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(222);
				match(T__0);
				setState(223);
				match(ID);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			match(T__9);
			setState(230);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__11);
			setState(233);
			expr(0);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(234);
				match(T__0);
				setState(235);
				expr(0);
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierContext extends ExprContext {
		public TerminalNode ID() { return getToken(CSubsetParser.ID, 0); }
		public IdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalNotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LogicalNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AbsFunctionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AbsFunctionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitAbsFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostDecrementContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PostDecrementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitPostDecrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalAndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LogicalAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitLogicalAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncFunctionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IncFunctionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitIncFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecFunctionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DecFunctionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitDecFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharLiteralContext extends ExprContext {
		public TerminalNode CHAR() { return getToken(CSubsetParser.CHAR, 0); }
		public CharLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitCharLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultiplicativeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitMultiplicative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AdditiveContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitAdditive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesizedContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitParenthesized(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends ExprContext {
		public TerminalNode INT() { return getToken(CSubsetParser.INT, 0); }
		public IntegerLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelationalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostIncrementContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PostIncrementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitPostIncrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalOrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LogicalOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitLogicalOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(CSubsetParser.BOOL, 0); }
		public BooleanLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualityContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSubsetVisitor ) return ((CSubsetVisitor<? extends T>)visitor).visitEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				{
				_localctx = new IncFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(244);
				match(T__23);
				setState(245);
				match(T__8);
				setState(246);
				expr(0);
				setState(247);
				match(T__9);
				}
				break;
			case T__24:
				{
				_localctx = new DecFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249);
				match(T__24);
				setState(250);
				match(T__8);
				setState(251);
				expr(0);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(252);
					match(T__0);
					setState(253);
					expr(0);
					}
				}

				setState(256);
				match(T__9);
				}
				break;
			case T__25:
				{
				_localctx = new AbsFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				match(T__25);
				setState(259);
				match(T__8);
				setState(260);
				expr(0);
				setState(261);
				match(T__9);
				}
				break;
			case T__28:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263);
				match(T__28);
				setState(264);
				expr(13);
				}
				break;
			case T__29:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265);
				match(T__29);
				setState(266);
				expr(12);
				}
				break;
			case ID:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267);
				match(ID);
				}
				break;
			case INT:
				{
				_localctx = new IntegerLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				match(INT);
				}
				break;
			case CHAR:
				{
				_localctx = new CharLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				match(CHAR);
				}
				break;
			case BOOL:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				match(BOOL);
				}
				break;
			case T__8:
				{
				_localctx = new ParenthesizedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271);
				match(T__8);
				setState(272);
				expr(0);
				setState(273);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(317);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(277);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(278);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(279);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(280);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(281);
						_la = _input.LA(1);
						if ( !(_la==T__28 || _la==T__33) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(282);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(283);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(284);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(285);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new EqualityContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(286);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(287);
						_la = _input.LA(1);
						if ( !(_la==T__38 || _la==T__39) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(288);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new LogicalAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(289);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(290);
						match(T__40);
						setState(291);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new LogicalOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(292);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(293);
						match(T__41);
						setState(294);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new ArrayAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(295);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(296);
						match(T__2);
						setState(297);
						expr(0);
						setState(298);
						match(T__3);
						}
						break;
					case 8:
						{
						_localctx = new FunctionCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(300);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(301);
						match(T__8);
						setState(310);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << ID) | (1L << INT) | (1L << CHAR) | (1L << BOOL))) != 0)) {
							{
							setState(302);
							expr(0);
							setState(307);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__0) {
								{
								{
								setState(303);
								match(T__0);
								setState(304);
								expr(0);
								}
								}
								setState(309);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(312);
						match(T__9);
						}
						break;
					case 9:
						{
						_localctx = new PostIncrementContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(313);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(314);
						match(T__26);
						}
						break;
					case 10:
						{
						_localctx = new PostDecrementContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(316);
						match(T__27);
						}
						break;
					}
					} 
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 20);
		case 7:
			return precpred(_ctx, 19);
		case 8:
			return precpred(_ctx, 15);
		case 9:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0145\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\6\2+\n\2\r\2\16\2,\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3E\n\3\3\4\3\4\3\4\3\4\5\4K\n\4\3\4\3\4\5\4O\n\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\5\6W\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6`\n\6\3\6\3\6\5\6d\n"+
		"\6\3\7\3\7\3\7\7\7i\n\7\f\7\16\7l\13\7\3\b\3\b\3\b\3\t\3\t\7\ts\n\t\f"+
		"\t\16\tv\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u008a\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0096\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009f\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00a6\n\r\3\r\5\r\u00a9\n\r\3\r\5\r\u00ac\n\r\3"+
		"\r\3\r\5\r\u00b0\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\5\20\u00c5\n\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\5\21\u00cd\n\21\3\21\3\21\3\21\5\21\u00d2\n\21\7"+
		"\21\u00d4\n\21\f\21\16\21\u00d7\13\21\5\21\u00d9\n\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u00e3\n\22\f\22\16\22\u00e6\13\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\7\23\u00ef\n\23\f\23\16\23\u00f2\13\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0101"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0116\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0134\n\24\f\24\16"+
		"\24\u0137\13\24\5\24\u0139\n\24\3\24\3\24\3\24\3\24\3\24\7\24\u0140\n"+
		"\24\f\24\16\24\u0143\13\24\3\24\2\3&\25\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&\2\t\3\2\b\n\3\2\26\27\3\2\30\31\3\2!#\4\2\37\37$$\3\2%"+
		"(\3\2)*\2\u016b\2*\3\2\2\2\4D\3\2\2\2\6F\3\2\2\2\bP\3\2\2\2\nc\3\2\2\2"+
		"\fe\3\2\2\2\16m\3\2\2\2\20p\3\2\2\2\22\u0089\3\2\2\2\24\u0095\3\2\2\2"+
		"\26\u0097\3\2\2\2\30\u00a0\3\2\2\2\32\u00b4\3\2\2\2\34\u00ba\3\2\2\2\36"+
		"\u00c2\3\2\2\2 \u00c8\3\2\2\2\"\u00dd\3\2\2\2$\u00ea\3\2\2\2&\u0115\3"+
		"\2\2\2(+\5\n\6\2)+\5\4\3\2*(\3\2\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3"+
		"\2\2\2-.\3\2\2\2./\7\2\2\3/\3\3\2\2\2\60\61\5\b\5\2\61\66\5\6\4\2\62\63"+
		"\7\3\2\2\63\65\5\6\4\2\64\62\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3"+
		"\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\4\2\2:E\3\2\2\2;<\5\b\5\2<=\7-\2\2"+
		"=>\7\5\2\2>?\7.\2\2?@\7\6\2\2@A\7\7\2\2AB\5$\23\2BC\7\4\2\2CE\3\2\2\2"+
		"D\60\3\2\2\2D;\3\2\2\2E\5\3\2\2\2FJ\7-\2\2GH\7\5\2\2HI\7.\2\2IK\7\6\2"+
		"\2JG\3\2\2\2JK\3\2\2\2KN\3\2\2\2LM\7\7\2\2MO\5&\24\2NL\3\2\2\2NO\3\2\2"+
		"\2O\7\3\2\2\2PQ\t\2\2\2Q\t\3\2\2\2RS\5\b\5\2ST\7-\2\2TV\7\13\2\2UW\5\f"+
		"\7\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\f\2\2YZ\5\20\t\2Zd\3\2\2\2[\\\7"+
		"\r\2\2\\]\7-\2\2]_\7\13\2\2^`\5\f\7\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab"+
		"\7\f\2\2bd\5\20\t\2cR\3\2\2\2c[\3\2\2\2d\13\3\2\2\2ej\5\16\b\2fg\7\3\2"+
		"\2gi\5\16\b\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\r\3\2\2\2lj\3\2"+
		"\2\2mn\5\b\5\2no\7-\2\2o\17\3\2\2\2pt\7\16\2\2qs\5\22\n\2rq\3\2\2\2sv"+
		"\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\17\2\2x\21\3\2\2"+
		"\2y\u008a\5\4\3\2z{\5\24\13\2{|\7\4\2\2|\u008a\3\2\2\2}~\5&\24\2~\177"+
		"\7\4\2\2\177\u008a\3\2\2\2\u0080\u008a\5\26\f\2\u0081\u008a\5\30\r\2\u0082"+
		"\u008a\5\32\16\2\u0083\u008a\5\34\17\2\u0084\u008a\5\36\20\2\u0085\u008a"+
		"\5 \21\2\u0086\u008a\5\"\22\2\u0087\u008a\5\20\t\2\u0088\u008a\7\4\2\2"+
		"\u0089y\3\2\2\2\u0089z\3\2\2\2\u0089}\3\2\2\2\u0089\u0080\3\2\2\2\u0089"+
		"\u0081\3\2\2\2\u0089\u0082\3\2\2\2\u0089\u0083\3\2\2\2\u0089\u0084\3\2"+
		"\2\2\u0089\u0085\3\2\2\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\23\3\2\2\2\u008b\u008c\7-\2\2\u008c\u008d\7\7\2\2"+
		"\u008d\u0096\5&\24\2\u008e\u008f\7-\2\2\u008f\u0090\7\5\2\2\u0090\u0091"+
		"\5&\24\2\u0091\u0092\7\6\2\2\u0092\u0093\7\7\2\2\u0093\u0094\5&\24\2\u0094"+
		"\u0096\3\2\2\2\u0095\u008b\3\2\2\2\u0095\u008e\3\2\2\2\u0096\25\3\2\2"+
		"\2\u0097\u0098\7\20\2\2\u0098\u0099\7\13\2\2\u0099\u009a\5&\24\2\u009a"+
		"\u009b\7\f\2\2\u009b\u009e\5\22\n\2\u009c\u009d\7\21\2\2\u009d\u009f\5"+
		"\22\n\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\27\3\2\2\2\u00a0"+
		"\u00a1\7\22\2\2\u00a1\u00a8\7\13\2\2\u00a2\u00a9\5\4\3\2\u00a3\u00a6\5"+
		"\24\13\2\u00a4\u00a6\5&\24\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\7\4\2\2\u00a8\u00a2\3\2"+
		"\2\2\u00a8\u00a5\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00ac\5&\24\2\u00ab"+
		"\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\7\4"+
		"\2\2\u00ae\u00b0\5&\24\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b2\7\f\2\2\u00b2\u00b3\5\22\n\2\u00b3\31\3\2\2"+
		"\2\u00b4\u00b5\7\23\2\2\u00b5\u00b6\7\13\2\2\u00b6\u00b7\5&\24\2\u00b7"+
		"\u00b8\7\f\2\2\u00b8\u00b9\5\22\n\2\u00b9\33\3\2\2\2\u00ba\u00bb\7\24"+
		"\2\2\u00bb\u00bc\5\22\n\2\u00bc\u00bd\7\23\2\2\u00bd\u00be\7\13\2\2\u00be"+
		"\u00bf\5&\24\2\u00bf\u00c0\7\f\2\2\u00c0\u00c1\7\4\2\2\u00c1\35\3\2\2"+
		"\2\u00c2\u00c4\7\25\2\2\u00c3\u00c5\5&\24\2\u00c4\u00c3\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\4\2\2\u00c7\37\3\2\2"+
		"\2\u00c8\u00c9\t\3\2\2\u00c9\u00d8\7\13\2\2\u00ca\u00cd\5&\24\2\u00cb"+
		"\u00cd\7\61\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d5\3"+
		"\2\2\2\u00ce\u00d1\7\3\2\2\u00cf\u00d2\5&\24\2\u00d0\u00d2\7\61\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00ce\3\2"+
		"\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00cc\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\f\2\2\u00db\u00dc\7\4\2\2\u00dc"+
		"!\3\2\2\2\u00dd\u00de\t\4\2\2\u00de\u00df\7\13\2\2\u00df\u00e4\7-\2\2"+
		"\u00e0\u00e1\7\3\2\2\u00e1\u00e3\7-\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00e8\7\f\2\2\u00e8\u00e9\7\4\2\2\u00e9#\3\2\2\2"+
		"\u00ea\u00eb\7\16\2\2\u00eb\u00f0\5&\24\2\u00ec\u00ed\7\3\2\2\u00ed\u00ef"+
		"\5&\24\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7\17"+
		"\2\2\u00f4%\3\2\2\2\u00f5\u00f6\b\24\1\2\u00f6\u00f7\7\32\2\2\u00f7\u00f8"+
		"\7\13\2\2\u00f8\u00f9\5&\24\2\u00f9\u00fa\7\f\2\2\u00fa\u0116\3\2\2\2"+
		"\u00fb\u00fc\7\33\2\2\u00fc\u00fd\7\13\2\2\u00fd\u0100\5&\24\2\u00fe\u00ff"+
		"\7\3\2\2\u00ff\u0101\5&\24\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0103\7\f\2\2\u0103\u0116\3\2\2\2\u0104\u0105\7\34"+
		"\2\2\u0105\u0106\7\13\2\2\u0106\u0107\5&\24\2\u0107\u0108\7\f\2\2\u0108"+
		"\u0116\3\2\2\2\u0109\u010a\7\37\2\2\u010a\u0116\5&\24\17\u010b\u010c\7"+
		" \2\2\u010c\u0116\5&\24\16\u010d\u0116\7-\2\2\u010e\u0116\7.\2\2\u010f"+
		"\u0116\7/\2\2\u0110\u0116\7\60\2\2\u0111\u0112\7\13\2\2\u0112\u0113\5"+
		"&\24\2\u0113\u0114\7\f\2\2\u0114\u0116\3\2\2\2\u0115\u00f5\3\2\2\2\u0115"+
		"\u00fb\3\2\2\2\u0115\u0104\3\2\2\2\u0115\u0109\3\2\2\2\u0115\u010b\3\2"+
		"\2\2\u0115\u010d\3\2\2\2\u0115\u010e\3\2\2\2\u0115\u010f\3\2\2\2\u0115"+
		"\u0110\3\2\2\2\u0115\u0111\3\2\2\2\u0116\u0141\3\2\2\2\u0117\u0118\f\r"+
		"\2\2\u0118\u0119\t\5\2\2\u0119\u0140\5&\24\16\u011a\u011b\f\f\2\2\u011b"+
		"\u011c\t\6\2\2\u011c\u0140\5&\24\r\u011d\u011e\f\13\2\2\u011e\u011f\t"+
		"\7\2\2\u011f\u0140\5&\24\f\u0120\u0121\f\n\2\2\u0121\u0122\t\b\2\2\u0122"+
		"\u0140\5&\24\13\u0123\u0124\f\t\2\2\u0124\u0125\7+\2\2\u0125\u0140\5&"+
		"\24\n\u0126\u0127\f\b\2\2\u0127\u0128\7,\2\2\u0128\u0140\5&\24\t\u0129"+
		"\u012a\f\26\2\2\u012a\u012b\7\5\2\2\u012b\u012c\5&\24\2\u012c\u012d\7"+
		"\6\2\2\u012d\u0140\3\2\2\2\u012e\u012f\f\25\2\2\u012f\u0138\7\13\2\2\u0130"+
		"\u0135\5&\24\2\u0131\u0132\7\3\2\2\u0132\u0134\5&\24\2\u0133\u0131\3\2"+
		"\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0130\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u0140\7\f\2\2\u013b\u013c\f\21\2\2\u013c"+
		"\u0140\7\35\2\2\u013d\u013e\f\20\2\2\u013e\u0140\7\36\2\2\u013f\u0117"+
		"\3\2\2\2\u013f\u011a\3\2\2\2\u013f\u011d\3\2\2\2\u013f\u0120\3\2\2\2\u013f"+
		"\u0123\3\2\2\2\u013f\u0126\3\2\2\2\u013f\u0129\3\2\2\2\u013f\u012e\3\2"+
		"\2\2\u013f\u013b\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0143\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\'\3\2\2\2\u0143\u0141\3\2\2\2"+
		"!*,\66DJNV_cjt\u0089\u0095\u009e\u00a5\u00a8\u00ab\u00af\u00c4\u00cc\u00d1"+
		"\u00d5\u00d8\u00e4\u00f0\u0100\u0115\u0135\u0138\u013f\u0141";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}