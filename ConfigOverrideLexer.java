// Generated from ConfigOverride.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConfigOverrideLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		QUOTED_VALUE=1, LOPEN=2, LCLOSE=3, COMMA=4, EQ=5, PLUS=6, TILDE=7, INTERPOLATION_START=8, 
		INTERPOLATION_END=9, INT=10, FLOAT=11, BOOL=12, NULL=13, ID=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS_CHAR", "QUOTED_VALUE", "LOPEN", "LCLOSE", "COMMA", "EQ", "PLUS", 
			"TILDE", "INTERPOLATION_START", "INTERPOLATION_END", "INT", "FLOAT", 
			"BOOL", "NULL", "ID_FRAG", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'['", "']'", "','", "'='", "'+'", "'~'", "'${'", "'}'", 
			null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "QUOTED_VALUE", "LOPEN", "LCLOSE", "COMMA", "EQ", "PLUS", "TILDE", 
			"INTERPOLATION_START", "INTERPOLATION_END", "INT", "FLOAT", "BOOL", "NULL", 
			"ID"
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


	public ConfigOverrideLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ConfigOverride.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63"+
		"\13\3\3\3\5\3\66\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\f\5\fJ\n\f\3\f\3\f\3\f\7\fO\n\f\f\f\16\fR\13\f"+
		"\5\fT\n\f\3\r\5\rW\n\r\3\r\6\rZ\n\r\r\r\16\r[\3\r\3\r\6\r`\n\r\r\r\16"+
		"\ra\3\r\3\r\3\r\5\rg\n\r\3\r\3\r\3\r\5\rl\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16w\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\7\20"+
		"\u0080\n\20\f\20\16\20\u0083\13\20\3\21\3\21\3\21\7\21\u0088\n\21\f\21"+
		"\16\21\u008b\13\21\2\2\22\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13"+
		"\27\f\31\r\33\16\35\17\37\2!\20\3\2\n\4\2\13\13\"\"\3\2))\3\2$$\4\2--"+
		"//\3\2\63;\4\2\62;aa\b\2##\'(,,B\\`ac|\t\2##\'(,,\62;B\\`ac|\2\u0097\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2"+
		"\2\t9\3\2\2\2\13;\3\2\2\2\r=\3\2\2\2\17?\3\2\2\2\21A\3\2\2\2\23C\3\2\2"+
		"\2\25F\3\2\2\2\27I\3\2\2\2\31k\3\2\2\2\33v\3\2\2\2\35x\3\2\2\2\37}\3\2"+
		"\2\2!\u0084\3\2\2\2#$\t\2\2\2$\4\3\2\2\2%)\7)\2\2&(\n\3\2\2\'&\3\2\2\2"+
		"(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,\66\7)\2\2-\61\7$"+
		"\2\2.\60\n\4\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62"+
		"\64\3\2\2\2\63\61\3\2\2\2\64\66\7$\2\2\65%\3\2\2\2\65-\3\2\2\2\66\6\3"+
		"\2\2\2\678\7]\2\28\b\3\2\2\29:\7_\2\2:\n\3\2\2\2;<\7.\2\2<\f\3\2\2\2="+
		">\7?\2\2>\16\3\2\2\2?@\7-\2\2@\20\3\2\2\2AB\7\u0080\2\2B\22\3\2\2\2CD"+
		"\7&\2\2DE\7}\2\2E\24\3\2\2\2FG\7\177\2\2G\26\3\2\2\2HJ\t\5\2\2IH\3\2\2"+
		"\2IJ\3\2\2\2JS\3\2\2\2KT\7\62\2\2LP\t\6\2\2MO\t\7\2\2NM\3\2\2\2OR\3\2"+
		"\2\2PN\3\2\2\2PQ\3\2\2\2QT\3\2\2\2RP\3\2\2\2SK\3\2\2\2SL\3\2\2\2T\30\3"+
		"\2\2\2UW\t\5\2\2VU\3\2\2\2VW\3\2\2\2Wf\3\2\2\2XZ\t\7\2\2YX\3\2\2\2Z[\3"+
		"\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]_\7\60\2\2^`\t\7\2\2_^\3\2\2\2"+
		"`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bg\3\2\2\2cd\7k\2\2de\7p\2\2eg\7h\2\2fY"+
		"\3\2\2\2fc\3\2\2\2gl\3\2\2\2hi\7p\2\2ij\7c\2\2jl\7p\2\2kV\3\2\2\2kh\3"+
		"\2\2\2l\32\3\2\2\2mn\7v\2\2no\7t\2\2op\7w\2\2pw\7g\2\2qr\7h\2\2rs\7c\2"+
		"\2st\7n\2\2tu\7u\2\2uw\7g\2\2vm\3\2\2\2vq\3\2\2\2w\34\3\2\2\2xy\7p\2\2"+
		"yz\7w\2\2z{\7n\2\2{|\7n\2\2|\36\3\2\2\2}\u0081\t\b\2\2~\u0080\t\t\2\2"+
		"\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082 \3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0089\5\37\20\2\u0085\u0086"+
		"\7\60\2\2\u0086\u0088\5\37\20\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2"+
		"\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\"\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\21\2)\61\65IPSV[afkv\u0081\u0089\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}