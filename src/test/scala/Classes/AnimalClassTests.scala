package Classes

import org.scalatest.FunSuite

class AnimalClassTests extends FunSuite{
  var a = new Animal("Rex", "I'm private value")
  test("Animal._secretTraitToChange"){
    //use setter to set value and check it's value
    val newValue = "new secret value"
    a.secretTraitToChange = newValue
    assert(a.secretTraitToChange == newValue)
  }
  test("Animal.weightDefault"){
    //check if equals 0
    assert(a.weight == 0)

    //change value and check it's value
    val double = 5.5
    a.weight = double.toFloat
    assert(a.weight == 5.5)
  }
  test("Animal.speakUAP"){
    //
    assert(a.speakFunction() == a.speakValue)
  }
}