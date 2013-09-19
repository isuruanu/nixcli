grammar Input;

NUM: [0-9]+;
ALPHA:[a-z]+;
WS : [ \t\r];

input: WS* cmd WS* ('|' WS* cmd)*;

cmd: id WS* (WS+  arg)*;
id: (ALPHA|NUM)(('-' | '_')*(ALPHA|NUM))*;
arg: (ALPHA|NUM)+;

NL: [\n]+ -> skip;
