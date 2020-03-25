package InheritenceAndAccess

class Smartphone(imei:Int, var phoneNumber:Int, val hasCellular: Boolean) extends Telephone (imei, phoneNumber){
  override def getDeviceInfo: String = super.getDeviceInfo + "Smart"
  
}
