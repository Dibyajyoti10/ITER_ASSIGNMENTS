;name:Dibyajyoti Rautaray
;regno:2241018095
;Q4:2'S COMPLEMENT OF 8-BIT NUMBER


MOV AX,5000H
MOV DS,AX
;1'S COMPLEMENT
MOV AL,34H
NOT AL
;2'S COMPLEMENT
ADD AL,01
MOV [5000H],AL

HLT