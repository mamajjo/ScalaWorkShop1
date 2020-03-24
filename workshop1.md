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
javac -version
```

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

## Rozpoczęcie pracy ze Scalą (SBT)

SBT to narzędzie do kompilowania, uruchamiania, testowania projektów utworzonych w Scali. 

1. Pobrać pakiet SBT
```
https://www.scala-sbt.org/release/docs/Setup.html
```

2. Otworzyć folder, gdzie chcemy stworzyć projekt oraz wpisujemy komendę:
```
sbt new scala/hello-world.g8
```
Gdy zostaniemy poproszeni wpisujemy nazwę projektu.
Struktura katalogów: 
.
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

3. Wewnątrz folderu projektu uruchamiamy sbt a następnie ~run (tylda spowoduje ponowne uruchomienia projektu za każdym zapisaniem pliku.)

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

#### 
VS CODE set up - pobrać rozszerzenia: 
```
scalameta.metals
scala-lang.scala
```
##### Troubleshooting 

Jeżeli Scala Metal nie wyłapuje workspace to można spróbować przenieść build.properties do katalogi, gdzie zawiera się build.sbt
