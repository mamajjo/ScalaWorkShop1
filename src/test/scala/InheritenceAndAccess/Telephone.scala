package InheritenceAndAccess

class Telephone(imei:Int, phoneNumber:Int) extends Telegram(imei) {
  override def getDeviceInfo: String = super.getDeviceInfo + ": !Telephone!"
}
