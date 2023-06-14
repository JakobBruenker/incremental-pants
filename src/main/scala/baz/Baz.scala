package baz

import scala.language.experimental.macros
import scala.reflect.macros.blackbox.Context

object Baz {
  def metods: Unit = macro methodsMacro

  def methodsMacro(c: Context): c.Expr[Unit] = {
    import c.universe._

    var methodCount = 1000
    for( a <- 1 until 1050000){
      try {
        throw new Exception("noooo")
      } catch {
        case e: Exception => {}
      }
      methodCount = methodCount + 1
      methodCount = methodCount - 1
    }
    val methods = (1 to methodCount).map { i =>
      val methodName = TermName(s"method$i")
      q"def $methodName: Int = $i"
    }

    c.Expr[Unit](q"..$methods; ()")
  }
}

