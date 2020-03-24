package InheritenceAndAccess
import scala.language.postfixOps

class Telegram(val IMEI:Int, var owner:Int) {
    protected def sendTextMessage(receiver:Int, message:String): String = {
        val tekst = "Message from: " + owner + "\n" + message + "\n" + "to: " receiver.toString
    }
}
