# 🏭 Factory Design Pattern – How to Spot & Implement It

## 📖 What is the Factory Pattern?

The **Factory Design Pattern** is used to create objects **without specifying their exact class**.  
Instead of using `new`, you **delegate object creation** to a factory method that returns the right object based on some input.

---

## 🔍 How to Spot a Factory Pattern

Look out for these clues in the code:

- You see object creation like:  
  `SomeType obj = FactoryClass.getObject("type");`
- There's an interface or abstract base class being used as the reference type.
- Concrete classes are hidden from the main logic.
- Object creation is controlled in one central place (the factory).

---

## 🧰 When to Use Factory Pattern

- You have a **common interface or superclass** with many implementations.
- Object creation logic may change or is complex.
- You want to **decouple object creation from usage**.
- You want to easily **extend** the system by adding new object types.

---

## 🏗️ How to Create a Factory Pattern

### Step 1: Define a Common Type

Create an interface or abstract class that defines what the object should be able to do.


---

### Step 2: Implement Multiple Variants

Create multiple classes that implement this interface differently.


---

### Step 3: Create a Factory Class

Write a class that **takes input** and returns the appropriate implementation.


---

### Step 4: Use the Factory in Your Code


---

## Personal Notes(to create a factory pattern around any entity):

### Step 1: Go in reverse

Instead of creating the entity first, write a factory method in driver class.
>E.g: EntityInterface entity = EntityFactoryBuilder.getEntity(entityType);

### Step 2: Create a EntityFactoryBuilder

In EntityFactoryBuilder, create a method getEntity() that will take entityType and return entity of that class.
Remember to make it generic.
>E.g: Entity getEntity(String entityType){
          Entity entity = new EntityType();
          return entity;
      }

### Step 3: Create a Enity interface and implement it in EntityType Class(concrete)

In Entity interface write the behaviour and in EntityType which implements Entity define this behaviour.
>E.g class EntityType implements Entity{ 
      void behaviour(){} 
    }
            

---

## ✅ Benefits

- **Encapsulation**: Hides object creation logic.
- **Flexibility**: Easily switch or add implementations.
- **Decoupling**: Main logic doesn’t depend on concrete classes.
- **Clean Code**: Centralized creation logic.

---

## 🧪 Factory Pattern in the Real Java World

| API Class            | Factory Method       | Internally Returns |
|----------------------|----------------------|---------------------|
| `Calendar`           | `getInstance()`      | GregorianCalendar   |
| `NumberFormat`       | `getInstance()`      | Locale Formatter    |
| `DriverManager`      | `getConnection()`    | MySQL/Oracle Driver |
| `ResourceBundle`     | `getBundle()`        | Locale Bundle       |

---

## 🧭 Naming Conventions

- **Factory class names**: `TypeFactory`, `ObjectCreator`, etc.
- **Factory methods**: `create()`, `getInstance()`, `build()`, `getType(type)`.

---

## 🧵 TL;DR

> Factory Pattern is like a smart assistant.  
> You just say **what** you want, and it knows **how** to get the right object for you — without telling you the details.

---

<br>

<p align="center">
  Made with ❤️ by <a href="https://github.com/syedyshiraz" target="_blank">syedyshiraz</a>
</p>

