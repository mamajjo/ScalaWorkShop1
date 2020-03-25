##### TODO

    Main object and method
    Vals and vars
    Classes and access modifiers
    Constructors
    Methods and fields
    Uniform access principle
    Parent classes and inheritance
    SBT and scala tools

# Scala workshop part 1

Aby rozpocząć pracę ze Scalą należy sprawdzić wersję Java'y,
 która musi być wyższa niż 1.8.x

```
java -version
```

## Rozpoczęcie pracy ze Scalą (SBT + VS code)
#### VS CODE Scala set up

Pobrać rozszerzenia:

```
scalameta.metals
scala-lang.scala
```

SBT to narzędzie do kompilowania, uruchamiania, testowania projektów utworzonych w Scali. 

1. Pobrać pakiet SBT
```
https://www.scala-sbt.org/release/docs/Setup.html
```

2. Otworzyć folder, gdzie chcemy stworzyć projekt oraz wpisujemy komendę:
```
sbt new scala/hello-world.g8
```
###### Gdy zostaniemy poproszeni wpisujemy nazwę projektu.
Struktura katalogów:
```
├── target
(....)
├── workshop1 // nazwa naszego projektu
│   ├── build.sbt // plik definiujący sbt
│   ├── project // folder z pluginami i dependencjami
│   │   └── build.properties
│   └── src
│       └── main
│           └── scala // w tym folderze trzymamy cały kod programu
│               └── Main.scala // wygenerowany z template'u Hello World
└── workshop1.md
```

3. W VS code otwieramy folder z plikiem build.sbt. Wewnątrz folderu projektu uruchamiamy sbt a następnie ~run (tylda spowoduje ponowne uruchomienia projektu za każdym zapisaniem pliku.)

```
sbt
~run
```

4. Dodawanie dependencji do projektu: otwórz plik build.sbt i dodaj linię:
```
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
Więcej bibliotek znajdziesz na:
https://index.scala-lang.org/
```
Po następnym uruchomieniu programu, sbt pobierze brakujące dependencje


## Rozpoczęcie pracy ze Scalą (IntelliJ):

1. Otwórz IntelliJ
2. Nowy projekt
3. Z lewego panelu Scala (jeżeli nie ma, to trzeba pobrać plugin)
4. Wybrać wersję Scali - jeżeli nie ma do wyboru należy pobrać (Create)
5. Next -> Nazwać projekt -> Done

### Pierwsza klasa App

Aby stworzyć 1. projekt Hello World
 
--> W folderze src nowego projektu dodaj nowy plik Scala Class

--> wygenerowany kod zastąp poniższym:

```
object Hello extends App {
  println("Hello World")
}
```  

--> prawym przyciskiem myszy podświetl obiekt Hello oraz naciśnij 'Run 'Hello' '

##### Troubleshooting 
Włączyć i wyłączyć IDE - bardzo pomaga w działaniu

# Workshop

Cały kod w projekcie Scala musi się zawierać w folderze src projektu.

## Main object and method

Głównym obiektem w programie napisanym w Scali będzie obiekt, który dziedziczy po klasie App -> ta klasa zamienia obiekt w program wykonywalny.

## Vals and vars

W Scali dostępne są obiekty:
#### Value
Zmienne poprzedzone słowem kluczowym val. Dzięki temu deklaruje się zmienną, której nie można zmienić w programie.

#### Variable 
Zmienne poprzedzone słowem kluczowym var. Są one zmienne w trakcie trwania programu.

<test valsAndVars>

## Classes and access modifiers

źródła:
```
https://stackoverflow.com/questions/1755345/difference-between-object-and-class-in-scala
https://docs.scala-lang.org/tour/traits.html
```

W Scali dostępne są dwa sposoby na tworzenie obiektów:

1) Implementacja klasy, następnie tworzenie instancji danej klasy. Otrzymujemy obiekt klasy X. Może dziedziczyć po Traits i Classes

2) Tworzenie instancji obiektu klasy anonimowej - wykorzystanie wzorca projektowego singleton. Ten obiekt może rozszerzać (extends)  cechę (Trait - odpowiednik interface'ów w Javie, jednak posiadający ewentualne pola) (przykład można zobaczyć przy tworzeniu obiektu udającego aplikację.)

## Constructors
W Scali konstruktory klas zawarte są przy jej definicji. Zmienne bez słowa kluczowego val/var stają private val. Atrybuty mogą otrzymać wartość domyślną. 

## Methods and fields
- metody klasy mogą być enkapsulowane - domyślnie jest to public. (czy można użyć słowa kluczowego 'public')


## Parent classes and inheritance


## SBT and scala tools
SBT to narzędzie do budowania projektów napisanych w Scali. Jest ono podobne np. do Maven

## Uniform Access Principle

What this principle is saying is that an API should not break if one of its public interfaces changes from returning a simple value to returning a value from a computation.


# Training

1) Zmodyfikować klasę Phone, tak aby móc zmienić numer telefonu. Wykazać w testach