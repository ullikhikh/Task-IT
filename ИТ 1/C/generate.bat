@echo off
java -jar lib\antlr-4.9.3-complete.jar ^
  -package ru.vsu.cs ^
  -visitor ^
  -no-listener ^
  -o src\main\java\ru\vsu\cs ^
  src\main\antlr\CSubset.g4
pause