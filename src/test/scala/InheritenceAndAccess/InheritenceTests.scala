package InheritenceAndAccess

import org.scalatest.FunSuite

class InheritenceTests extends FunSuite {
  val t = new Telegram(321)
  test("Telegram._protectedVar"){
    assert("cannot get value of protected Var" == "cannot get value of protected Var")
  }
  val p = new IrPhone(123, 606245123)
  test("Phone._getDeviceInfo") {
    assert(p.getIRMessage == "This is message")
  }
  // test to check if number is changable after workshop
}
