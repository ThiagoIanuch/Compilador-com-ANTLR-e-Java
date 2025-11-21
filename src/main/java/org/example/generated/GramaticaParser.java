// Generated from C:/Users/Thiago Ianuch/Downloads/Projetos/Compilador-com-ANTLR-e-Java/src/main/antlr/Gramatica.g4 by ANTLR 4.13.2
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
		INCREMENTO=28, DECREMENTO=29, TIPO_INTEIRO=30, TIPO_DECIMAL=31, TIPO_TEXTO=32, 
		TIPO_BOOLEANO=33, INTEIRO=34, DECIMAL=35, TEXTO=36, BOOLEANO=37, NOME=38, 
		ESPACO=39, COMENTARIO_LINHA=40, COMENTARIO_BLOCO=41;
	public static final int
		RULE_programa = 0, RULE_depurar = 1, RULE_bloco = 2, RULE_declaracao = 3, 
		RULE_atribuicao = 4, RULE_condicao = 5, RULE_repeticao_enquanto = 6, RULE_repeticao_para = 7, 
		RULE_imprimir = 8, RULE_ler = 9, RULE_declaracao_unaria = 10, RULE_tipo_variavel = 11, 
		RULE_variavel = 12, RULE_valor = 13, RULE_atribuicao_simples = 14, RULE_expressao_aritmetica = 15, 
		RULE_termo = 16, RULE_fator = 17, RULE_expressao_booleana = 18, RULE_operador = 19, 
		RULE_expressao_unaria = 20, RULE_operador_unario = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "depurar", "bloco", "declaracao", "atribuicao", "condicao", 
			"repeticao_enquanto", "repeticao_para", "imprimir", "ler", "declaracao_unaria", 
			"tipo_variavel", "variavel", "valor", "atribuicao_simples", "expressao_aritmetica", 
			"termo", "fator", "expressao_booleana", "operador", "expressao_unaria", 
			"operador_unario"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'BeginPlay()'", "'{'", "'}'", "';'", "','", "'('", "')'", "'--debug'", 
			"'if'", "'else'", "'for'", "'while'", "'cout'", "'cin'", "'+'", "'-'", 
			"'*'", "'/'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'='", "'<<'", 
			"'>>'", "'++'", "'--'", "'int'", "'float'", "'string'", "'bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "DEPURAR", "SE", "SENAO", 
			"PARA", "ENQUANTO", "IMPRIMIR", "LER", "SOMA", "SUBTRACAO", "MULTIPLICACAO", 
			"DIVISAO", "IGUAL", "DIFERENTE", "MAIOR_IGUAL", "MENOR_IGUAL", "MAIOR", 
			"MENOR", "ATRIBUICAO", "SAIDA", "ENTRADA", "INCREMENTO", "DECREMENTO", 
			"TIPO_INTEIRO", "TIPO_DECIMAL", "TIPO_TEXTO", "TIPO_BOOLEANO", "INTEIRO", 
			"DECIMAL", "TEXTO", "BOOLEANO", "NOME", "ESPACO", "COMENTARIO_LINHA", 
			"COMENTARIO_BLOCO"
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEPURAR) {
				{
				setState(44);
				depurar();
				}
			}

			setState(47);
			match(T__0);
			setState(48);
			match(T__1);
			setState(49);
			bloco();
			setState(50);
			match(T__2);
			setState(51);
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
			setState(53);
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
		public List<Repeticao_paraContext> repeticao_para() {
			return getRuleContexts(Repeticao_paraContext.class);
		}
		public Repeticao_paraContext repeticao_para(int i) {
			return getRuleContext(Repeticao_paraContext.class,i);
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
		public List<Declaracao_unariaContext> declaracao_unaria() {
			return getRuleContexts(Declaracao_unariaContext.class);
		}
		public Declaracao_unariaContext declaracao_unaria(int i) {
			return getRuleContext(Declaracao_unariaContext.class,i);
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291789371904L) != 0)) {
				{
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(55);
					declaracao();
					setState(56);
					match(T__3);
					}
					break;
				case 2:
					{
					setState(58);
					atribuicao();
					setState(59);
					match(T__3);
					}
					break;
				case 3:
					{
					setState(61);
					condicao();
					}
					break;
				case 4:
					{
					setState(62);
					repeticao_enquanto();
					}
					break;
				case 5:
					{
					setState(63);
					repeticao_para();
					}
					break;
				case 6:
					{
					setState(64);
					imprimir();
					setState(65);
					match(T__3);
					}
					break;
				case 7:
					{
					setState(67);
					ler();
					setState(68);
					match(T__3);
					}
					break;
				case 8:
					{
					setState(70);
					declaracao_unaria();
					setState(71);
					match(T__3);
					}
					break;
				}
				}
				setState(77);
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
			setState(78);
			tipo_variavel();
			setState(79);
			variavel();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(80);
				match(T__4);
				setState(81);
				variavel();
				}
				}
				setState(86);
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
			setState(87);
			atribuicao_simples();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(88);
				match(T__4);
				setState(89);
				atribuicao_simples();
				}
				}
				setState(94);
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
			setState(95);
			match(SE);
			setState(96);
			match(T__5);
			setState(97);
			expressao_booleana();
			setState(98);
			match(T__6);
			setState(99);
			match(T__1);
			setState(100);
			bloco();
			setState(101);
			match(T__2);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(102);
				match(SENAO);
				setState(103);
				match(T__1);
				setState(104);
				bloco();
				setState(105);
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
			setState(109);
			match(ENQUANTO);
			setState(110);
			match(T__5);
			setState(111);
			expressao_booleana();
			setState(112);
			match(T__6);
			setState(113);
			match(T__1);
			setState(114);
			bloco();
			setState(115);
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
	public static class Repeticao_paraContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(GramaticaParser.PARA, 0); }
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public Expressao_booleanaContext expressao_booleana() {
			return getRuleContext(Expressao_booleanaContext.class,0);
		}
		public Declaracao_unariaContext declaracao_unaria() {
			return getRuleContext(Declaracao_unariaContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_repeticao_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(PARA);
			setState(118);
			match(T__5);
			setState(119);
			declaracao();
			setState(120);
			match(T__3);
			setState(121);
			expressao_booleana();
			setState(122);
			match(T__3);
			setState(123);
			declaracao_unaria();
			setState(124);
			match(T__6);
			setState(125);
			match(T__1);
			setState(126);
			bloco();
			setState(127);
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
		enterRule(_localctx, 16, RULE_imprimir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(IMPRIMIR);
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				match(SAIDA);
				setState(131);
				valor();
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SAIDA );
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
		enterRule(_localctx, 18, RULE_ler);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(LER);
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				match(ENTRADA);
				setState(138);
				match(NOME);
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ENTRADA );
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
	public static class Declaracao_unariaContext extends ParserRuleContext {
		public List<Expressao_unariaContext> expressao_unaria() {
			return getRuleContexts(Expressao_unariaContext.class);
		}
		public Expressao_unariaContext expressao_unaria(int i) {
			return getRuleContext(Expressao_unariaContext.class,i);
		}
		public Declaracao_unariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_unaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaracao_unaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaracao_unaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDeclaracao_unaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_unariaContext declaracao_unaria() throws RecognitionException {
		Declaracao_unariaContext _localctx = new Declaracao_unariaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracao_unaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			expressao_unaria();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(144);
				match(T__4);
				setState(145);
				expressao_unaria();
				}
				}
				setState(150);
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
		enterRule(_localctx, 22, RULE_tipo_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16106127360L) != 0)) ) {
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
		enterRule(_localctx, 24, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(NOME);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATRIBUICAO) {
				{
				setState(154);
				match(ATRIBUICAO);
				setState(155);
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
		enterRule(_localctx, 26, RULE_valor);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(NOME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				expressao_aritmetica();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(BOOLEANO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
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
		enterRule(_localctx, 28, RULE_atribuicao_simples);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(NOME);
			setState(165);
			match(ATRIBUICAO);
			setState(166);
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
		enterRule(_localctx, 30, RULE_expressao_aritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			termo();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SOMA || _la==SUBTRACAO) {
				{
				{
				setState(169);
				_la = _input.LA(1);
				if ( !(_la==SOMA || _la==SUBTRACAO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(170);
				termo();
				}
				}
				setState(175);
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
		enterRule(_localctx, 32, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			fator();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICACAO || _la==DIVISAO) {
				{
				{
				setState(177);
				_la = _input.LA(1);
				if ( !(_la==MULTIPLICACAO || _la==DIVISAO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(178);
				fator();
				}
				}
				setState(183);
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
		enterRule(_localctx, 34, RULE_fator);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOME:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(NOME);
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(INTEIRO);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(DECIMAL);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(T__5);
				setState(188);
				expressao_aritmetica();
				setState(189);
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
		enterRule(_localctx, 36, RULE_expressao_booleana);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			valor();
			setState(194);
			operador();
			setState(195);
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
		enterRule(_localctx, 38, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_unariaContext extends ParserRuleContext {
		public TerminalNode INCREMENTO() { return getToken(GramaticaParser.INCREMENTO, 0); }
		public TerminalNode NOME() { return getToken(GramaticaParser.NOME, 0); }
		public TerminalNode DECREMENTO() { return getToken(GramaticaParser.DECREMENTO, 0); }
		public Expressao_unariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_unaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressao_unaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressao_unaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExpressao_unaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_unariaContext expressao_unaria() throws RecognitionException {
		Expressao_unariaContext _localctx = new Expressao_unariaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressao_unaria);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(INCREMENTO);
				setState(200);
				match(NOME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(DECREMENTO);
				setState(202);
				match(NOME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(NOME);
				setState(204);
				match(INCREMENTO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(NOME);
				setState(206);
				match(DECREMENTO);
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
	public static class Operador_unarioContext extends ParserRuleContext {
		public TerminalNode INCREMENTO() { return getToken(GramaticaParser.INCREMENTO, 0); }
		public TerminalNode DECREMENTO() { return getToken(GramaticaParser.DECREMENTO, 0); }
		public Operador_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperador_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperador_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitOperador_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_unarioContext operador_unario() throws RecognitionException {
		Operador_unarioContext _localctx = new Operador_unarioContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operador_unario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !(_la==INCREMENTO || _la==DECREMENTO) ) {
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
		"\u0004\u0001)\u00d4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0003\u0000.\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"J\b\u0002\n\u0002\f\u0002M\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003S\b\u0003\n\u0003\f\u0003V\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004[\b\u0004\n\u0004\f\u0004^\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005l\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0004\b\u0085\b\b\u000b\b\f\b\u0086\u0001\t\u0001\t\u0001\t\u0004\t"+
		"\u008c\b\t\u000b\t\f\t\u008d\u0001\n\u0001\n\u0001\n\u0005\n\u0093\b\n"+
		"\n\n\f\n\u0096\t\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u009d\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a3\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u00ac\b\u000f\n\u000f\f\u000f\u00af\t\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u00b4\b\u0010\n\u0010\f\u0010\u00b7\t\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00c0\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u00d0\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*\u0000\u0005\u0001\u0000\u001e!\u0001\u0000\u000f\u0010\u0001"+
		"\u0000\u0011\u0012\u0001\u0000\u0013\u0018\u0001\u0000\u001c\u001d\u00d8"+
		"\u0000-\u0001\u0000\u0000\u0000\u00025\u0001\u0000\u0000\u0000\u0004K"+
		"\u0001\u0000\u0000\u0000\u0006N\u0001\u0000\u0000\u0000\bW\u0001\u0000"+
		"\u0000\u0000\n_\u0001\u0000\u0000\u0000\fm\u0001\u0000\u0000\u0000\u000e"+
		"u\u0001\u0000\u0000\u0000\u0010\u0081\u0001\u0000\u0000\u0000\u0012\u0088"+
		"\u0001\u0000\u0000\u0000\u0014\u008f\u0001\u0000\u0000\u0000\u0016\u0097"+
		"\u0001\u0000\u0000\u0000\u0018\u0099\u0001\u0000\u0000\u0000\u001a\u00a2"+
		"\u0001\u0000\u0000\u0000\u001c\u00a4\u0001\u0000\u0000\u0000\u001e\u00a8"+
		"\u0001\u0000\u0000\u0000 \u00b0\u0001\u0000\u0000\u0000\"\u00bf\u0001"+
		"\u0000\u0000\u0000$\u00c1\u0001\u0000\u0000\u0000&\u00c5\u0001\u0000\u0000"+
		"\u0000(\u00cf\u0001\u0000\u0000\u0000*\u00d1\u0001\u0000\u0000\u0000,"+
		".\u0003\u0002\u0001\u0000-,\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/0\u0005\u0001\u0000\u000001\u0005\u0002"+
		"\u0000\u000012\u0003\u0004\u0002\u000023\u0005\u0003\u0000\u000034\u0005"+
		"\u0000\u0000\u00014\u0001\u0001\u0000\u0000\u000056\u0005\b\u0000\u0000"+
		"6\u0003\u0001\u0000\u0000\u000078\u0003\u0006\u0003\u000089\u0005\u0004"+
		"\u0000\u00009J\u0001\u0000\u0000\u0000:;\u0003\b\u0004\u0000;<\u0005\u0004"+
		"\u0000\u0000<J\u0001\u0000\u0000\u0000=J\u0003\n\u0005\u0000>J\u0003\f"+
		"\u0006\u0000?J\u0003\u000e\u0007\u0000@A\u0003\u0010\b\u0000AB\u0005\u0004"+
		"\u0000\u0000BJ\u0001\u0000\u0000\u0000CD\u0003\u0012\t\u0000DE\u0005\u0004"+
		"\u0000\u0000EJ\u0001\u0000\u0000\u0000FG\u0003\u0014\n\u0000GH\u0005\u0004"+
		"\u0000\u0000HJ\u0001\u0000\u0000\u0000I7\u0001\u0000\u0000\u0000I:\u0001"+
		"\u0000\u0000\u0000I=\u0001\u0000\u0000\u0000I>\u0001\u0000\u0000\u0000"+
		"I?\u0001\u0000\u0000\u0000I@\u0001\u0000\u0000\u0000IC\u0001\u0000\u0000"+
		"\u0000IF\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000"+
		"\u0000\u0000KL\u0001\u0000\u0000\u0000L\u0005\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000NO\u0003\u0016\u000b\u0000OT\u0003\u0018\f\u0000"+
		"PQ\u0005\u0005\u0000\u0000QS\u0003\u0018\f\u0000RP\u0001\u0000\u0000\u0000"+
		"SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000U\u0007\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000W\\\u0003"+
		"\u001c\u000e\u0000XY\u0005\u0005\u0000\u0000Y[\u0003\u001c\u000e\u0000"+
		"ZX\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]\t\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000_`\u0005\t\u0000\u0000`a\u0005\u0006\u0000\u0000ab\u0003"+
		"$\u0012\u0000bc\u0005\u0007\u0000\u0000cd\u0005\u0002\u0000\u0000de\u0003"+
		"\u0004\u0002\u0000ek\u0005\u0003\u0000\u0000fg\u0005\n\u0000\u0000gh\u0005"+
		"\u0002\u0000\u0000hi\u0003\u0004\u0002\u0000ij\u0005\u0003\u0000\u0000"+
		"jl\u0001\u0000\u0000\u0000kf\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000l\u000b\u0001\u0000\u0000\u0000mn\u0005\f\u0000\u0000no\u0005\u0006"+
		"\u0000\u0000op\u0003$\u0012\u0000pq\u0005\u0007\u0000\u0000qr\u0005\u0002"+
		"\u0000\u0000rs\u0003\u0004\u0002\u0000st\u0005\u0003\u0000\u0000t\r\u0001"+
		"\u0000\u0000\u0000uv\u0005\u000b\u0000\u0000vw\u0005\u0006\u0000\u0000"+
		"wx\u0003\u0006\u0003\u0000xy\u0005\u0004\u0000\u0000yz\u0003$\u0012\u0000"+
		"z{\u0005\u0004\u0000\u0000{|\u0003\u0014\n\u0000|}\u0005\u0007\u0000\u0000"+
		"}~\u0005\u0002\u0000\u0000~\u007f\u0003\u0004\u0002\u0000\u007f\u0080"+
		"\u0005\u0003\u0000\u0000\u0080\u000f\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0005\r\u0000\u0000\u0082\u0083\u0005\u001a\u0000\u0000\u0083\u0085\u0003"+
		"\u001a\r\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u0011\u0001\u0000\u0000\u0000\u0088\u008b\u0005\u000e"+
		"\u0000\u0000\u0089\u008a\u0005\u001b\u0000\u0000\u008a\u008c\u0005&\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e\u0013\u0001\u0000\u0000\u0000\u008f\u0094\u0003(\u0014\u0000"+
		"\u0090\u0091\u0005\u0005\u0000\u0000\u0091\u0093\u0003(\u0014\u0000\u0092"+
		"\u0090\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u0015\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0007\u0000\u0000\u0000\u0098\u0017\u0001\u0000\u0000\u0000\u0099"+
		"\u009c\u0005&\u0000\u0000\u009a\u009b\u0005\u0019\u0000\u0000\u009b\u009d"+
		"\u0003\u001a\r\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\u0019\u0001\u0000\u0000\u0000\u009e\u00a3\u0005"+
		"&\u0000\u0000\u009f\u00a3\u0003\u001e\u000f\u0000\u00a0\u00a3\u0005%\u0000"+
		"\u0000\u00a1\u00a3\u0005$\u0000\u0000\u00a2\u009e\u0001\u0000\u0000\u0000"+
		"\u00a2\u009f\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u001b\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0005&\u0000\u0000\u00a5\u00a6\u0005\u0019\u0000\u0000\u00a6"+
		"\u00a7\u0003\u001a\r\u0000\u00a7\u001d\u0001\u0000\u0000\u0000\u00a8\u00ad"+
		"\u0003 \u0010\u0000\u00a9\u00aa\u0007\u0001\u0000\u0000\u00aa\u00ac\u0003"+
		" \u0010\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u001f\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b5\u0003\"\u0011\u0000\u00b1\u00b2\u0007\u0002\u0000"+
		"\u0000\u00b2\u00b4\u0003\"\u0011\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6!\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b8\u00c0\u0005&\u0000\u0000\u00b9\u00c0"+
		"\u0005\"\u0000\u0000\u00ba\u00c0\u0005#\u0000\u0000\u00bb\u00bc\u0005"+
		"\u0006\u0000\u0000\u00bc\u00bd\u0003\u001e\u000f\u0000\u00bd\u00be\u0005"+
		"\u0007\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bf\u00b9\u0001\u0000\u0000\u0000\u00bf\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bf\u00bb\u0001\u0000\u0000\u0000\u00c0#\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0003\u001a\r\u0000\u00c2\u00c3\u0003&\u0013"+
		"\u0000\u00c3\u00c4\u0003\u001a\r\u0000\u00c4%\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0007\u0003\u0000\u0000\u00c6\'\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0005\u001c\u0000\u0000\u00c8\u00d0\u0005&\u0000\u0000\u00c9\u00ca"+
		"\u0005\u001d\u0000\u0000\u00ca\u00d0\u0005&\u0000\u0000\u00cb\u00cc\u0005"+
		"&\u0000\u0000\u00cc\u00d0\u0005\u001c\u0000\u0000\u00cd\u00ce\u0005&\u0000"+
		"\u0000\u00ce\u00d0\u0005\u001d\u0000\u0000\u00cf\u00c7\u0001\u0000\u0000"+
		"\u0000\u00cf\u00c9\u0001\u0000\u0000\u0000\u00cf\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0)\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0007\u0004\u0000\u0000\u00d2+\u0001\u0000\u0000\u0000\u000f"+
		"-IKT\\k\u0086\u008d\u0094\u009c\u00a2\u00ad\u00b5\u00bf\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}