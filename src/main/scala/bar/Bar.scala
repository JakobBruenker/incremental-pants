package bar

import baz.Baz

object Bar {
  def printStuff: Unit = {
    println("stuff")
    println(s"methods: ${Baz.metods}")
  }
}
