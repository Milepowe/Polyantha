package com.polyantha

class Scanner() {
  private val source: String = ""
  private var token: List[Token] = List()
  var start = 0
  var current = 0
  var line = 1

  def advance() = {
    current += 1

    source.substring(current - 1)
  }
}
