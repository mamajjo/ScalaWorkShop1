import org.scalatest.FunSuite
import Calculator.scala.Calculator

class CalculatorTest extends FunSuite {
  test("Calculator.cube") {
    assert(Calculator.cube(3) === 27 )
  }
}