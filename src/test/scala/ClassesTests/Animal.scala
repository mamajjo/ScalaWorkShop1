package ClassesTests

import org.scalatest.FunSuite

//
class Animal(val name: String, _secretTrait: String, var weight: Float = 0) {
// w konstruktorze widoczne są trzy formy atrybutów klasy 1) niezmienialne Imie, 2) prywatny sekret, 3) zmienialna waga

    var _secretTraitToChange: String = "sekret" // utworzenie prywatnej zmiennej typu String
//getter do prywatnego value secret
    def secretTrait = _secretTrait
//setter do prywatnego pola secret
    def secretTraitToChange = _secretTraitToChange
    // _= oznacza przypisanie settera do zmiennej
    def secretTraitToChange_= (newSecret: String): String = {
        if (newSecret == "") _secretTraitToChange else newSecret
    }

    //unified access princalple
    val speak = () => "I'm " + name

}


class AnimalTests extends FunSuite{
    var a = new Animal("Rex", "I'm private value")
    test("Animal._secretTraitToChange"){
        //use setter to set value and check it's value

    }
    test("Animal.weightDefault"){
        //check if equals 0

        //change value and check it's value
    }
    test("Animal.weight") {
        // save weight value to variable and check it. 
        // use public member to change it's value
    }
    test("Animal.speak"){
        //
        assert(a.speak() == "I'm Rex")
    }
}