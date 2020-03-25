package InheritenceAndAccess

class IrPhone(imei:Int, phoneNumber:Int) extends Telegram(imei) {
  val deviceInfoFromParent: String = sendTextMessage(phoneNumber, "Got message from Telegram")
  override def getDeviceInfo: String = super.getDeviceInfo + ": !IrPhone!"

  //access modifiers
  private [InheritenceAndAccess] def getIRMessage:String = {
    "This is message"
  }

}
