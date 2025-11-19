package org.example;

import org.example.generated.GramaticaParser;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Interpretador {
    private Variaveis variaveis = new Variaveis();
    private Expressoes expressoes = new Expressoes(variaveis);
    Scanner scanner = new Scanner(System.in);

    public void executar(List<Comando> comandos) {
        for (Comando comando : comandos) {
            if (comando.tipo.equals("Declarar")) {
                GramaticaParser.VariavelContext variavel = (GramaticaParser.VariavelContext) comando.valor;

                Tipo tipo = Tipo.valueOf(variavel.getParent().getChild(0).getText().toUpperCase());
                String nome = variavel.NOME().getText();
                String valor = null;

                if (variavel.valor() != null) {
                    if (variavel.valor().NOME() != null) {
                        valor = variaveis.obterVariavel(variavel.valor().NOME().getText()).getValor().toString();
                    }

                    if (variavel.valor().expressao_aritmetica() != null) {
                        float resultado = expressoes.avaliarExpressaoAritmetica(variavel.valor().expressao_aritmetica(), tipo);

                        if (tipo == Tipo.INT) {
                            valor = Integer.toString((int) resultado);
                        }
                        else {
                            valor = Float.toString(resultado);
                        }
                    }

                    if (variavel.valor().BOOLEANO() != null) {
                        valor = variavel.valor().BOOLEANO().getText();
                    }

                    if (variavel.valor().TEXTO() != null) {
                        valor = variavel.valor().TEXTO().getText();
                    }
                }

                if (valor == null) {
                    Random random = new Random();

                    switch (tipo) {
                        case INT -> valor = Integer.toString(random.nextInt(30000));
                        case FLOAT -> Float.toString(random.nextFloat() * 30000);
                        case BOOL -> valor = "false";
                        case STRING -> valor = "\"\"";
                    }
                }

                Object valorConvertido = variaveis.converterValor(tipo, valor);
                variaveis.adicionarVariavel(nome, new Variavel(tipo, nome, valorConvertido));
            }
            else if(comando.tipo.equals("Atribuir")) {
                GramaticaParser.Atribuicao_simplesContext simplesCtx = (GramaticaParser.Atribuicao_simplesContext) comando.valor;

                String nome = simplesCtx.NOME().getText();
                Variavel variavelExistente = variaveis.obterVariavel(nome);
                Tipo tipo = variavelExistente.getTipo();
                String valor = null;

                GramaticaParser.ValorContext valorCtx = simplesCtx.valor();


                if (valorCtx.NOME() != null) {
                    valor = variaveis.obterVariavel(valorCtx.NOME().getText()).getValor().toString();
                }

                if (valorCtx.expressao_aritmetica() != null) {
                    float resultado = expressoes.avaliarExpressaoAritmetica(valorCtx.expressao_aritmetica(), tipo);

                    if (tipo == Tipo.INT) {
                        valor = Integer.toString((int) resultado);
                    }
                    else {
                        valor = Float.toString(resultado);
                    }
                }

                if (valorCtx.BOOLEANO() != null) {
                    valor = valorCtx.BOOLEANO().getText();
                }
                if (valorCtx.TEXTO() != null) {
                    valor = valorCtx.TEXTO().getText();
                }

                Object valorConvertido = variaveis.converterValor(tipo, valor);
                variavelExistente.setValor(valorConvertido);
            }
            else if(comando.tipo.equals("Imprimir")) {
                List<GramaticaParser.ValorContext> valoresCtx = (List<GramaticaParser.ValorContext>) comando.valor;

                StringBuilder saida = new StringBuilder();

                for (var valorCtx : valoresCtx) {
                    String resultado = null;

                    if (valorCtx.NOME() != null) {
                        if(variaveis.obterVariavel(valorCtx.NOME().getText()).getTipo() == Tipo.INT || variaveis.obterVariavel(valorCtx.NOME().getText()).getTipo() == Tipo.FLOAT) {
                            String valor = variaveis.obterVariavel(valorCtx.NOME().getText()).getValor().toString();

                            resultado = expressoes.converterFloatOuInt(Float.parseFloat(valor));
                        }
                        else if(variaveis.obterVariavel(valorCtx.NOME().getText()).getTipo() == Tipo.STRING ) {
                            String texto = variaveis.obterVariavel(valorCtx.NOME().getText()).getValor().toString();

                            resultado = texto.substring(1, texto.length() - 1).replace("\\n", "\n");
                        }
                        else {
                            resultado = variaveis.obterVariavel(valorCtx.NOME().getText()).getValor().toString();
                        }
                    }

                    if (valorCtx.expressao_aritmetica() != null) {
                        float valor = expressoes.avaliarExpressaoAritmetica(valorCtx.expressao_aritmetica(), null);

                        resultado = expressoes.converterFloatOuInt(valor);
                    }

                    if (valorCtx.BOOLEANO() != null) {
                        resultado = valorCtx.BOOLEANO().getText();
                    }

                    if (valorCtx.TEXTO() != null) {
                        String texto = valorCtx.TEXTO().getText();
                        resultado = texto.substring(1, texto.length() - 1).replace("\\n", "\n");
                    }

                    saida.append(resultado);
                }

                System.out.print(saida.toString());
            }
            else if (comando.tipo.equals("Ler")) {
                List<String> listaVariaveis = (List<String>) comando.valor;

                for (String nome : listaVariaveis) {
                    String entrada = scanner.nextLine();
                    Variavel variavel = variaveis.obterVariavel(nome);
                    variavel.setValor(entrada);
                }
            }
            else if(comando.tipo.equals("AbrirEscopo")) {
                variaveis.abrirEscopo();
            }
            else if(comando.tipo.equals("FecharEscopo")) {
                variaveis.fecharEscopo();
            }
        }
    }
}
