class Token {

  enum TokenType {

    // Separators
    case LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE, 
    COMMA, DOT, MINUS, PLUS, STAR, SLASH

    // Operators
    case EQUAL, LESS_EQUAL, GREATER_EQUAL,
    LESS, GREATER

    // Variables Types
    case STRING, INT, FLOAT, IDENTIFIER, BOOLEAN

    // Keywords
    case AND, OR, IF, ELSE, FUNCTION, WHILE, FOR, RETURN,
    PRINT, VAR, CONST

  }


}

