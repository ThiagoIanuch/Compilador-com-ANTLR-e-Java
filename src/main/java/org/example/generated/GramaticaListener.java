// Generated from C:/Users/Thiago Ianuch/Downloads/Projetos/Compilador-com-ANTLR/src/main/antlr/Gramatica.g4 by ANTLR 4.13.2
package org.example.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#depurar}.
	 * @param ctx the parse tree
	 */
	void enterDepurar(GramaticaParser.DepurarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#depurar}.
	 * @param ctx the parse tree
	 */
	void exitDepurar(GramaticaParser.DepurarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(GramaticaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(GramaticaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(GramaticaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(GramaticaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(GramaticaParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(GramaticaParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(GramaticaParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(GramaticaParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tipo_variavel}.
	 * @param ctx the parse tree
	 */
	void enterTipo_variavel(GramaticaParser.Tipo_variavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tipo_variavel}.
	 * @param ctx the parse tree
	 */
	void exitTipo_variavel(GramaticaParser.Tipo_variavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(GramaticaParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(GramaticaParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(GramaticaParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(GramaticaParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#atribuicao_simples}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao_simples(GramaticaParser.Atribuicao_simplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#atribuicao_simples}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao_simples(GramaticaParser.Atribuicao_simplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_aritmetica(GramaticaParser.Expressao_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_aritmetica(GramaticaParser.Expressao_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(GramaticaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(GramaticaParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(GramaticaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(GramaticaParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressao_booleana}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_booleana(GramaticaParser.Expressao_booleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao_booleana}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_booleana(GramaticaParser.Expressao_booleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(GramaticaParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(GramaticaParser.OperadorContext ctx);
}