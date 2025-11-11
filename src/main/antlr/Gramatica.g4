grammar Gramatica;

programa: bloco EOF;

bloco: (declaracao | condicao | repeticao_para | repeticao_enquanto)*;
declaracao: tipo_variavel variavel (VIRGULA variavel)* PONTO_VIRGULA;
condicao: SE ABRE_PARENTESES expressao FECHA_PARENTESES ABRE_CHAVES bloco FECHA_CHAVES;
repeticao_para: PARA ABRE_PARENTESES FECHA_PARENTESES ABRE_CHAVES FECHA_CHAVES;
repeticao_enquanto: ENQUANTO ABRE_PARENTESES FECHA_PARENTESES ABRE_CHAVES FECHA_CHAVES;

tipo_variavel: TIPO_INTEIRO | TIPO_DECIMAL | TIPO_TEXTO | TIPO_BOOLEANO;
variavel: NOME (ATRIBUICAO valor)?;
valor: INTEIRO | DECIMAL | BOOLEANO | TEXTO;
expressao: (NOME | valor) operador (NOME | valor);
operador: IGUAL | DIFERENTE | MAIOR | MENOR | MAIOR_IGUAL | MENOR_IGUAL;

ABRE_PARENTESES:  '(';
FECHA_PARENTESES: ')';
ABRE_CHAVES:      '{';
FECHA_CHAVES:     '}';
VIRGULA:          ',';
PONTO_VIRGULA:    ';';

SE:               'if';
SENAO:            'else';
ENQUANTO:         'while';
PARA:             'for';

IGUAL:            '==';
DIFERENTE:        '!=';
MAIOR_IGUAL:      '>=';
MENOR_IGUAL:      '<=';
MAIOR:            '>';
MENOR:            '<';
ATRIBUICAO:       '=';

TIPO_INTEIRO:     'int';
TIPO_DECIMAL:     'float';
TIPO_TEXTO:       'string';
TIPO_BOOLEANO:    'bool';

NOME:             [A-Z][a-zA-Z0-9]*;
INTEIRO:          '-'?[0-9]+;
DECIMAL:          '-'?[0-9]+'.'[0-9]+;
BOOLEANO:         'true' | 'false';
TEXTO:            '"' (~["\\\r\n])* '"';

ESPACO:           [ \t\r\n]+ -> skip;