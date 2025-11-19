grammar Gramatica;

programa:             depurar? bloco EOF;

depurar:              DEPURAR;
bloco:                (declaracao | atribuicao | condicao | imprimir | ler)*;

declaracao:           tipo_variavel variavel (',' variavel)* ';';
atribuicao:           atribuicao_simples (',' atribuicao_simples)* ';';
condicao:             SE '(' expressao_booleana ')' '{' bloco '}' (SENAO '{' bloco '}')?;
imprimir:             IMPRIMIR ( SAIDA valor )+ ';';
ler:                  LER (ENTRADA NOME)+ ';';

tipo_variavel:        TIPO_INTEIRO | TIPO_DECIMAL | TIPO_TEXTO | TIPO_BOOLEANO;
variavel:             NOME (ATRIBUICAO valor)?;
valor:                NOME | expressao_aritmetica | BOOLEANO | TEXTO;

atribuicao_simples:   NOME ATRIBUICAO valor;

expressao_aritmetica: termo ((SOMA | SUBTRACAO) termo)* ;
termo:                fator ((MULTIPLICACAO  | DIVISAO) fator)*;
fator:                NOME | INTEIRO | DECIMAL | '(' expressao_aritmetica ')';

expressao_booleana:   valor operador valor;
operador:             IGUAL | DIFERENTE | MAIOR | MENOR | MAIOR_IGUAL | MENOR_IGUAL;

DEPURAR:          '--debug';

SE:               'if';
SENAO:            'else';
IMPRIMIR:         'cout';
LER:              'cin';
ENQUANTO:         'while';
PARA:             'for';

SOMA:             '+';
SUBTRACAO:        '-';
MULTIPLICACAO:    '*';
DIVISAO:          '/';
IGUAL:            '==';
DIFERENTE:        '!=';
MAIOR_IGUAL:      '>=';
MENOR_IGUAL:      '<=';
MAIOR:            '>';
MENOR:            '<';
ATRIBUICAO:       '=';
SAIDA:            '<<';
ENTRADA:          '>>';

TIPO_INTEIRO:     'int';
TIPO_DECIMAL:     'float';
TIPO_TEXTO:       'string';
TIPO_BOOLEANO:    'bool';

INTEIRO:          '-'?[0-9]+;
DECIMAL:          '-'?[0-9]+'.'[0-9]+;
TEXTO:            '"' (~["\\\r]|'\\n')* '"';
BOOLEANO:         'true' | 'false';
NOME:             [a-zA-Z][a-zA-Z0-9]*;

ESPACO:           [ \t\r\n]+ -> skip;
COMENTARIO_LINHA: '//' ~[\r\n]* -> skip;
COMENTARIO_BLOCO: '/*' .*? '*/' -> skip;

// AINDA PRECISA SER IMPLEMENTANDO
//repeticao_para: PARA ABRE_PARENTESES FECHA_PARENTESES ABRE_CHAVES FECHA_CHAVES;
//repeticao_enquanto: ENQUANTO ABRE_PARENTESES FECHA_PARENTESES ABRE_CHAVES FECHA_CHAVES;