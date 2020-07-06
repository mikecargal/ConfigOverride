// Generated from /Users/mike/ANTLRHelp/ConfigOverride.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConfigOverrideParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		QUOTED_VALUE=1, LOPEN=2, LCLOSE=3, COMMA=4, EQ=5, PLUS=6, TILDE=7, INTERPOLATION_START=8, 
		INTERPOLATION_END=9, INT=10, FLOAT=11, BOOL=12, NULL=13, ID=14;
	public static final int
		RULE_interpolation = 0, RULE_value = 1, RULE_list_value = 2, RULE_choice_sweep = 3, 
		RULE_override_key = 4, RULE_override = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"interpolation", "value", "list_value", "choice_sweep", "override_key", 
			"override"
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

	@Override
	public String getGrammarFileName() { return "ConfigOverride.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ConfigOverrideParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InterpolationContext extends ParserRuleContext {
		public TerminalNode INTERPOLATION_START() { return getToken(ConfigOverrideParser.INTERPOLATION_START, 0); }
		public TerminalNode INTERPOLATION_END() { return getToken(ConfigOverrideParser.INTERPOLATION_END, 0); }
		public TerminalNode ID() { return getToken(ConfigOverrideParser.ID, 0); }
		public TerminalNode QUOTED_VALUE() { return getToken(ConfigOverrideParser.QUOTED_VALUE, 0); }
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_interpolation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(INTERPOLATION_START);
			setState(13);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_VALUE || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(14);
			match(INTERPOLATION_END);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(ConfigOverrideParser.NULL, 0); }
		public TerminalNode INT() { return getToken(ConfigOverrideParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ConfigOverrideParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(ConfigOverrideParser.BOOL, 0); }
		public TerminalNode QUOTED_VALUE() { return getToken(ConfigOverrideParser.QUOTED_VALUE, 0); }
		public TerminalNode ID() { return getToken(ConfigOverrideParser.ID, 0); }
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public List_valueContext list_value() {
			return getRuleContext(List_valueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_value);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(NULL);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				match(FLOAT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(19);
				match(BOOL);
				}
				break;
			case QUOTED_VALUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(20);
				match(QUOTED_VALUE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(21);
				match(ID);
				}
				break;
			case INTERPOLATION_START:
				enterOuterAlt(_localctx, 7);
				{
				setState(22);
				interpolation();
				}
				break;
			case LOPEN:
				enterOuterAlt(_localctx, 8);
				{
				setState(23);
				list_value();
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

	public static class List_valueContext extends ParserRuleContext {
		public TerminalNode LOPEN() { return getToken(ConfigOverrideParser.LOPEN, 0); }
		public TerminalNode LCLOSE() { return getToken(ConfigOverrideParser.LCLOSE, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ConfigOverrideParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ConfigOverrideParser.COMMA, i);
		}
		public List_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_value; }
	}

	public final List_valueContext list_value() throws RecognitionException {
		List_valueContext _localctx = new List_valueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_list_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(LOPEN);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUOTED_VALUE) | (1L << LOPEN) | (1L << INTERPOLATION_START) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << NULL) | (1L << ID))) != 0)) {
				{
				setState(27);
				value();
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(28);
					match(COMMA);
					setState(29);
					value();
					}
					}
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(37);
			match(LCLOSE);
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

	public static class Choice_sweepContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ConfigOverrideParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ConfigOverrideParser.COMMA, i);
		}
		public Choice_sweepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice_sweep; }
	}

	public final Choice_sweepContext choice_sweep() throws RecognitionException {
		Choice_sweepContext _localctx = new Choice_sweepContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_choice_sweep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			value();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(40);
				match(COMMA);
				setState(41);
				value();
				}
				}
				setState(46);
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

	public static class Override_keyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ConfigOverrideParser.ID, 0); }
		public TerminalNode QUOTED_VALUE() { return getToken(ConfigOverrideParser.QUOTED_VALUE, 0); }
		public Override_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_override_key; }
	}

	public final Override_keyContext override_key() throws RecognitionException {
		Override_keyContext _localctx = new Override_keyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_override_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_VALUE || _la==ID) ) {
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

	public static class OverrideContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ConfigOverrideParser.EOF, 0); }
		public Override_keyContext override_key() {
			return getRuleContext(Override_keyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(ConfigOverrideParser.EQ, 0); }
		public Choice_sweepContext choice_sweep() {
			return getRuleContext(Choice_sweepContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(ConfigOverrideParser.TILDE, 0); }
		public TerminalNode PLUS() { return getToken(ConfigOverrideParser.PLUS, 0); }
		public OverrideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_override; }
	}

	public final OverrideContext override() throws RecognitionException {
		OverrideContext _localctx = new OverrideContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_override);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_VALUE:
			case ID:
				{
				setState(49);
				override_key();
				setState(50);
				match(EQ);
				setState(51);
				choice_sweep();
				}
				break;
			case PLUS:
				{
				{
				setState(53);
				match(PLUS);
				setState(54);
				override_key();
				setState(55);
				match(EQ);
				setState(56);
				choice_sweep();
				}
				}
				break;
			case TILDE:
				{
				setState(58);
				match(TILDE);
				setState(59);
				override_key();
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(60);
					match(EQ);
					setState(61);
					choice_sweep();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(66);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20G\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\7\4!\n\4\f\4\16\4$\13\4\5\4&\n"+
		"\4\3\4\3\4\3\5\3\5\3\5\7\5-\n\5\f\5\16\5\60\13\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7A\n\7\5\7C\n\7\3\7\3\7\3\7\2"+
		"\2\b\2\4\6\b\n\f\2\3\4\2\3\3\20\20\2M\2\16\3\2\2\2\4\32\3\2\2\2\6\34\3"+
		"\2\2\2\b)\3\2\2\2\n\61\3\2\2\2\fB\3\2\2\2\16\17\7\n\2\2\17\20\t\2\2\2"+
		"\20\21\7\13\2\2\21\3\3\2\2\2\22\33\7\17\2\2\23\33\7\f\2\2\24\33\7\r\2"+
		"\2\25\33\7\16\2\2\26\33\7\3\2\2\27\33\7\20\2\2\30\33\5\2\2\2\31\33\5\6"+
		"\4\2\32\22\3\2\2\2\32\23\3\2\2\2\32\24\3\2\2\2\32\25\3\2\2\2\32\26\3\2"+
		"\2\2\32\27\3\2\2\2\32\30\3\2\2\2\32\31\3\2\2\2\33\5\3\2\2\2\34%\7\4\2"+
		"\2\35\"\5\4\3\2\36\37\7\6\2\2\37!\5\4\3\2 \36\3\2\2\2!$\3\2\2\2\" \3\2"+
		"\2\2\"#\3\2\2\2#&\3\2\2\2$\"\3\2\2\2%\35\3\2\2\2%&\3\2\2\2&\'\3\2\2\2"+
		"\'(\7\5\2\2(\7\3\2\2\2).\5\4\3\2*+\7\6\2\2+-\5\4\3\2,*\3\2\2\2-\60\3\2"+
		"\2\2.,\3\2\2\2./\3\2\2\2/\t\3\2\2\2\60.\3\2\2\2\61\62\t\2\2\2\62\13\3"+
		"\2\2\2\63\64\5\n\6\2\64\65\7\7\2\2\65\66\5\b\5\2\66C\3\2\2\2\678\7\b\2"+
		"\289\5\n\6\29:\7\7\2\2:;\5\b\5\2;C\3\2\2\2<=\7\t\2\2=@\5\n\6\2>?\7\7\2"+
		"\2?A\5\b\5\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B\63\3\2\2\2B\67\3\2\2\2B<\3"+
		"\2\2\2CD\3\2\2\2DE\7\2\2\3E\r\3\2\2\2\b\32\"%.@B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}