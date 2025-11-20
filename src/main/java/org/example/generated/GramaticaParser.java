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
		SENAO=10, PARA=11, ENQUANTO=12, IMPRIMIR=13, LER=14, SOMA=15, SUBTRACAO=16, 
		MULTIPLICACAO=17, DIVISAO=18, IGUAL=19, DIFERENTE=20, MAIOR_IGUAL=21, 
		MENOR_IGUAL=22, MAIOR=23, MENOR=24, ATRIBUICAO=25, SAIDA=26, ENTRADA=27, 
		TIPO_INTEIRO=28, TIPO_DECIMAL=29, TIPO_TEXTO=30, TIPO_BOOLEANO=31, INTEIRO=32, 
		DECIMAL=33, TEXTO=34, BOOLEANO=35, NOME=36, ESPACO=37, COMENTARIO_LINHA=38, 
		COMENTARIO_BLOCO=39;
	public static final int
		RULE_programa = 0, RULE_depurar = 1, RULE_bloco = 2, RULE_declaracao = 3, 
		RULE_atribuicao = 4, RULE_condicao = 5, RULE_repeticao_enquanto = 6, RULE_imprimir = 7, 
		RULE_ler = 8, RULE_tipo_variavel = 9, RULE_variavel = 10, RULE_valor = 11, 
		RULE_atribuicao_simples = 12, RULE_expressao_aritmetica = 13, RULE_termo = 14, 
		RULE_fator = 15, RULE_expressao_booleana = 16, RULE_operador = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "depurar", "bloco", "declaracao", "atribuicao", "condicao", 
			"repeticao_enquanto", "imprimir", "ler", "tipo_variavel", "variavel", 
			"valor", "atribuicao_simples", "expressao_aritmetica", "termo", "fator", 
			"expressao_booleana", "operador"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'BeginPlay()'", "'{'", "'}'", "','", "';'", "'('", "')'", "'--debug'", 
			"'if'", "'else'", "'for'", "'while'", "'cout'", "'cin'", "'+'", "'-'", 
			"'*'", "'/'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'='", "'<<'", 
			"'>>'", "'int'", "'float'", "'string'", "'bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "DEPURAR", "SE", "SENAO", 
			"PARA", "ENQUANTO", "IMPRIMIR", "LER", "SOMA", "SUBTRACAO", "MULTIPLICACAO", 
			"DIVISAO", "IGUAL", "DIFERENTE", "MAIOR_IGUAL", "MENOR_IGUAL", "MAIOR", 
			"MENOR", "ATRIBUICAO", "SAIDA", "ENTRADA", "TIPO_INTEIRO", "TIPO_DECIMAL", 
			"TIPO_TEXTO", "TIPO_BOOLEANO", "INTEIRO", "DECIMAL", "TEXTO", "BOOLEANO", 
			"NOME", "ESPACO", "COMENTARIO_LINHA", "COMENTARIO_BLOCO"
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEPURAR) {
				{
				setState(36);
				depurar();
				}
			}

			setState(39);
			match(T__0);
			setState(40);
			match(T__1);
			setState(41);
			bloco();
			setState(42);
			match(T__2);
			setState(43);
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
			setState(45);
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
		public List<Repeticao_enquantoContext> repeticao_enquanto() {
			return getRuleContexts(Repeticao_enquantoContext.class);
		}
		public Repeticao_enquantoContext repeticao_enquanto(int i) {
			return getRuleContext(Repeticao_enquantoContext.class,i);
		}
		public List<ImprimirContext> imprimir() {
			return getRuleContexts(ImprimirContext.class);
		}
		public ImprimirContext imprimir(int i) {
			return getRuleContext(ImprimirContext.class,i);
		}
		public List<LerContext> ler() {
			return getRuleContexts(LerContext.class);
		}
		public LerContext ler(int i) {
			return getRuleContext(LerContext.class,i);
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72746037760L) != 0)) {
				{
				setState(53);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIPO_INTEIRO:
				case TIPO_DECIMAL:
				case TIPO_TEXTO:
				case TIPO_BOOLEANO:
					{
					setState(47);
					declaracao();
					}
					break;
				case NOME:
					{
					setState(48);
					atribuicao();
					}
					break;
				case SE:
					{
					setState(49);
					condicao();
					}
					break;
				case ENQUANTO:
					{
					setState(50);
					repeticao_enquanto();
					}
					break;
				case IMPRIMIR:
					{
					setState(51);
					imprimir();
					}
					break;
				case LER:
					{
					setState(52);
					ler();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(57);
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
			setState(58);
			tipo_variavel();
			setState(59);
			variavel();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(60);
				match(T__3);
				setState(61);
				variavel();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(T__4);
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
			setState(69);
			atribuicao_simples();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(70);
				match(T__3);
				setState(71);
				atribuicao_simples();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(T__4);
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
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(GramaticaParser.SENAO, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(SE);
			setState(80);
			match(T__5);
			setState(81);
			expressao_booleana();
			setState(82);
			match(T__6);
			setState(83);
			match(T__1);
			setState(84);
			bloco();
			setState(85);
			match(T__2);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(86);
				match(SENAO);
				setState(87);
				match(T__1);
				setState(88);
				bloco();
				setState(89);
				match(T__2);
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
	public static class Repeticao_enquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(GramaticaParser.ENQUANTO, 0); }
		public Expressao_booleanaContext expressao_booleana() {
			return getRuleContext(Expressao_booleanaContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_repeticao_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ENQUANTO);
			setState(94);
			match(T__5);
			setState(95);
			expressao_booleana();
			setState(96);
			match(T__6);
			setState(97);
			match(T__1);
			setState(98);
			bloco();
			setState(99);
			match(T__2);
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
		public TerminalNode IMPRIMIR() { return getToken(GramaticaParser.IMPRIMIR, 0); }
		public List<TerminalNode> SAIDA() { return getTokens(GramaticaParser.SAIDA); }
		public TerminalNode SAIDA(int i) {
			return getToken(GramaticaParser.SAIDA, i);
		}
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
		enterRule(_localctx, 14, RULE_imprimir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(IMPRIMIR);
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				match(SAIDA);
				setState(103);
				valor();
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SAIDA );
			setState(108);
			match(T__4);
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
	public static class LerContext extends ParserRuleContext {
		public TerminalNode LER() { return getToken(GramaticaParser.LER, 0); }
		public List<TerminalNode> ENTRADA() { return getTokens(GramaticaParser.ENTRADA); }
		public TerminalNode ENTRADA(int i) {
			return getToken(GramaticaParser.ENTRADA, i);
		}
		public List<TerminalNode> NOME() { return getTokens(GramaticaParser.NOME); }
		public TerminalNode NOME(int i) {
			return getToken(GramaticaParser.NOME, i);
		}
		public LerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitLer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LerContext ler() throws RecognitionException {
		LerContext _localctx = new LerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ler);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(LER);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				match(ENTRADA);
				setState(112);
				match(NOME);
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ENTRADA );
			setState(117);
			match(T__4);
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
		enterRule(_localctx, 18, RULE_tipo_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4026531840L) != 0)) ) {
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
		enterRule(_localctx, 20, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(NOME);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATRIBUICAO) {
				{
				setState(122);
				match(ATRIBUICAO);
				setState(123);
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
		enterRule(_localctx, 22, RULE_valor);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(NOME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				expressao_aritmetica();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(BOOLEANO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
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
		enterRule(_localctx, 24, RULE_atribuicao_simples);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(NOME);
			setState(133);
			match(ATRIBUICAO);
			setState(134);
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
		enterRule(_localctx, 26, RULE_expressao_aritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			termo();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SOMA || _la==SUBTRACAO) {
				{
				{
				setState(137);
				_la = _input.LA(1);
				if ( !(_la==SOMA || _la==SUBTRACAO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(138);
				termo();
				}
				}
				setState(143);
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
		enterRule(_localctx, 28, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			fator();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICACAO || _la==DIVISAO) {
				{
				{
				setState(145);
				_la = _input.LA(1);
				if ( !(_la==MULTIPLICACAO || _la==DIVISAO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(146);
				fator();
				}
				}
				setState(151);
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
		enterRule(_localctx, 30, RULE_fator);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOME:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(NOME);
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(INTEIRO);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(DECIMAL);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				match(T__5);
				setState(156);
				expressao_aritmetica();
				setState(157);
				match(T__6);
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
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
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
		enterRule(_localctx, 32, RULE_expressao_booleana);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			valor();
			setState(162);
			operador();
			setState(163);
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
		enterRule(_localctx, 34, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33030144L) != 0)) ) {
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
		"\u0004\u0001\'\u00a8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0003\u0000"+
		"&\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00026\b\u0002\n\u0002\f\u0002"+
		"9\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"?\b\u0003\n\u0003\f\u0003B\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004I\b\u0004\n\u0004\f\u0004L\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\\\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007i\b\u0007\u000b\u0007"+
		"\f\u0007j\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0004\br\b\b"+
		"\u000b\b\f\bs\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0003\n}\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0083\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0005\r\u008c\b\r\n\r\f\r\u008f\t\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0094\b\u000e\n\u000e\f\u000e\u0097\t\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00a0\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000"+
		"\u0004\u0001\u0000\u001c\u001f\u0001\u0000\u000f\u0010\u0001\u0000\u0011"+
		"\u0012\u0001\u0000\u0013\u0018\u00aa\u0000%\u0001\u0000\u0000\u0000\u0002"+
		"-\u0001\u0000\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u0006:\u0001"+
		"\u0000\u0000\u0000\bE\u0001\u0000\u0000\u0000\nO\u0001\u0000\u0000\u0000"+
		"\f]\u0001\u0000\u0000\u0000\u000ee\u0001\u0000\u0000\u0000\u0010n\u0001"+
		"\u0000\u0000\u0000\u0012w\u0001\u0000\u0000\u0000\u0014y\u0001\u0000\u0000"+
		"\u0000\u0016\u0082\u0001\u0000\u0000\u0000\u0018\u0084\u0001\u0000\u0000"+
		"\u0000\u001a\u0088\u0001\u0000\u0000\u0000\u001c\u0090\u0001\u0000\u0000"+
		"\u0000\u001e\u009f\u0001\u0000\u0000\u0000 \u00a1\u0001\u0000\u0000\u0000"+
		"\"\u00a5\u0001\u0000\u0000\u0000$&\u0003\u0002\u0001\u0000%$\u0001\u0000"+
		"\u0000\u0000%&\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0005"+
		"\u0001\u0000\u0000()\u0005\u0002\u0000\u0000)*\u0003\u0004\u0002\u0000"+
		"*+\u0005\u0003\u0000\u0000+,\u0005\u0000\u0000\u0001,\u0001\u0001\u0000"+
		"\u0000\u0000-.\u0005\b\u0000\u0000.\u0003\u0001\u0000\u0000\u0000/6\u0003"+
		"\u0006\u0003\u000006\u0003\b\u0004\u000016\u0003\n\u0005\u000026\u0003"+
		"\f\u0006\u000036\u0003\u000e\u0007\u000046\u0003\u0010\b\u00005/\u0001"+
		"\u0000\u0000\u000050\u0001\u0000\u0000\u000051\u0001\u0000\u0000\u0000"+
		"52\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000"+
		"\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u00008\u0005\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		":;\u0003\u0012\t\u0000;@\u0003\u0014\n\u0000<=\u0005\u0004\u0000\u0000"+
		"=?\u0003\u0014\n\u0000><\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000CD\u0005\u0005\u0000\u0000D\u0007\u0001"+
		"\u0000\u0000\u0000EJ\u0003\u0018\f\u0000FG\u0005\u0004\u0000\u0000GI\u0003"+
		"\u0018\f\u0000HF\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000MN\u0005\u0005\u0000\u0000N\t\u0001\u0000\u0000"+
		"\u0000OP\u0005\t\u0000\u0000PQ\u0005\u0006\u0000\u0000QR\u0003 \u0010"+
		"\u0000RS\u0005\u0007\u0000\u0000ST\u0005\u0002\u0000\u0000TU\u0003\u0004"+
		"\u0002\u0000U[\u0005\u0003\u0000\u0000VW\u0005\n\u0000\u0000WX\u0005\u0002"+
		"\u0000\u0000XY\u0003\u0004\u0002\u0000YZ\u0005\u0003\u0000\u0000Z\\\u0001"+
		"\u0000\u0000\u0000[V\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\\u000b\u0001\u0000\u0000\u0000]^\u0005\f\u0000\u0000^_\u0005\u0006\u0000"+
		"\u0000_`\u0003 \u0010\u0000`a\u0005\u0007\u0000\u0000ab\u0005\u0002\u0000"+
		"\u0000bc\u0003\u0004\u0002\u0000cd\u0005\u0003\u0000\u0000d\r\u0001\u0000"+
		"\u0000\u0000eh\u0005\r\u0000\u0000fg\u0005\u001a\u0000\u0000gi\u0003\u0016"+
		"\u000b\u0000hf\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"lm\u0005\u0005\u0000\u0000m\u000f\u0001\u0000\u0000\u0000nq\u0005\u000e"+
		"\u0000\u0000op\u0005\u001b\u0000\u0000pr\u0005$\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005\u0005\u0000\u0000"+
		"v\u0011\u0001\u0000\u0000\u0000wx\u0007\u0000\u0000\u0000x\u0013\u0001"+
		"\u0000\u0000\u0000y|\u0005$\u0000\u0000z{\u0005\u0019\u0000\u0000{}\u0003"+
		"\u0016\u000b\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}\u0015\u0001\u0000\u0000\u0000~\u0083\u0005$\u0000\u0000\u007f\u0083"+
		"\u0003\u001a\r\u0000\u0080\u0083\u0005#\u0000\u0000\u0081\u0083\u0005"+
		"\"\u0000\u0000\u0082~\u0001\u0000\u0000\u0000\u0082\u007f\u0001\u0000"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0017\u0001\u0000\u0000\u0000\u0084\u0085\u0005$\u0000"+
		"\u0000\u0085\u0086\u0005\u0019\u0000\u0000\u0086\u0087\u0003\u0016\u000b"+
		"\u0000\u0087\u0019\u0001\u0000\u0000\u0000\u0088\u008d\u0003\u001c\u000e"+
		"\u0000\u0089\u008a\u0007\u0001\u0000\u0000\u008a\u008c\u0003\u001c\u000e"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e\u001b\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u0090\u0095\u0003\u001e\u000f\u0000\u0091\u0092\u0007\u0002\u0000"+
		"\u0000\u0092\u0094\u0003\u001e\u000f\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u001d\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u00a0\u0005$\u0000\u0000"+
		"\u0099\u00a0\u0005 \u0000\u0000\u009a\u00a0\u0005!\u0000\u0000\u009b\u009c"+
		"\u0005\u0006\u0000\u0000\u009c\u009d\u0003\u001a\r\u0000\u009d\u009e\u0005"+
		"\u0007\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u0098\u0001"+
		"\u0000\u0000\u0000\u009f\u0099\u0001\u0000\u0000\u0000\u009f\u009a\u0001"+
		"\u0000\u0000\u0000\u009f\u009b\u0001\u0000\u0000\u0000\u00a0\u001f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0003\u0016\u000b\u0000\u00a2\u00a3\u0003"+
		"\"\u0011\u0000\u00a3\u00a4\u0003\u0016\u000b\u0000\u00a4!\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0007\u0003\u0000\u0000\u00a6#\u0001\u0000\u0000"+
		"\u0000\r%57@J[js|\u0082\u008d\u0095\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}