// TODO add the different functions
object Polyantha {
  def main(args: Array[String]): Unit = {
    args match
      case Array()     => RunPrompt()
      case Array(path) => Run(path)
      case _           => println("Usage: Polyantha [script]")
  }

  def RunPrompt(): Unit = {
    println("TODO!")
  }

  def Run(path: String): Unit = {
    print("TODO!")
  }
}
