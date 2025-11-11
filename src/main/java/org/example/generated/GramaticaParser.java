// Generated from C:/Users/Thiago Ianuch/Downloads/Projetos/Compilador-com-ANTLR/src/main/antlr/Gramatica.g4 by ANTLR 4.13.2
package org.example.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABRE_PARENTESES=1, FECHA_PARENTESES=2, ABRE_CHAVES=3, FECHA_CHAVES=4, 
		VIRGULA=5, PONTO_VIRGULA=6, SE=7, SENAO=8, ENQUANTO=9, PARA=10, IGUAL=11, 
		DIFERENTE=12, MAIOR_IGUAL=13, MENOR_IGUAL=14, MAIOR=15, MENOR=16, ATRIBUICAO=17, 
		TIPO_INTEIRO=18, TIPO_DECIMAL=19, TIPO_TEXTO=20, TIPO_BOOLEANO=21, NOME=22, 
		INTEIRO=23, DECIMAL=24, BOOLEANO=25, TEXTO=26, ESPACO=27;
	public static final int
		RULE_programa = 0, RULE_bloco = 1, RULE_declaracao = 2, RULE_condicao = 3, 
		RULE_repeticao_para = 4, RULE_repeticao_enquanto = 5, RULE_tipo_variavel = 6, 
		RULE_variavel = 7, RULE_valor = 8, RULE_expressao = 9, RULE_operador = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "bloco", "declaracao", "condicao", "repeticao_para", "repeticao_enquanto", 
			"tipo_variavel", "variavel", "valor", "expressao", "operador"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "','", "';'", "'if'", "'else'", "'while'", 
			"'for'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'='", "'int'", 
			"'float'", "'string'", "'bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABRE_PARENTESES", "FECHA_PARENTESES", "ABRE_CHAVES", "FECHA_CHAVES", 
			"VIRGULA", "PONTO_VIRGULA", "SE", "SENAO", "ENQUANTO", "PARA", "IGUAL", 
			"DIFERENTE", "MAIOR_IGUAL", "MENOR_IGUAL", "MAIOR", "MENOR", "ATRIBUICAO", 
			"TIPO_INTEIRO", "TIPO_DECIMAL", "TIPO_TEXTO", "TIPO_BOOLEANO", "NOME", 
			"INTEIRO", "DECIMAL", "BOOLEANO", "TEXTO", "ESPACO"
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
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GramaticaParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			bloco();
			setState(23);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<CondicaoContext> condicao() {
			return getRuleContexts(CondicaoContext.class);
		}
		public CondicaoContext condicao(int i) {
			return getRuleContext(CondicaoContext.class,i);
		}
		public List<Repeticao_paraContext> repeticao_para() {
			return getRuleContexts(Repeticao_paraContext.class);
		}
		public Repeticao_paraContext repeticao_para(int i) {
			return getRuleContext(Repeticao_paraContext.class,i);
		}
		public List<Repeticao_enquantoContext> repeticao_enquanto() {
			return getRuleContexts(Repeticao_enquantoContext.class);
		}
		public Repeticao_enquantoContext repeticao_enquanto(int i) {
			return getRuleContext(Repeticao_enquantoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3933824L) != 0)) {
				{
				setState(29);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIPO_INTEIRO:
				case TIPO_DECIMAL:
				case TIPO_TEXTO:
				case TIPO_BOOLEANO:
					{
					setState(25);
					declaracao();
					}
					break;
				case SE:
					{
					setState(26);
					condicao();
					}
					break;
				case PARA:
					{
					setState(27);
					repeticao_para();
					}
					break;
				case ENQUANTO:
					{
					setState(28);
					repeticao_enquanto();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoContext extends ParserRuleContext {
		public Tipo_variavelContext tipo_variavel() {
			return getRuleContext(Tipo_variavelContext.class,0);
		}
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public TerminalNode PONTO_VIRGULA() { return getToken(GramaticaParser.PONTO_VIRGULA, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(GramaticaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(GramaticaParser.VIRGULA, i);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			tipo_variavel();
			setState(35);
			variavel();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(36);
				match(VIRGULA);
				setState(37);
				variavel();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(PONTO_VIRGULA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicaoContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(GramaticaParser.SE, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(GramaticaParser.ABRE_PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(GramaticaParser.FECHA_PARENTESES, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(GramaticaParser.ABRE_CHAVES, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FECHA_CHAVES() { return getToken(GramaticaParser.FECHA_CHAVES, 0); }
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCondicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCondicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(SE);
			setState(46);
			match(ABRE_PARENTESES);
			setState(47);
			expressao();
			setState(48);
			match(FECHA_PARENTESES);
			setState(49);
			match(ABRE_CHAVES);
			setState(50);
			bloco();
			setState(51);
			match(FECHA_CHAVES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Repeticao_paraContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(GramaticaParser.PARA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(GramaticaParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(GramaticaParser.FECHA_PARENTESES, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(GramaticaParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(GramaticaParser.FECHA_CHAVES, 0); }
		public Repeticao_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRepeticao_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRepeticao_para(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRepeticao_para(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeticao_paraContext repeticao_para() throws RecognitionException {
		Repeticao_paraContext _localctx = new Repeticao_paraContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_repeticao_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(PARA);
			setState(54);
			match(ABRE_PARENTESES);
			setState(55);
			match(FECHA_PARENTESES);
			setState(56);
			match(ABRE_CHAVES);
			setState(57);
			match(FECHA_CHAVES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Repeticao_enquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(GramaticaParser.ENQUANTO, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(GramaticaParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(GramaticaParser.FECHA_PARENTESES, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(GramaticaParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(GramaticaParser.FECHA_CHAVES, 0); }
		public Repeticao_enquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRepeticao_enquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRepeticao_enquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRepeticao_enquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeticao_enquantoContext repeticao_enquanto() throws RecognitionException {
		Repeticao_enquantoContext _localctx = new Repeticao_enquantoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_repeticao_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ENQUANTO);
			setState(60);
			match(ABRE_PARENTESES);
			setState(61);
			match(FECHA_PARENTESES);
			setState(62);
			match(ABRE_CHAVES);
			setState(63);
			match(FECHA_CHAVES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_variavelContext extends ParserRuleContext {
		public TerminalNode TIPO_INTEIRO() { return getToken(GramaticaParser.TIPO_INTEIRO, 0); }
		public TerminalNode TIPO_DECIMAL() { return getToken(GramaticaParser.TIPO_DECIMAL, 0); }
		public TerminalNode TIPO_TEXTO() { return getToken(GramaticaParser.TIPO_TEXTO, 0); }
		public TerminalNode TIPO_BOOLEANO() { return getToken(GramaticaParser.TIPO_BOOLEANO, 0); }
		public Tipo_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTipo_variavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTipo_variavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTipo_variavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_variavelContext tipo_variavel() throws RecognitionException {
		Tipo_variavelContext _localctx = new Tipo_variavelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariavelContext extends ParserRuleContext {
		public TerminalNode NOME() { return getToken(GramaticaParser.NOME, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(GramaticaParser.ATRIBUICAO, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(NOME);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATRIBUICAO) {
				{
				setState(68);
				match(ATRIBUICAO);
				setState(69);
				valor();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValorContext extends ParserRuleContext {
		public TerminalNode INTEIRO() { return getToken(GramaticaParser.INTEIRO, 0); }
		public TerminalNode DECIMAL() { return getToken(GramaticaParser.DECIMAL, 0); }
		public TerminalNode BOOLEANO() { return getToken(GramaticaParser.BOOLEANO, 0); }
		public TerminalNode TEXTO() { return getToken(GramaticaParser.TEXTO, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public List<TerminalNode> NOME() { return getTokens(GramaticaParser.NOME); }
		public TerminalNode NOME(int i) {
			return getToken(GramaticaParser.NOME, i);
		}
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOME:
				{
				setState(74);
				match(NOME);
				}
				break;
			case INTEIRO:
			case DECIMAL:
			case BOOLEANO:
			case TEXTO:
				{
				setState(75);
				valor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(78);
			operador();
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOME:
				{
				setState(79);
				match(NOME);
				}
				break;
			case INTEIRO:
			case DECIMAL:
			case BOOLEANO:
			case TEXTO:
				{
				setState(80);
				valor();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(GramaticaParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(GramaticaParser.DIFERENTE, 0); }
		public TerminalNode MAIOR() { return getToken(GramaticaParser.MAIOR, 0); }
		public TerminalNode MENOR() { return getToken(GramaticaParser.MENOR, 0); }
		public TerminalNode MAIOR_IGUAL() { return getToken(GramaticaParser.MAIOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(GramaticaParser.MENOR_IGUAL, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitOperador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 129024L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u001bV\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001e"+
		"\b\u0001\n\u0001\f\u0001!\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002\'\b\u0002\n\u0002\f\u0002*\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007G\b\u0007\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0003\tM\b\t\u0001\t\u0001\t\u0001\t\u0003\tR\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0000\u0003\u0001\u0000\u0012\u0015\u0001\u0000\u0017\u001a"+
		"\u0001\u0000\u000b\u0010R\u0000\u0016\u0001\u0000\u0000\u0000\u0002\u001f"+
		"\u0001\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000\u0006-\u0001"+
		"\u0000\u0000\u0000\b5\u0001\u0000\u0000\u0000\n;\u0001\u0000\u0000\u0000"+
		"\fA\u0001\u0000\u0000\u0000\u000eC\u0001\u0000\u0000\u0000\u0010H\u0001"+
		"\u0000\u0000\u0000\u0012L\u0001\u0000\u0000\u0000\u0014S\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u0018\u0005\u0000\u0000"+
		"\u0001\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u001e\u0003\u0004\u0002"+
		"\u0000\u001a\u001e\u0003\u0006\u0003\u0000\u001b\u001e\u0003\b\u0004\u0000"+
		"\u001c\u001e\u0003\n\u0005\u0000\u001d\u0019\u0001\u0000\u0000\u0000\u001d"+
		"\u001a\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d"+
		"\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u0003\u0001\u0000"+
		"\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0003\f\u0006\u0000#(\u0003"+
		"\u000e\u0007\u0000$%\u0005\u0005\u0000\u0000%\'\u0003\u000e\u0007\u0000"+
		"&$\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000"+
		"\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000*(\u0001\u0000"+
		"\u0000\u0000+,\u0005\u0006\u0000\u0000,\u0005\u0001\u0000\u0000\u0000"+
		"-.\u0005\u0007\u0000\u0000./\u0005\u0001\u0000\u0000/0\u0003\u0012\t\u0000"+
		"01\u0005\u0002\u0000\u000012\u0005\u0003\u0000\u000023\u0003\u0002\u0001"+
		"\u000034\u0005\u0004\u0000\u00004\u0007\u0001\u0000\u0000\u000056\u0005"+
		"\n\u0000\u000067\u0005\u0001\u0000\u000078\u0005\u0002\u0000\u000089\u0005"+
		"\u0003\u0000\u00009:\u0005\u0004\u0000\u0000:\t\u0001\u0000\u0000\u0000"+
		";<\u0005\t\u0000\u0000<=\u0005\u0001\u0000\u0000=>\u0005\u0002\u0000\u0000"+
		">?\u0005\u0003\u0000\u0000?@\u0005\u0004\u0000\u0000@\u000b\u0001\u0000"+
		"\u0000\u0000AB\u0007\u0000\u0000\u0000B\r\u0001\u0000\u0000\u0000CF\u0005"+
		"\u0016\u0000\u0000DE\u0005\u0011\u0000\u0000EG\u0003\u0010\b\u0000FD\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\u000f\u0001\u0000\u0000"+
		"\u0000HI\u0007\u0001\u0000\u0000I\u0011\u0001\u0000\u0000\u0000JM\u0005"+
		"\u0016\u0000\u0000KM\u0003\u0010\b\u0000LJ\u0001\u0000\u0000\u0000LK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NQ\u0003\u0014\n\u0000OR\u0005"+
		"\u0016\u0000\u0000PR\u0003\u0010\b\u0000QO\u0001\u0000\u0000\u0000QP\u0001"+
		"\u0000\u0000\u0000R\u0013\u0001\u0000\u0000\u0000ST\u0007\u0002\u0000"+
		"\u0000T\u0015\u0001\u0000\u0000\u0000\u0006\u001d\u001f(FLQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}