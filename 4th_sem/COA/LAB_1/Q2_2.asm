;name:Dibyajyoti Rautaray
;regno:2241018095
;Q2_ii:Y=<DATA1 AND DATA2>OR<DATA1 XOR DATA2>


MOV SI,1000H
MOV AL,[SI]
INC SI
MOV BL,[SI]
MOV CL,AL
AND AL,BL
XOR CL,BL
OR AL,CL
INC SI
MOV [SI],AL

HLT