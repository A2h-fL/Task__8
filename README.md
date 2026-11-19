# Task 8: Packages and Interfaces in Java

University laboratory assignment for Computer Science at Vistula University. This project demonstrates the usage of **abstract classes, inheritance, packages, and interfaces** (including abstract methods, default methods, and static methods) in Java.

## Task Requirements

1. **Animal Hierarchy:** Utilizes an abstract class `Animal` with a multi-level class hierarchy:
   - `Animal` -> `Mammal` -> `Dog`
   - `Animal` -> `Bird` -> `Pigeon`
   - `Animal` -> `Fish` -> `Blowfish`
2. **Interfaces:**
   - `AnimalBehavior`: Contains an abstract method `sleep()`. Implemented by lower-level classes (`Dog`, `Pigeon`, `Blowfish`). Called via an array of `AnimalBehavior` references.
   - `AnimalMove`: Contains a `default` method `move()`. Implemented by all classes (through `Animal`), with customized behavior for dogs, pigeons and blowfish (e.g., *Dog run*, *Pigeon fly*), invoked via a `foreach` loop on an `Animal` array.
   - `AnimalName`: Contains a `static` method `name(String name)`, invoked in combination with `getName()` from the `Animal` array elements.
3. **Main Execution:** Demonstrates object instantiation (default, full and partial constructors), array manipulation, and method calls on specific array indices.

## Project Structure

```
Task_8
├── src/task8
│   ├── Animal.java
│   ├── Mammal.java, Bird.java, Fish.java
│   ├── Dog.java, Pigeon.java, Blowfish.java
│   ├── AnimalBehavior.java, AnimalMove.java, AnimalName.java
│   └── Main.java
├── .gitignore
├── README.md
└── Task_8.iml
```

## How to Run

1. Open the `Task_8` folder in IntelliJ IDEA.
2. Run `task8.Main`.
