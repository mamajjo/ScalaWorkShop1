package InheritenceAndAccess

import org.scalatest.FunSuite

class InheritenceTests extends FunSuite {
  val t = new Telegram(321)
  test("Telegram._getDeviceInfo"){
    assert("cannot get info" == "cannot get info")
  }
  val p = new IrPhone(123, 606245123)
  test("Phone._getDeviceInfo") {
    assert(p.getIRMessage == "This is message")
  }
}
