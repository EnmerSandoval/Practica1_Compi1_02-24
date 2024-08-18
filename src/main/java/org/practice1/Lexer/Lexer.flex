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
/*
        private addError(String message){
            errors.add(new ErrorL(yyline+1, yycolumn+1, "No se reconoce este simbolo", 0, message));
        }
*/
%}

%eofval{
    return new Symbol(ParserSym.EOF);
%eofval}

%%

//Instructions
{GRAPH}                  {return new Symbol(ParserSym.GRAPH, yytext());}
{ANIMATE}                {return new Symbol(ParserSym.ANIMATE, yytext());}
{OBJECTO}                {return new Symbol(ParserSym.OBJECTO, yytext());}
{PREVIOUS}               {return new Symbol(ParserSym.PREVIOUS, yytext());}

//Operators
{PLUS}                   {return new Symbol(ParserSym.PLUS, yycolumn, yyline, yytext());}
{MINUS}                  {return new Symbol(ParserSym.MINUS, yycolumn, yyline, yytext());}
{ASTHERISK}              {return new Symbol(ParserSym.ASTHERISK, yycolumn, yyline, yytext());}
{DIVISION}               {return new Symbol(ParserSym.DIVISION, yycolumn, yyline, yytext());}
{LPAREN}                 {return new Symbol(ParserSym.LPAREN, yycolumn, yyline, yytext());}
{RPAREN}                 {return new Symbol(ParserSym.RPAREN, yycolumn, yyline, yytext());}

//Colors
{BLUE}                   {return new Symbol(ParserSym.BLUE, yytext());}
{RED}                    {return new Symbol(ParserSym.RED, yytext());}
{YELLOW}                 {return new Symbol(ParserSym.YELLOW, yytext());}
{GREEN}                  {return new Symbol(ParserSym.GREEN, yytext());}
{ORANGE}                 {return new Symbol(ParserSym.ORANGE, yytext());}
{GRAY}                   {return new Symbol(ParserSym.GRAY, yytext());}
{CYAN}                   {return new Symbol(ParserSym.CYAN, yytext());}
{PINK}                   {return new Symbol(ParserSym.PINK, yytext());}
{BLACK}                  {return new Symbol(ParserSym.BLACK, yytext());}

//Type Animations
{CURVE}                  {return new Symbol(ParserSym.CURVE, yytext());}

//Objects
{CIRCLE}                 {return new Symbol(ParserSym.CIRCLE, yytext());}
{SQUARE}                 {return new Symbol(ParserSym.SQUARE, yytext());}
{RECTANGLE}              {return new Symbol(ParserSym.RECTANGLE, yytext());}
{LINE}                   {return new Symbol(ParserSym.LINE, yytext());}
{POLYGON}                {return new Symbol(ParserSym.POLYGON, yytext());}

//Comma, numbers and white spaces
{COMMA}                  {return new Symbol(ParserSym.COMMA, yytext());}
{NUMBER}                 {return new Symbol(ParserSym.NUMBER, yytext());}
{REAL}                   {return new Symbol(ParserSym.REAL, yytext());}
{NAME}                   {return new Symbol(ParserSym.NAME, yytext());}
{WHITESPCS}              {/*ignore*/}

//Errors
[^]                      {/*addError(yytext());*/}