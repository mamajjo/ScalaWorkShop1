package Classes

import org.scalatest.FunSuite

//
class Animal(val name: String, _secretTrait: String, var weight: Float = 0) {
// w konstruktorze widoczne są trzy formy atrybutów klasy 1) niezmienialne Imie, 2) prywatny sekret, 3) zmienialna waga

    private var _secretTraitToChange: String = "secret" // utworzenie prywatnej zmiennej typu String
//getter do prywatnego value secret i _secretTraitToChange
    def secretTrait:String = _secretTrait
    def secretTraitToChange: String = _secretTraitToChange
    //setter do prywatnego pola secret
    // _= oznacza utworzenie settera do zmiennej
    def secretTraitToChange_= (newSecret: String): Unit = {
        if (newSecret != "") _secretTraitToChange = newSecret
    }
    val speakValue = "I'm Rex"
    //unified access princalple
    val speakFunction = () => "I'm " + name

}