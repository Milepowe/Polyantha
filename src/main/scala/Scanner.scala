package polyantha

import scala.collection.mutable.ListBuffer
import polyantha.TokensTypes.*

class Scanner(source: String) {
  private var tokens: ListBuffer[Token] = ListBuffer()
  var start = 0
  var current = 0
  var line = 1

  def Advance(): Char = {
    current += 1

    source.charAt(current - 1)
  }

  def AddToken(tokenType: TokensTypes, literal: Any = null): Unit = {
    val text = source.substring(start, current)
    tokens += new Token(tokenType, text, literal, line)
  }

  def ScanTokens() = {
    val c: Char = Advance()

    c match
      case '(' => AddToken(LEFT_PAREN)
      case ')' => AddToken(RIGHT_PAREN)
      case '{' => AddToken(LEFT_BRACE)
      case '}' => AddToken(RIGHT_BRACE)
      case '*' => AddToken(STAR)
      case '.' => AddToken(DOT)
      case ',' => AddToken(COMMA)
      case '+' => AddToken(PLUS)
      case '-' => AddToken(MINUS)
      case '/' => AddToken(SLASH)
      case _   => ""
  }

  def ScanToken(): ListBuffer[Token] = {
    while (!IsAtEnd) {
      start = current
      ScanTokens()
    }

    tokens += new Token(TokensTypes.EOF, "", null, line)
  }

  def IsAtEnd: Boolean = current >= source.length()
}
