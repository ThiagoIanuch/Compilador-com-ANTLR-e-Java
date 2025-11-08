grammar Gramatica;

decl: type ID ';';

type: 'int' | 'float';
ID: [A-Z][a-zA-Z0-9]*;
INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
WS: [ \t\r\n]+ -> skip;