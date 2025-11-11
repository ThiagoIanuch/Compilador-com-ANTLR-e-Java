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
	 * Enter a parse tree produced by {@link GramaticaParser#repeticao_para}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao_para(GramaticaParser.Repeticao_paraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#repeticao_para}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao_para(GramaticaParser.Repeticao_paraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#repeticao_enquanto}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao_enquanto(GramaticaParser.Repeticao_enquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#repeticao_enquanto}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao_enquanto(GramaticaParser.Repeticao_enquantoContext ctx);
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
	 * Enter a parse tree produced by {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(GramaticaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(GramaticaParser.ExpressaoContext ctx);
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