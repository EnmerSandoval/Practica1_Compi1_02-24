package org.practice1.Lexer;

import java_cup.runtime.*;
import org.practice1.Errors.*;import java.util.ArrayList;

%%

%public
%class Lexer
%unicode
%caseless
%line
%column
%cup
%public

//REGEX
WHITESPCS       = ([\s\t\r\n]+)
DIGIT           = [0-9]
NUMBER          = ([0-9][0-9]*)
LETTER          = [a-zA-Z]
NAME            = {WHITESPCS}*({LETTER}|_)+({LETTER}|{DIGIT}|_)*

//Instructions
GRAPH           = "graficar"
ANIMATE         = "animar"

//OPERATORS
PLUS            = "+"
MINUS           = "-"
ASTHERISK       = "*"
DIVISION          = "/"
OPENPARENTHESIS = "("
CLOSEPARENTHESIS= ")"

//Colors
BLUE            = "azul"
RED             = "rojo"
YELLOW          = "amarillo"
GREEN           = "verde"

//Los colores a discrecion
ORANGE          = "naranja"
GOLD            = "oro"
VIOLET          = "violeta"
BROWN           = "cafe"
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

%{
    StringBuffer stringBuffer = new StringBuffer();
        ArrayList<ErrorL> errors = new ArrayList<ErrorL>();

        private Symbol symbol(int type){
            return new Symbol(type, yyline+1, yycolumn+1);
        }

        private Symbol symbol(int type, Object value){
            return new Symbol(type, yyline+1, yycolumn+1, value);
        }

        private addErrors(String message){
            errors.add(new ErrorL(yyline+1, yycolumn+1, "No se reconoce este simbolo", 0, message));
        }

    %}

%eofval{
    return new Symbol(ParserSym.EOF);
%eofval}

%%

{GRAPH}                  {return new Symbol(ParserSym.GRAPH, yytext());}
{ANIMATE}                {return new Symbol(ParserSym.ANIMATE, yytext());}
{PLUS}                   {return new Symbol(ParserSym.PLUS, yytext());}
{MINUS}                  {return new Symbol(ParserSym.MINUS, yytext());}
{ASTHERISK}              {return new Symbol(ParserSym.ASTHERISK, yytext());}
{DIVISION}               {return new Symbol(ParserSym.DIVISION, yytext());}
{LPAREN}                 {return new Symbol(ParserSym.LPAREN, yytext());}
{RPAREN}                 {return new Symbol(ParserSym.RPAREN, yytext());}
{BLUE}                   {return new Symbol(ParserSym.BLUE, yytext());}
{RED}                    {return new Symbol(ParserSym.RED, yytext());}
{YELLOW}                 {return new Symbol(ParserSym.YELLOW, yytext());}
{GREEN}                  {return new Symbol(ParserSym.GREEN, yytext());}
{ORANGE}                 {return new Symbol(ParserSym.ORANGE, yytext());}
{GOLD}                   {return new Symbol(ParserSym.GOLD, yytext());}
{VIOLET}                 {return new Symbol(ParserSym.VIOLET, yytext());}
{BROWN}                  {return new Symbol(ParserSym.BROWN, yytext());}
{BLACK}                  {return new Symbol(ParserSym.BLACK, yytext());}
{CURVE}                  {return new Symbol(ParserSym.CURVE, yytext());}
{CIRCLE}                 {return new Symbol(ParserSym.CIRCLE, yytext());}
{SQUARE}                 {return new Symbol(ParserSym.SQUARE, yytext());}
{RECTANGLE}              {return new Symbol(ParserSym.RECTANGLE, yytext());}
{LINE}                   {return new Symbol(ParserSym.LINE, yytext());}
{POLYGON}                {return new Symbol(ParserSym.POLYGON, yytext());}
{COMMA}                  {return new Symbol(ParserSym.COMMA, yytext());}
{NUMBER}                 {return new Symbol(ParserSym.NUMBER, yytext());}
{NAME}                   {return new Symbol(ParserSym.NAME, yytext());}
{WHITESPCS}              {/*ignore*/}

[^]                      {addError(yytext());}