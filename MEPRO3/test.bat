@echo off

REM Activamos codificacion
chcp 1252

echo Ejecutamos tests...
java -jar .\lib\junit-platform-console-standalone-1.6.2.jar ^
     --classpath .\bin ^
     --disable-ansi-colors ^
     --exclude-engine junit-vintage ^
     --scan-class-path