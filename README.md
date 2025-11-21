# Compilador com ANTLR e Java

Projeto desenvolvido com **ANTLR** e  **Java** para a criação de um **compilador** para uma **linguagem de programação própria**, criado como parte da **avaliação A3** da disciplina **Teoria da Computação e Compiladores** da faculdade **UniCuritiba**.

---

## 📦 1. Requisitos e como executar o projeto

1) Baixe a última versão do [Java](https://www.java.com/pt-BR/download/manual.jsp).

2) Baixe a versão 1.0 do projeto:
[Compilador com ANTLR e Java - Release 1.0](https://github.com/ThiagoIanuch/Compilador-com-ANTLR-e-Java/releases/tag/1.0).

3) Descompacte a pasta baixada, que possui:

- `Compilador-com-ANTLR-e-Java.jar` → arquivo executável do projeto  
- `testes/` → pasta com os códigos de teste, que devem possuir a extensão `.medjed`. Os arquivos podem ser editados ou criados facilmente em qualquer editor de texto.

4) Abra o terminal na pasta descompactada e execute:

- `java -jar Compilador-com-ANTLR-e-Java.jar testes/nome-do-arquivo-que-ira-compilar.medjed`

<div align="center">
    <img width="709" height="439" alt="image" src="https://github.com/user-attachments/assets/353eba27-9ec7-4440-bbf6-9a096c7d0092" />
</div>

---

## 📖 2. Sobre a Linguagem

A linguagem criada é case-sensitive e segue sintaxe semelhante ao do C++. Os arquivos para compilação devem possuir a extensão .medjed. A [documentação completa](https://github.com/ThiagoIanuch/Compilador-com-ANTLR-e-Java/blob/main/Documenta%C3%A7%C3%A3o%20completa.pdf) possui todas as explicações sobre a sintaxe da linguagem criada.

**A linguagem possui:**
- Comentários
- Declaração de variáveis
- Atribuições
- Impressão (`cout`)
- Leitura (`cin`)
- Condicionais `if/else`
- Repetições `while` e `for` (apenas analisadas semanticamente)

**Limitações atuais:**

- `while` e `for` **não são executados** pelo interpretador, somente analisados semanticamente.
- Condicionais `if/else` podem falhar se dependem de valores lidos via `cin`.

---

## 💡 3. Exemplo básico de código 

Para um melhor entendimento da linguagem, leia a [documentação completa](https://github.com/ThiagoIanuch/Compilador-com-ANTLR-e-Java/blob/main/Documenta%C3%A7%C3%A3o%20completa.pdf).

```cpp
BeginPlay()
{
    int X, VariavelInt, A;
    int Y = 50;
    float Z = 50.0, VariavelFloat;
    string MinhaString = "Esse é um exemplo de STRING";
    bool VariavelBool = true;

    VariavelInt = 50, A = 20;
    cout << VariavelInt << " - " << A << " = " << VariavelInt - A;

    cout << "\n\nO valor de: X + Y é: " << X + Y << "\n"; // Isso irá gerar um valor inesperado, pois a variável X não foi inicializada
    cout << "O valor de Y + Z é: " << Y + Z << "\n"; // Isso irá mostrar o valor '100' e não '100.0', pois como as casas decimais do resultado são '0' ele irá converter para INTEIRO
    cout << "\n" << MinhaString;
    cout << "\nE esse um exemplo de booleano: " << VariavelBool;

    X = 10;
    if(X > 50)
    {
        cout << "\n\nO valor de X agora é '" << X << "', que é maior que 50";
    }
    else
    {
        cout << "\n\nO valor de X agora é '" << X << "', que é menor que 50";
    }

    cout << "\n\nDigite um valor inteiro: ";
    cin >> X;

    cout << "\n50 + 90 * 40 / 2 =  " << 50 + 90 * 40 / 2; // O resultado deve ser 1850
    cout << "\n(50 + 90) * 40 / 2 = " << (50 + 90) * 40 / 2; // O resultado deve ser 2800
    cout << "\n(50 + (90 * 40)) / 2 = " << (50 + (90 * 40)) / 2; // O resultado deve ser 1825
}
```

As repetições WHILE e FOR também podem ser usadas, apesar de serem somente analisadas semanticamente e não interpretadas.

```cpp
BeginPlay()
{
    int X = 1;

    while(X <= 10)
    {
        cout << X << "\n";

        X++; // PODE SER TAMBÉM X = X + 1;
    }

    for(int i = 0; i < 20; i++)
    {
        cout << i << "\n";
    }
}
```
