package InheritenceAndAccess

class Telegram(var imei:Int) extends Device {
    protected var owner:String = "telegram"
    // nie ma potrzeby dodawania listy argumentów przy definiowaniu funkcji. Return nie jest obligatoryjny.
    def getDeviceInfo: String = {
        val mess = "Device with IMEI: " + imei.toString + " and owner: " + owner.toString
        mess
    }
    def sendTextMessage(receiver:Int, message:String): String = {
        val mess = "Message from: " + owner.toString + "\n" + message + "\n" + "to: " + receiver.toString
        mess
    }
}
