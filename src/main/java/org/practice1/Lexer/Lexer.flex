package org.practice1.Lexer;

import java_cup.runtime.*;
import org.practice1.Cup.ParserSym;
import org.practice1.Errors.*;
import java.util.ArrayList;

%%

%public
%class Lexer
%unicode
%caseless
%line
%column
%cup



//Instructions
GRAPH           = "graficar"
ANIMATE         = "animar"
OBJECTO         = "objeto"
PREVIOUS        = "anterior"

//OPERATORS
PLUS            = "+"
MINUS           = "-"
ASTHERISK       = "*"
DIVISION        = "/"
LPAREN          = "("
RPAREN          = ")"

//Colors
BLUE            = "azul"
RED             = "rojo"
YELLOW          = "amarillo"
GREEN           = "verde"

//Los colores a discrecion
ORANGE          = "naranja"
GRAY            = "gris"
CYAN            = "celeste"
PINK            = "rosado"
BLACK           = "negro"

//Types of animation
//Linea ya esta especificado abajo
CURVE           = "curva"

//Objects to graph
CIRCLE          = "circulo"
SQUARE          = "cuadrado"
RECTANGLE       = "rectangulo"
LINE            = "linea"
POLYGON         = "poligono"

//signs
COMMA           = ","

//REGEX
WHITESPCS       = ([\s\t\r\n]+)
DIGIT           = [0-9]
NUMBER          = ([0-9])+
REAL            = ([0-9]+(\.[0-9]+)?([eE][-+]?[0-9]+)?) | (\.[0-9]+([eE][-+]?[0-9]+)?)
LETTER          = [a-zA-Z]
NAME            = ({LETTER}|_)+({LETTER}|{DIGIT}|_)*

%{
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<ErrorL> errors = new ArrayList<ErrorL>();

        private Symbol symbol(int type){
            return new Symbol(type, yyline+1, yycolumn+1);
        }

        private Symbol symbol(int type, Object value){
            return new Symbol(type, yyline+1, yycolumn+1, value);
        }

        public ArrayList<ErrorL> getErrorsLexicos(){
            return this.errors;
        }
%}

%eofval{
    return new Symbol(ParserSym.EOF);
%eofval}

%%

//Instructions
{GRAPH}                  {return new Symbol(ParserSym.GRAPH, yycolumn, yyline, yytext());}
{ANIMATE}                {return new Symbol(ParserSym.ANIMATE, yycolumn, yyline, yytext());}
{OBJECTO}                {return new Symbol(ParserSym.OBJECTO, yycolumn, yyline, yytext());}
{PREVIOUS}               {return new Symbol(ParserSym.PREVIOUS, yycolumn, yyline, yytext());}

//Operators
{PLUS}                   {return new Symbol(ParserSym.PLUS, yycolumn, yyline, yytext());}
{MINUS}                  {return new Symbol(ParserSym.MINUS, yycolumn, yyline, yytext());}
{ASTHERISK}              {return new Symbol(ParserSym.ASTHERISK, yycolumn, yyline, yytext());}
{DIVISION}               {return new Symbol(ParserSym.DIVISION, yycolumn, yyline, yytext());}
{LPAREN}                 {return new Symbol(ParserSym.LPAREN, yycolumn, yyline, yytext());}
{RPAREN}                 {return new Symbol(ParserSym.RPAREN, yycolumn, yyline, yytext());}

//Colors
{BLUE}                   {return new Symbol(ParserSym.BLUE, yycolumn, yyline, yytext());}
{RED}                    {return new Symbol(ParserSym.RED, yycolumn, yyline, yytext());}
{YELLOW}                 {return new Symbol(ParserSym.YELLOW, yycolumn, yyline, yytext());}
{GREEN}                  {return new Symbol(ParserSym.GREEN, yycolumn, yyline, yytext());}
{ORANGE}                 {return new Symbol(ParserSym.ORANGE, yycolumn, yyline, yytext());}
{GRAY}                   {return new Symbol(ParserSym.GRAY, yycolumn, yyline, yytext());}
{CYAN}                   {return new Symbol(ParserSym.CYAN, yycolumn, yyline, yytext());}
{PINK}                   {return new Symbol(ParserSym.PINK, yycolumn, yyline, yytext());}
{BLACK}                  {return new Symbol(ParserSym.BLACK, yycolumn, yyline, yytext());}

//Type Animations
{CURVE}                  {return new Symbol(ParserSym.CURVE, yycolumn, yyline, yytext());}

//Objects
{CIRCLE}                 {return new Symbol(ParserSym.CIRCLE, yycolumn, yyline, yytext());}
{SQUARE}                 {return new Symbol(ParserSym.SQUARE, yycolumn, yyline, yytext());}
{RECTANGLE}              {return new Symbol(ParserSym.RECTANGLE, yycolumn, yyline, yytext());}
{LINE}                   {return new Symbol(ParserSym.LINE, yycolumn, yyline, yytext());}
{POLYGON}                {return new Symbol(ParserSym.POLYGON, yycolumn, yyline, yytext());}

//Comma, numbers and white spaces
{COMMA}                  {return new Symbol(ParserSym.COMMA, yyline, yycolumn, yytext());}
{NUMBER}                 {return new Symbol(ParserSym.NUMBER, yyline, yycolumn, yytext());}
{REAL}                   {return new Symbol(ParserSym.REAL, yyline, yycolumn, yytext());}
{NAME}                   {return new Symbol(ParserSym.NAME, yyline, yycolumn, yytext());}
{WHITESPCS}              {/*ignore*/}

//Errors
[^]                      {errors.add(new ErrorL(yytext(), yyline, yycolumn, "Error Lexico", "Este caracter no es aceptado en nuestro alfabeto"));}