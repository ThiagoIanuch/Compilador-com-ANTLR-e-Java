// Generated from C:/Users/Thiago Ianuch/Downloads/Projetos/Compilador-com-ANTLR/src/main/antlr/Gramatica.g4 by ANTLR 4.13.2
package org.example.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#depurar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDepurar(GramaticaParser.DepurarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(GramaticaParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(GramaticaParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#condicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicao(GramaticaParser.CondicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(GramaticaParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#ler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLer(GramaticaParser.LerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#tipo_variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_variavel(GramaticaParser.Tipo_variavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(GramaticaParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(GramaticaParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#atribuicao_simples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao_simples(GramaticaParser.Atribuicao_simplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_aritmetica(GramaticaParser.Expressao_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(GramaticaParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(GramaticaParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expressao_booleana}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_booleana(GramaticaParser.Expressao_booleanaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(GramaticaParser.OperadorContext ctx);
}