package ClassesTests

//
class Animal(val name: String, _secretTrait: String ,var weight: Float = 0) {
// w konstruktorze widoczne są trzy formy atrybutów klasy 1) niezmienialne Imie, 2) prywatny sekret, 3) zmienialna waga
    var _secretTraitToChange: String = "sekret"
//getter do prywatnego value secret
    def secretTrait = _secretTrait
//setter do prywatnego pola secret
    def secretTraitToChange_= (newSecret: String): String = {
        if (newSecret == "") _secretTraitToChange else newSecret
    }
}
