;name:Dibyajyoti Rautaray
;regno:2241018095
;Q3:GRAY CODE OF AN 8-BIT BINARY NUMBER


MOV AX,5000H
MOV AL,0B3H
MOV BL,AL
SHR AL,01
XOR AL,BL
MOV [5000H],AL

HLT