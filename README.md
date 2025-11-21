# Compilador em Java com ANTLR

Projeto desenvolvido utilizando **ANTLR** e **Java** para criação de um **compilador** para a **avaliação A3** da disciplina **Teoria da Computação e Compiladores** da faculdade **UniCuritiba**.

---

## 📌 1. Requisitos e como executar o projeto

Em construção

---

## 📌 2. Sobre a Linguagem

A linguagem é case-sensitive e segue sintaxe semelhante ao do C++. Os arquivos para compilação devem possuir a extensão .medjed. 

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

## 📌 3. Exemplo básico de código 

Para um melhor entendimento da linguagem leia a [documentação completa](Documentacao%20completa.pdf).


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

# Compilador em Java com ANTLR

Projeto desenvolvido utilizando **ANTLR** e **Java** para criação de um **compilador** para a **avaliação A3** da disciplina **Teoria da Computação e Compiladores** da faculdade **UniCuritiba**.

---

## 📌 1. Requisitos e como executar o projeto

Em construção

---

## 📌 2. Sobre a Linguagem

A linguagem é case-sensitive e segue sintaxe semelhante ao do C++. Os arquivos para compilação devem possuir a extensão .medjed. 

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

## 📌 3. Exemplo básico de código 

Para um melhor entendimento da linguagem, leia a [Documentação completa](https://github.com/ThiagoIanuch/Compilador-com-ANTLR-e-Java/blob/main/Documenta%C3%A7%C3%A3o%20completa.pdf).

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
```
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