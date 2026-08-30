package polyantha

case class Token(
    token: TokensTypes,
    lexeme: String,
    literal: Any,
    line: Int
) {
  def PolyaString(): Unit = {
    println(s"$token $lexeme $literal")
  }
}
