.386
.model flat, stdcall
option casemap :none
include \masm32\include\kernel32.inc
include \masm32\include\msvcrt.inc
includelib \masm32\lib\kernel32.lib
includelib \masm32\lib\msvcrt.lib

.data
_output_format db "%d", 0
_input_format db "%d", 0
_newline db 10, 0


.code

add PROC
a DWORD ?
b DWORD ?
push eax
pop ebx
add eax, ebx
ret
add ENDP

