import scala.annotation.tailrec
import scala.io.{Source, StdIn}
import scala.util.control.TailCalls.TailRec

object Polyantha {
  def main(args: Array[String]): Unit = {
    args match
      case Array()     => RunPrompt()
      case Array(path) => Run(path)
      case _           => println("Usage: Polyantha [script]")
  }

@tailrec  def RunPrompt(): Unit = {
    print("> ")
    Run(StdIn.readLine())

    RunPrompt()
  }

  // Todo!
  def Run(path: String): Unit = {
    println(path)
  }
}
