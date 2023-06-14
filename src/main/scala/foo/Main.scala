package foo

import bar.Bar

object Main {
  def main(args: Array[String]): Unit = {
    println("test")
    Bar.printStuff
  }
}

