package polyantha

case class Token(
    token: TokensTypes,
    lexeme: String,
    literal: Any,
    line: Int
)
