package aqua.nix.cli.dsl;
// Generated from Input.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InputParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, NUM=4, ALPHA=5, WS=6, NL=7;
	public static final String[] tokenNames = {
		"<INVALID>", "'_'", "'-'", "'|'", "NUM", "ALPHA", "WS", "NL"
	};
	public static final int
		RULE_input = 0, RULE_cmd = 1, RULE_id = 2, RULE_arg = 3;
	public static final String[] ruleNames = {
		"input", "cmd", "id", "arg"
	};

	@Override
	public String getGrammarFileName() { return "Input.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public InputParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InputContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(InputParser.WS); }
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode WS(int i) {
			return getToken(InputParser.WS, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(8); match(WS);
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(14); cmd();
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(15); match(WS);
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(21); match(3);
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(22); match(WS);
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(28); cmd();
				}
				}
				setState(33);
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

	public static class CmdContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(InputParser.WS); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public TerminalNode WS(int i) {
			return getToken(InputParser.WS, i);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cmd);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34); id();
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(35); match(WS);
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(42); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(41); match(WS);
						}
						}
						setState(44); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS );
					setState(46); arg();
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class IdContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA() { return getTokens(InputParser.ALPHA); }
		public TerminalNode NUM(int i) {
			return getToken(InputParser.NUM, i);
		}
		public TerminalNode ALPHA(int i) {
			return getToken(InputParser.ALPHA, i);
		}
		public List<TerminalNode> NUM() { return getTokens(InputParser.NUM); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==ALPHA) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << NUM) | (1L << ALPHA))) != 0)) {
				{
				{
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==1 || _la==2) {
					{
					{
					setState(53);
					_la = _input.LA(1);
					if ( !(_la==1 || _la==2) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==ALPHA) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(64);
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

	public static class ArgContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA() { return getTokens(InputParser.ALPHA); }
		public TerminalNode NUM(int i) {
			return getToken(InputParser.NUM, i);
		}
		public TerminalNode ALPHA(int i) {
			return getToken(InputParser.ALPHA, i);
		}
		public List<TerminalNode> NUM() { return getTokens(InputParser.NUM); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InputListener ) ((InputListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==ALPHA) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUM || _la==ALPHA );
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\tI\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\3\2\7\2\23\n\2\f"+
		"\2\16\2\26\13\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\7\2 \n\2\f\2\16"+
		"\2#\13\2\3\3\3\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\6\3-\n\3\r\3\16\3.\3\3\7"+
		"\3\62\n\3\f\3\16\3\65\13\3\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\7\4?\n"+
		"\4\f\4\16\4B\13\4\3\5\6\5E\n\5\r\5\16\5F\3\5\2\6\2\4\6\b\2\4\3\2\6\7\3"+
		"\2\3\4N\2\r\3\2\2\2\4$\3\2\2\2\6\66\3\2\2\2\bD\3\2\2\2\n\f\7\b\2\2\13"+
		"\n\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\20\3\2\2\2\17\r\3"+
		"\2\2\2\20\24\5\4\3\2\21\23\7\b\2\2\22\21\3\2\2\2\23\26\3\2\2\2\24\22\3"+
		"\2\2\2\24\25\3\2\2\2\25!\3\2\2\2\26\24\3\2\2\2\27\33\7\5\2\2\30\32\7\b"+
		"\2\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2"+
		"\2\2\35\33\3\2\2\2\36 \5\4\3\2\37\27\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\""+
		"\3\2\2\2\"\3\3\2\2\2#!\3\2\2\2$(\5\6\4\2%\'\7\b\2\2&%\3\2\2\2\'*\3\2\2"+
		"\2(&\3\2\2\2()\3\2\2\2)\63\3\2\2\2*(\3\2\2\2+-\7\b\2\2,+\3\2\2\2-.\3\2"+
		"\2\2.,\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\62\5\b\5\2\61,\3\2\2\2\62\65\3"+
		"\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\5\3\2\2\2\65\63\3\2\2\2\66@\t\2"+
		"\2\2\679\t\3\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<"+
		":\3\2\2\2=?\t\2\2\2>:\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\7\3\2\2\2"+
		"B@\3\2\2\2CE\t\2\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\t\3\2\2"+
		"\2\f\r\24\33!(.\63:@F";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}