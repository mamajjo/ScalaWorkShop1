import InheritenceAndAccess.{Device, IrPhone, Smartphone, Telegram}

object DeviceLists extends App {
  val listOfElectricDevices = new Array[Device](3)
  listOfElectricDevices(0) = new Telegram(123)
  listOfElectricDevices(1) = new IrPhone(321, 505245213)
  listOfElectricDevices(2) = new Smartphone(312, 123123123, true)
  for (device <- listOfElectricDevices) println(device.getDeviceInfo)
}
