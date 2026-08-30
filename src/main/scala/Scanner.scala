package com.polyantha

import scala.collection.mutable.ListBuffer

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

  def ScanToken() = {
    val c: Char = Advance()

    c match
      case '(' => AddToken(TokensTypes.LEFT_PAREN)
      case _   => ""
  }

  def ScanTokens: ListBuffer[Token] = {
    while (!IsAtEnd) {
      start = current
      ScanToken()
    }

    tokens += new Token(TokensTypes.EOF, "", null, line)
  }

  def IsAtEnd: Boolean = current >= source.length()
}
