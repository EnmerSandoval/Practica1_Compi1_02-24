// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: Lexer.flex

package org.practice1.Lexer;

import java_cup.runtime.*;
import org.practice1.Cup.ParserSym;
import org.practice1.Errors.*;
import java.util.ArrayList;


@SuppressWarnings("fallthrough")
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\24\u0200\1\u0300\11\u0200\1\u0400\17\u0200\1\u0500"+
    "\u10cf\u0200";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\5\1\22\0\1\1\7\0\1\2\1\3\1\4"+
    "\1\5\1\6\1\7\1\10\1\11\12\12\3\0\1\13"+
    "\3\0\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\23\1\26\1\27\1\30\1\31"+
    "\1\32\1\23\1\33\1\23\1\34\1\35\1\36\3\23"+
    "\1\37\4\0\1\23\1\0\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\23\1\26"+
    "\1\27\1\30\1\31\1\32\1\23\1\33\1\23\1\34"+
    "\1\35\1\36\3\23\1\37\12\0\1\1\32\0\1\1"+
    "\217\0\2\40\u024e\0\1\1\177\0\13\1\35\0\2\1"+
    "\5\0\1\1\57\0\1\1\240\0\1\1\377\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1536];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\1\1\11\1\12\1\13\12\14\1\15\2\0"+
    "\6\14\1\0\2\14\1\0\11\14\2\0\1\15\3\14"+
    "\1\0\5\14\1\0\2\14\1\0\3\14\1\16\5\14"+
    "\1\0\3\14\1\0\1\17\1\20\3\14\1\0\2\14"+
    "\1\0\4\14\1\0\1\14\1\21\2\14\1\0\1\14"+
    "\1\0\2\14\1\0\2\14\1\22\1\0\1\14\1\0"+
    "\2\23\1\14\1\24\2\14\1\0\1\14\1\25\1\14"+
    "\1\0\1\14\1\0\1\26\1\14\1\0\1\26\2\14"+
    "\1\0\1\14\1\0\1\14\1\27\1\14\1\0\2\14"+
    "\1\0\1\14\1\0\1\14\1\0\1\30\1\14\1\30"+
    "\1\14\1\0\1\31\1\14\1\0\1\14\2\32\2\33"+
    "\2\34\1\35\2\36\2\37\2\14\1\40";

  private static int [] zzUnpackAction() {
    int [] result = new int[161];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\41\0\102\0\41\0\41\0\41\0\41\0\41"+
    "\0\41\0\143\0\41\0\204\0\41\0\245\0\306\0\347"+
    "\0\u0108\0\u0129\0\u014a\0\u016b\0\u018c\0\u01ad\0\u01ce\0\u01ef"+
    "\0\143\0\u0210\0\u0231\0\u0252\0\u0273\0\u0294\0\u02b5\0\u02d6"+
    "\0\u02f7\0\u0318\0\u0339\0\u035a\0\u037b\0\u039c\0\u03bd\0\u03de"+
    "\0\u03ff\0\u0420\0\u0441\0\u0462\0\u0483\0\u04a4\0\u04c5\0\u04c5"+
    "\0\u04e6\0\u0507\0\u0528\0\u0549\0\u056a\0\u058b\0\u05ac\0\u05cd"+
    "\0\u05ee\0\u060f\0\u0630\0\u0651\0\u0672\0\u0693\0\u06b4\0\u06d5"+
    "\0\306\0\u06f6\0\u0717\0\u0738\0\u0759\0\u077a\0\u079b\0\u07bc"+
    "\0\u07dd\0\u07fe\0\u081f\0\306\0\306\0\u0840\0\u0861\0\u0882"+
    "\0\u08a3\0\u08c4\0\u08e5\0\u0906\0\u0927\0\u0948\0\u0969\0\u098a"+
    "\0\u09ab\0\u09cc\0\306\0\u09ed\0\u0a0e\0\u0a2f\0\u0a50\0\u0a71"+
    "\0\u0a92\0\u0ab3\0\u0ad4\0\u0af5\0\u0b16\0\306\0\u0b37\0\u0b58"+
    "\0\u0b79\0\306\0\41\0\u0b9a\0\306\0\u0bbb\0\u0bdc\0\u0bfd"+
    "\0\u0c1e\0\306\0\u0c3f\0\u0c60\0\u0c81\0\u0ca2\0\306\0\u0cc3"+
    "\0\u0ce4\0\41\0\u0d05\0\u0d26\0\u0d47\0\u0d68\0\u0d89\0\u0daa"+
    "\0\306\0\u0dcb\0\u0dec\0\u0e0d\0\u0e2e\0\u0e4f\0\u0e70\0\u0e91"+
    "\0\u0eb2\0\u0ed3\0\306\0\u0ef4\0\41\0\u0f15\0\u0f36\0\306"+
    "\0\u0f57\0\u0f78\0\u0f99\0\306\0\41\0\306\0\41\0\306"+
    "\0\41\0\306\0\306\0\41\0\306\0\41\0\u0fba\0\u0fdb"+
    "\0\306";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[161];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\3\17"+
    "\1\21\3\17\1\22\1\17\1\23\1\24\1\25\1\26"+
    "\2\17\1\27\1\17\1\2\42\0\1\3\12\0\24\17"+
    "\13\0\1\30\36\0\1\31\1\0\1\14\5\0\1\32"+
    "\32\0\1\17\1\0\13\17\1\33\1\34\6\17\1\35"+
    "\13\0\1\17\1\0\24\17\13\0\1\17\1\0\1\36"+
    "\7\17\1\37\10\17\1\40\2\17\1\41\12\0\1\17"+
    "\1\0\17\17\1\42\4\17\13\0\1\17\1\0\10\17"+
    "\1\43\13\17\1\44\12\0\1\17\1\0\1\45\3\17"+
    "\1\46\17\17\13\0\1\17\1\0\1\17\1\47\15\17"+
    "\1\50\4\17\13\0\1\17\1\0\15\17\1\51\6\17"+
    "\13\0\1\17\1\0\4\17\1\52\10\17\1\53\6\17"+
    "\13\0\1\17\1\0\4\17\1\54\3\17\1\55\13\17"+
    "\1\56\12\0\1\30\5\0\1\32\25\0\1\57\1\0"+
    "\1\57\2\0\1\60\40\0\1\17\1\0\1\61\23\17"+
    "\13\0\1\17\1\0\10\17\1\62\7\17\1\63\3\17"+
    "\1\64\12\0\1\17\1\0\21\17\1\65\2\17\13\0"+
    "\1\17\1\0\5\17\1\66\16\17\13\0\1\17\1\0"+
    "\17\17\1\67\4\17\13\0\1\17\1\0\1\70\16\17"+
    "\1\71\4\17\34\0\1\72\17\0\1\17\1\0\1\73"+
    "\23\17\13\0\1\17\1\0\14\17\1\74\7\17\31\0"+
    "\1\75\22\0\1\17\1\0\17\17\1\76\4\17\13\0"+
    "\1\17\1\0\6\17\1\77\15\17\13\0\1\17\1\0"+
    "\11\17\1\100\12\17\13\0\1\17\1\0\15\17\1\101"+
    "\6\17\13\0\1\17\1\0\12\17\1\102\11\17\13\0"+
    "\1\17\1\0\2\17\1\103\21\17\13\0\1\17\1\0"+
    "\11\17\1\104\12\17\13\0\1\17\1\0\17\17\1\105"+
    "\4\17\13\0\1\17\1\0\15\17\1\106\6\17\32\0"+
    "\1\107\21\0\1\60\40\0\1\17\1\0\17\17\1\110"+
    "\4\17\13\0\1\17\1\0\13\17\1\111\10\17\13\0"+
    "\1\17\1\0\4\17\1\112\17\17\30\0\1\113\23\0"+
    "\1\17\1\0\12\17\1\114\11\17\13\0\1\17\1\0"+
    "\4\17\1\115\17\17\13\0\1\17\1\0\2\17\1\116"+
    "\21\17\13\0\1\17\1\0\3\17\1\117\20\17\13\0"+
    "\1\17\1\0\22\17\1\120\1\17\17\0\1\121\34\0"+
    "\1\17\1\0\5\17\1\122\16\17\13\0\1\17\1\0"+
    "\4\17\1\123\17\17\21\0\1\124\32\0\1\17\1\0"+
    "\1\125\23\17\13\0\1\17\1\0\17\17\1\126\4\17"+
    "\13\0\1\17\1\0\4\17\1\127\17\17\13\0\1\17"+
    "\1\0\10\17\1\130\13\17\1\131\12\0\1\17\1\0"+
    "\20\17\1\132\3\17\13\0\1\17\1\0\15\17\1\133"+
    "\6\17\13\0\1\17\1\0\3\17\1\134\20\17\13\0"+
    "\1\17\1\0\12\17\1\135\11\17\27\0\1\136\24\0"+
    "\1\17\1\0\10\17\1\137\13\17\1\140\12\0\1\17"+
    "\1\0\1\141\23\17\13\0\1\17\1\0\17\17\1\142"+
    "\4\17\15\0\1\143\36\0\1\17\1\0\21\17\1\144"+
    "\2\17\13\0\1\17\1\0\17\17\1\145\4\17\13\0"+
    "\1\17\1\0\1\146\23\17\36\0\1\147\15\0\1\17"+
    "\1\0\10\17\1\150\13\17\1\151\12\0\1\17\1\0"+
    "\1\152\23\17\15\0\1\153\36\0\1\17\1\0\14\17"+
    "\1\154\7\17\13\0\1\17\1\0\15\17\1\155\6\17"+
    "\13\0\1\17\1\0\20\17\1\156\3\17\13\0\1\17"+
    "\1\0\6\17\1\157\15\17\23\0\1\160\30\0\1\17"+
    "\1\0\1\161\23\17\13\0\1\17\1\0\4\17\1\162"+
    "\17\17\13\0\1\17\1\0\4\17\1\163\17\17\21\0"+
    "\1\164\32\0\1\17\1\0\12\17\1\165\11\17\27\0"+
    "\1\166\24\0\1\17\1\0\17\17\1\167\4\17\13\0"+
    "\1\17\1\0\10\17\1\170\13\17\1\171\33\0\1\172"+
    "\17\0\1\17\1\0\12\17\1\173\11\17\13\0\1\17"+
    "\1\0\1\174\23\17\27\0\1\175\24\0\1\17\1\0"+
    "\2\17\1\176\21\17\17\0\1\177\34\0\1\17\1\0"+
    "\11\17\1\200\12\17\13\0\1\17\1\0\15\17\1\201"+
    "\6\17\13\0\1\17\1\0\15\17\1\202\6\17\32\0"+
    "\1\203\21\0\1\17\1\0\14\17\1\204\7\17\13\0"+
    "\1\17\1\0\20\17\1\205\3\17\35\0\1\206\16\0"+
    "\1\17\1\0\12\17\1\207\11\17\27\0\1\210\24\0"+
    "\1\17\1\0\15\17\1\211\6\17\32\0\1\212\21\0"+
    "\1\17\1\0\15\17\1\213\6\17\13\0\1\17\1\0"+
    "\3\17\1\214\20\17\32\0\1\215\21\0\1\17\1\0"+
    "\1\216\23\17\15\0\1\217\36\0\1\17\1\0\1\220"+
    "\23\17\13\0\1\17\1\0\14\17\1\221\7\17\31\0"+
    "\1\222\22\0\1\17\1\0\6\17\1\223\15\17\13\0"+
    "\1\17\1\0\1\224\23\17\15\0\1\225\36\0\1\17"+
    "\1\0\15\17\1\226\6\17\32\0\1\227\21\0\1\17"+
    "\1\0\17\17\1\230\4\17\34\0\1\231\17\0\1\17"+
    "\1\0\15\17\1\232\6\17\13\0\1\17\1\0\17\17"+
    "\1\233\4\17\34\0\1\234\17\0\1\17\1\0\15\17"+
    "\1\235\6\17\32\0\1\236\21\0\1\17\1\0\21\17"+
    "\1\237\2\17\13\0\1\17\1\0\12\17\1\240\11\17"+
    "\13\0\1\17\1\0\15\17\1\241\6\17\1\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[4092];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\6\11\1\1\1\11\1\1\1\11"+
    "\13\1\2\0\6\1\1\0\2\1\1\0\11\1\2\0"+
    "\4\1\1\0\5\1\1\0\2\1\1\0\11\1\1\0"+
    "\3\1\1\0\5\1\1\0\2\1\1\0\4\1\1\0"+
    "\4\1\1\0\1\1\1\0\2\1\1\0\3\1\1\0"+
    "\1\1\1\0\1\1\1\11\4\1\1\0\3\1\1\0"+
    "\1\1\1\0\2\1\1\0\1\11\2\1\1\0\1\1"+
    "\1\0\3\1\1\0\2\1\1\0\1\1\1\0\1\1"+
    "\1\0\2\1\1\11\1\1\1\0\2\1\1\0\2\1"+
    "\1\11\1\1\1\11\1\1\1\11\2\1\1\11\1\1"+
    "\1\11\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[161];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
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


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          {     return new Symbol(ParserSym.EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { /*addError(yytext());*/
            }
          // fall through
          case 33: break;
          case 2:
            { /*ignore*/
            }
          // fall through
          case 34: break;
          case 3:
            { return new Symbol(ParserSym.LPAREN, yycolumn, yyline, yytext());
            }
          // fall through
          case 35: break;
          case 4:
            { return new Symbol(ParserSym.RPAREN, yycolumn, yyline, yytext());
            }
          // fall through
          case 36: break;
          case 5:
            { return new Symbol(ParserSym.ASTHERISK, yycolumn, yyline, yytext());
            }
          // fall through
          case 37: break;
          case 6:
            { return new Symbol(ParserSym.PLUS, yycolumn, yyline, yytext());
            }
          // fall through
          case 38: break;
          case 7:
            { return new Symbol(ParserSym.COMMA, yytext());
            }
          // fall through
          case 39: break;
          case 8:
            { return new Symbol(ParserSym.MINUS, yycolumn, yyline, yytext());
            }
          // fall through
          case 40: break;
          case 9:
            { return new Symbol(ParserSym.DIVISION, yycolumn, yyline, yytext());
            }
          // fall through
          case 41: break;
          case 10:
            { return new Symbol(ParserSym.NUMBER, yytext());
            }
          // fall through
          case 42: break;
          case 11:
            { return new Symbol(ParserSym.EQUALS, yycolumn, yyline, yytext());
            }
          // fall through
          case 43: break;
          case 12:
            { return new Symbol(ParserSym.NAME, yytext());
            }
          // fall through
          case 44: break;
          case 13:
            { return new Symbol(ParserSym.REAL, yytext());
            }
          // fall through
          case 45: break;
          case 14:
            { return new Symbol(ParserSym.GOLD, yytext());
            }
          // fall through
          case 46: break;
          case 15:
            { return new Symbol(ParserSym.BLUE, yytext());
            }
          // fall through
          case 47: break;
          case 16:
            { return new Symbol(ParserSym.BROWN, yytext());
            }
          // fall through
          case 48: break;
          case 17:
            { return new Symbol(ParserSym.RED, yytext());
            }
          // fall through
          case 49: break;
          case 18:
            { return new Symbol(ParserSym.CURVE, yytext());
            }
          // fall through
          case 50: break;
          case 19:
            { return new Symbol(ParserSym.LINE, yytext());
            }
          // fall through
          case 51: break;
          case 20:
            { return new Symbol(ParserSym.BLACK, yytext());
            }
          // fall through
          case 52: break;
          case 21:
            { return new Symbol(ParserSym.GREEN, yytext());
            }
          // fall through
          case 53: break;
          case 22:
            { return new Symbol(ParserSym.ANIMATE, yytext());
            }
          // fall through
          case 54: break;
          case 23:
            { return new Symbol(ParserSym.OBJECTO, yytext());
            }
          // fall through
          case 55: break;
          case 24:
            { return new Symbol(ParserSym.CIRCLE, yytext());
            }
          // fall through
          case 56: break;
          case 25:
            { return new Symbol(ParserSym.ORANGE, yytext());
            }
          // fall through
          case 57: break;
          case 26:
            { return new Symbol(ParserSym.VIOLET, yytext());
            }
          // fall through
          case 58: break;
          case 27:
            { return new Symbol(ParserSym.YELLOW, yytext());
            }
          // fall through
          case 59: break;
          case 28:
            { return new Symbol(ParserSym.PREVIOUS, yytext());
            }
          // fall through
          case 60: break;
          case 29:
            { return new Symbol(ParserSym.SQUARE, yytext());
            }
          // fall through
          case 61: break;
          case 30:
            { return new Symbol(ParserSym.GRAPH, yytext());
            }
          // fall through
          case 62: break;
          case 31:
            { return new Symbol(ParserSym.POLYGON, yytext());
            }
          // fall through
          case 63: break;
          case 32:
            { return new Symbol(ParserSym.RECTANGLE, yytext());
            }
          // fall through
          case 64: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
