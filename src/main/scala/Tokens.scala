package com.polyantha

case class Token(
    token: TokensTypes,
    lexeme: String,
    literal: Any,
    line: Int
) {
  def PolyaString(): Unit = {
    print(s"$token $lexeme $literal")
  }
}
