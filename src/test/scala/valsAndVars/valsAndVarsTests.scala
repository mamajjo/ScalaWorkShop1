package valsAndVars
import org.scalatest.FunSuite

class valsAndVars extends FunSuite {
    test("Immutable Values") {
        val x:Int = 1 + 1
        assert(x == 2)
    }
    test("Mutable Variables") {
        var x:Int = 1 + 1
        var y = 4
        assert(x == 2)
        x = 3
        assert(x == 3)
        assert(y == 4)
    }

    val integerL: Int = 5
    var intererR = 5
    val short: Short = 10
    var str = "Scala workshop"
    val pi = 3.14

    val f: Any => String = {
      case _: Short => "Short"
      case _: Long => "Long"
      case _: Int => "Int"
      case _: String => "String"
      case _ => "Other"
    }
    test("Scala type inference"){
        assert(f(integerL) === "Int")
        assert(f(intererR) === "Int")
        assert(f(short) === "Short")
        assert(f(str) === "String")
        assert(f(pi) === "Other")
    }
}