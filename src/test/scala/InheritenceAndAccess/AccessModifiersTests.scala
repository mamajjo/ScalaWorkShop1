package InheritenceAndAccess
import  org.scalatest.FunSuite

class AccessModifiersTests extends FunSuite {
  val p = new IrPhone(123, 606245123)
  test("IrPhone._getIRDMessage") {
    assert(p.getIRMessage == "This is message")
  }
}
