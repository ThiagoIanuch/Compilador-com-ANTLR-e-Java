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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, DEPURAR=8, SE=9, 
		ENTRADA=10, SOMA=11, SUBTRACAO=12, MULTIPLICACAO=13, DIVISAO=14, IGUAL=15, 
		DIFERENTE=16, MAIOR_IGUAL=17, MENOR_IGUAL=18, MAIOR=19, MENOR=20, ATRIBUICAO=21, 
		TIPO_INTEIRO=22, TIPO_DECIMAL=23, TIPO_TEXTO=24, TIPO_BOOLEANO=25, INTEIRO=26, 
		DECIMAL=27, TEXTO=28, BOOLEANO=29, NOME=30, ESPACO=31, COMENTARIO_LINHA=32, 
		COMENTARIO_BLOCO=33;
	public static final int
		RULE_programa = 0, RULE_depurar = 1, RULE_bloco = 2, RULE_declaracao = 3, 
		RULE_atribuicao = 4, RULE_condicao = 5, RULE_imprimir = 6, RULE_tipo_variavel = 7, 
		RULE_variavel = 8, RULE_valor = 9, RULE_atribuicao_simples = 10, RULE_expressao_aritmetica = 11, 
		RULE_termo = 12, RULE_fator = 13, RULE_expressao_booleana = 14, RULE_operador = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "depurar", "bloco", "declaracao", "atribuicao", "condicao", 
			"imprimir", "tipo_variavel", "variavel", "valor", "atribuicao_simples", 
			"expressao_aritmetica", "termo", "fator", "expressao_booleana", "operador"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "';'", "'('", "')'", "'{'", "'}'", "'<<'", "'--debug'", 
			"'if'", "'cout'", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", "'>='", 
			"'<='", "'>'", "'<'", "'='", "'int'", "'float'", "'string'", "'bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "DEPURAR", "SE", "ENTRADA", 
			"SOMA", "SUBTRACAO", "MULTIPLICACAO", "DIVISAO", "IGUAL", "DIFERENTE", 
			"MAIOR_IGUAL", "MENOR_IGUAL", "MAIOR", "MENOR", "ATRIBUICAO", "TIPO_INTEIRO", 
			"TIPO_DECIMAL", "TIPO_TEXTO", "TIPO_BOOLEANO", "INTEIRO", "DECIMAL", 
			"TEXTO", "BOOLEANO", "NOME", "ESPACO", "COMENTARIO_LINHA", "COMENTARIO_BLOCO"
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
		public DepurarContext depurar() {
			return getRuleContext(DepurarContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEPURAR) {
				{
				setState(32);
				depurar();
				}
			}

			setState(35);
			bloco();
			setState(36);
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
	public static class DepurarContext extends ParserRuleContext {
		public TerminalNode DEPURAR() { return getToken(GramaticaParser.DEPURAR, 0); }
		public DepurarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_depurar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDepurar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDepurar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDepurar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DepurarContext depurar() throws RecognitionException {
		DepurarContext _localctx = new DepurarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_depurar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(DEPURAR);
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
		public List<AtribuicaoContext> atribuicao() {
			return getRuleContexts(AtribuicaoContext.class);
		}
		public AtribuicaoContext atribuicao(int i) {
			return getRuleContext(AtribuicaoContext.class,i);
		}
		public List<CondicaoContext> condicao() {
			return getRuleContexts(CondicaoContext.class);
		}
		public CondicaoContext condicao(int i) {
			return getRuleContext(CondicaoContext.class,i);
		}
		public List<ImprimirContext> imprimir() {
			return getRuleContexts(ImprimirContext.class);
		}
		public ImprimirContext imprimir(int i) {
			return getRuleContext(ImprimirContext.class,i);
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
		enterRule(_localctx, 4, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1136657920L) != 0)) {
				{
				setState(44);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIPO_INTEIRO:
				case TIPO_DECIMAL:
				case TIPO_TEXTO:
				case TIPO_BOOLEANO:
					{
					setState(40);
					declaracao();
					}
					break;
				case NOME:
					{
					setState(41);
					atribuicao();
					}
					break;
				case SE:
					{
					setState(42);
					condicao();
					}
					break;
				case ENTRADA:
					{
					setState(43);
					imprimir();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(48);
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
		enterRule(_localctx, 6, RULE_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			tipo_variavel();
			setState(50);
			variavel();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(51);
				match(T__0);
				setState(52);
				variavel();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public List<Atribuicao_simplesContext> atribuicao_simples() {
			return getRuleContexts(Atribuicao_simplesContext.class);
		}
		public Atribuicao_simplesContext atribuicao_simples(int i) {
			return getRuleContext(Atribuicao_simplesContext.class,i);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			atribuicao_simples();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(61);
				match(T__0);
				setState(62);
				atribuicao_simples();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicaoContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(GramaticaParser.SE, 0); }
		public Expressao_booleanaContext expressao_booleana() {
			return getRuleContext(Expressao_booleanaContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(SE);
			setState(71);
			match(T__2);
			setState(72);
			expressao_booleana();
			setState(73);
			match(T__3);
			setState(74);
			match(T__4);
			setState(75);
			bloco();
			setState(76);
			match(T__5);
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
	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode ENTRADA() { return getToken(GramaticaParser.ENTRADA, 0); }
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitImprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_imprimir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ENTRADA);
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				match(T__6);
				setState(80);
				valor();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(85);
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
		enterRule(_localctx, 14, RULE_tipo_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) ) {
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
		enterRule(_localctx, 16, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(NOME);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATRIBUICAO) {
				{
				setState(90);
				match(ATRIBUICAO);
				setState(91);
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
		public TerminalNode NOME() { return getToken(GramaticaParser.NOME, 0); }
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_valor);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(NOME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				expressao_aritmetica();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(BOOLEANO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(TEXTO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Atribuicao_simplesContext extends ParserRuleContext {
		public TerminalNode NOME() { return getToken(GramaticaParser.NOME, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(GramaticaParser.ATRIBUICAO, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public Atribuicao_simplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_simples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAtribuicao_simples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAtribuicao_simples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAtribuicao_simples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atribuicao_simplesContext atribuicao_simples() throws RecognitionException {
		Atribuicao_simplesContext _localctx = new Atribuicao_simplesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atribuicao_simples);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(NOME);
			setState(101);
			match(ATRIBUICAO);
			setState(102);
			valor();
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
	public static class Expressao_aritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> SOMA() { return getTokens(GramaticaParser.SOMA); }
		public TerminalNode SOMA(int i) {
			return getToken(GramaticaParser.SOMA, i);
		}
		public List<TerminalNode> SUBTRACAO() { return getTokens(GramaticaParser.SUBTRACAO); }
		public TerminalNode SUBTRACAO(int i) {
			return getToken(GramaticaParser.SUBTRACAO, i);
		}
		public Expressao_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressao_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressao_aritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExpressao_aritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_aritmeticaContext expressao_aritmetica() throws RecognitionException {
		Expressao_aritmeticaContext _localctx = new Expressao_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressao_aritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			termo();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SOMA || _la==SUBTRACAO) {
				{
				{
				setState(105);
				_la = _input.LA(1);
				if ( !(_la==SOMA || _la==SUBTRACAO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(106);
				termo();
				}
				}
				setState(111);
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
	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> MULTIPLICACAO() { return getTokens(GramaticaParser.MULTIPLICACAO); }
		public TerminalNode MULTIPLICACAO(int i) {
			return getToken(GramaticaParser.MULTIPLICACAO, i);
		}
		public List<TerminalNode> DIVISAO() { return getTokens(GramaticaParser.DIVISAO); }
		public TerminalNode DIVISAO(int i) {
			return getToken(GramaticaParser.DIVISAO, i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			fator();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICACAO || _la==DIVISAO) {
				{
				{
				setState(113);
				_la = _input.LA(1);
				if ( !(_la==MULTIPLICACAO || _la==DIVISAO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(114);
				fator();
				}
				}
				setState(119);
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
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode NOME() { return getToken(GramaticaParser.NOME, 0); }
		public TerminalNode INTEIRO() { return getToken(GramaticaParser.INTEIRO, 0); }
		public TerminalNode DECIMAL() { return getToken(GramaticaParser.DECIMAL, 0); }
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fator);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOME:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(NOME);
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(INTEIRO);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				match(DECIMAL);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(T__2);
				setState(124);
				expressao_aritmetica();
				setState(125);
				match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_booleanaContext extends ParserRuleContext {
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
		public Expressao_booleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_booleana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressao_booleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressao_booleana(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExpressao_booleana(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_booleanaContext expressao_booleana() throws RecognitionException {
		Expressao_booleanaContext _localctx = new Expressao_booleanaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressao_booleana);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(129);
				match(NOME);
				}
				break;
			case 2:
				{
				setState(130);
				valor();
				}
				break;
			}
			setState(133);
			operador();
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(134);
				match(NOME);
				}
				break;
			case 2:
				{
				setState(135);
				valor();
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
		enterRule(_localctx, 30, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2064384L) != 0)) ) {
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
		"\u0004\u0001!\u008d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0003\u0000\"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002-\b\u0002\n\u0002\f\u00020\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u00036\b\u0003\n\u0003\f\u00039\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"@\b\u0004\n\u0004\f\u0004C\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006R\b\u0006"+
		"\u000b\u0006\f\u0006S\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0003\b]\b\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0003\tc\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000bl\b\u000b\n\u000b\f\u000bo\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0005\ft\b\f\n\f\f\fw\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0080\b\r\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0084\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0089\b"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		"\u0000\u0004\u0001\u0000\u0016\u0019\u0001\u0000\u000b\f\u0001\u0000\r"+
		"\u000e\u0001\u0000\u000f\u0014\u008f\u0000!\u0001\u0000\u0000\u0000\u0002"+
		"&\u0001\u0000\u0000\u0000\u0004.\u0001\u0000\u0000\u0000\u00061\u0001"+
		"\u0000\u0000\u0000\b<\u0001\u0000\u0000\u0000\nF\u0001\u0000\u0000\u0000"+
		"\fN\u0001\u0000\u0000\u0000\u000eW\u0001\u0000\u0000\u0000\u0010Y\u0001"+
		"\u0000\u0000\u0000\u0012b\u0001\u0000\u0000\u0000\u0014d\u0001\u0000\u0000"+
		"\u0000\u0016h\u0001\u0000\u0000\u0000\u0018p\u0001\u0000\u0000\u0000\u001a"+
		"\u007f\u0001\u0000\u0000\u0000\u001c\u0083\u0001\u0000\u0000\u0000\u001e"+
		"\u008a\u0001\u0000\u0000\u0000 \"\u0003\u0002\u0001\u0000! \u0001\u0000"+
		"\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0003"+
		"\u0004\u0002\u0000$%\u0005\u0000\u0000\u0001%\u0001\u0001\u0000\u0000"+
		"\u0000&\'\u0005\b\u0000\u0000\'\u0003\u0001\u0000\u0000\u0000(-\u0003"+
		"\u0006\u0003\u0000)-\u0003\b\u0004\u0000*-\u0003\n\u0005\u0000+-\u0003"+
		"\f\u0006\u0000,(\u0001\u0000\u0000\u0000,)\u0001\u0000\u0000\u0000,*\u0001"+
		"\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/\u0005\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000012\u0003\u000e\u0007\u000027\u0003"+
		"\u0010\b\u000034\u0005\u0001\u0000\u000046\u0003\u0010\b\u000053\u0001"+
		"\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u0000:;\u0005\u0002\u0000\u0000;\u0007\u0001\u0000\u0000\u0000<A\u0003"+
		"\u0014\n\u0000=>\u0005\u0001\u0000\u0000>@\u0003\u0014\n\u0000?=\u0001"+
		"\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000DE\u0005\u0002\u0000\u0000E\t\u0001\u0000\u0000\u0000FG\u0005\t"+
		"\u0000\u0000GH\u0005\u0003\u0000\u0000HI\u0003\u001c\u000e\u0000IJ\u0005"+
		"\u0004\u0000\u0000JK\u0005\u0005\u0000\u0000KL\u0003\u0004\u0002\u0000"+
		"LM\u0005\u0006\u0000\u0000M\u000b\u0001\u0000\u0000\u0000NQ\u0005\n\u0000"+
		"\u0000OP\u0005\u0007\u0000\u0000PR\u0003\u0012\t\u0000QO\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0005\u0002\u0000\u0000V\r\u0001"+
		"\u0000\u0000\u0000WX\u0007\u0000\u0000\u0000X\u000f\u0001\u0000\u0000"+
		"\u0000Y\\\u0005\u001e\u0000\u0000Z[\u0005\u0015\u0000\u0000[]\u0003\u0012"+
		"\t\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u0011"+
		"\u0001\u0000\u0000\u0000^c\u0005\u001e\u0000\u0000_c\u0003\u0016\u000b"+
		"\u0000`c\u0005\u001d\u0000\u0000ac\u0005\u001c\u0000\u0000b^\u0001\u0000"+
		"\u0000\u0000b_\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ba\u0001"+
		"\u0000\u0000\u0000c\u0013\u0001\u0000\u0000\u0000de\u0005\u001e\u0000"+
		"\u0000ef\u0005\u0015\u0000\u0000fg\u0003\u0012\t\u0000g\u0015\u0001\u0000"+
		"\u0000\u0000hm\u0003\u0018\f\u0000ij\u0007\u0001\u0000\u0000jl\u0003\u0018"+
		"\f\u0000ki\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000n\u0017\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000pu\u0003\u001a\r\u0000qr\u0007\u0002\u0000\u0000"+
		"rt\u0003\u001a\r\u0000sq\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0019\u0001\u0000"+
		"\u0000\u0000wu\u0001\u0000\u0000\u0000x\u0080\u0005\u001e\u0000\u0000"+
		"y\u0080\u0005\u001a\u0000\u0000z\u0080\u0005\u001b\u0000\u0000{|\u0005"+
		"\u0003\u0000\u0000|}\u0003\u0016\u000b\u0000}~\u0005\u0004\u0000\u0000"+
		"~\u0080\u0001\u0000\u0000\u0000\u007fx\u0001\u0000\u0000\u0000\u007fy"+
		"\u0001\u0000\u0000\u0000\u007fz\u0001\u0000\u0000\u0000\u007f{\u0001\u0000"+
		"\u0000\u0000\u0080\u001b\u0001\u0000\u0000\u0000\u0081\u0084\u0005\u001e"+
		"\u0000\u0000\u0082\u0084\u0003\u0012\t\u0000\u0083\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000"+
		"\u0000\u0085\u0088\u0003\u001e\u000f\u0000\u0086\u0089\u0005\u001e\u0000"+
		"\u0000\u0087\u0089\u0003\u0012\t\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u001d\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0007\u0003\u0000\u0000\u008b\u001f\u0001\u0000\u0000\u0000"+
		"\r!,.7AS\\bmu\u007f\u0083\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}