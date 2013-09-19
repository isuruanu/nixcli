package aqua.nix.cli.dsl;

// Generated from Input.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InputLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, NUM=4, ALPHA=5, WS=6, NL=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'_'", "'-'", "'|'", "NUM", "ALPHA", "WS", "NL"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "NUM", "ALPHA", "WS", "NL"
	};


	public InputLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Input.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6: NL_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void NL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\t*\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\6\5\31\n\5\r\5\16\5\32\3\6\6\6\36\n\6\r\6\16\6\37\3\7\3\7\3\b\6\b"+
		"%\n\b\r\b\16\b&\3\b\3\b\2\t\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t"+
		"\2\3\2\6\3\2\62;\3\2c|\5\2\13\13\17\17\"\"\3\2\f\f,\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3"+
		"\21\3\2\2\2\5\23\3\2\2\2\7\25\3\2\2\2\t\30\3\2\2\2\13\35\3\2\2\2\r!\3"+
		"\2\2\2\17$\3\2\2\2\21\22\7a\2\2\22\4\3\2\2\2\23\24\7/\2\2\24\6\3\2\2\2"+
		"\25\26\7~\2\2\26\b\3\2\2\2\27\31\t\2\2\2\30\27\3\2\2\2\31\32\3\2\2\2\32"+
		"\30\3\2\2\2\32\33\3\2\2\2\33\n\3\2\2\2\34\36\t\3\2\2\35\34\3\2\2\2\36"+
		"\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \f\3\2\2\2!\"\t\4\2\2\"\16\3\2\2"+
		"\2#%\t\5\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\b\b"+
		"\2\2)\20\3\2\2\2\6\2\32\37&";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}