# 🧱 Builder Design Pattern – Step-by-Step Object Construction

## 📖 What is the Builder Pattern?

The **Builder Design Pattern** is used to construct complex objects **step-by-step**.  
It separates the construction of an object from its representation, allowing the same construction process to create different representations.

---

## 🔍 How to Spot a Builder Pattern

Look out for these patterns in code:

- You see chained calls like:  
  `Product p = new ProductBuilder().setX().setY().build();`
- Construction logic is encapsulated in a builder class.
- The main class has many optional fields.
- A **Director** may manage the building process in some implementations.

---

## 🧰 When to Use the Builder Pattern

- When an object has **many optional parameters**.
- To avoid **telescoping constructors**.
- When object construction is **complex or conditional**.
- To create **immutable objects** cleanly.
- To improve **code readability and maintainability**.

---

## 🏗️ How to Create a Builder Pattern

### Step 1: Create the Product Class

Define the class to be built with required fields.

```java
public class Car {
    private String make, model, color;
    private boolean hasSunroof;

    public Car(String make, String model, String color, boolean hasSunroof) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.hasSunroof = hasSunroof;
    }
}
```

---

### Step 2: Create the Builder Class

```java
public class CarBuilder {
    private String make, model, color;
    private boolean hasSunroof;

    public CarBuilder setMake(String make) {
        this.make = make;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
        return this;
    }

    public Car build() {
        return new Car(make, model, color, hasSunroof);
    }
}
```

---

### Step 3: Use the Builder

```java
Car car = new CarBuilder()
              .setMake("Toyota")
              .setModel("Camry")
              .setColor("Blue")
              .setSunroof(true)
              .build();
```

---

## 🧐 Personal Notes for Applying the Builder Pattern

### ✅ Reverse the Flow

Start from how you want to use it:

```java
Entity e = new EntityBuilder().setX().setY().build();
```

Then build your `Entity` class and `EntityBuilder` around it.

---

## ✅ Benefits

- **Readable** and intuitive object creation.
- Keeps objects **immutable** post-construction.
- Helps build **different versions** of the same object.
- Avoids constructor overload hell.

---

## 🧪 Builder Pattern in the Real Java World

| Java API                | Builder Used           | Purpose                         |
|-------------------------|------------------------|----------------------------------|
| `StringBuilder`         | `StringBuilder`        | Build strings efficiently        |
| `Stream.Builder`        | `Stream.builder()`     | Build Java Streams               |
| `HttpRequest.Builder`   | `HttpRequest.Builder`  | Create HTTP requests in Java 11+ |
| `Calendar.Builder`      | `Calendar.Builder`     | Customize calendar fields        |

---

## 🧽 Naming Conventions

- Builder class: `ClassNameBuilder`
- Methods: `setX()`, `withX()`, `addX()`
- Finalizer method: `build()`

---

## 🧵 TL;DR

> Builder Pattern helps you **construct complex objects** in a clean, step-by-step manner — no need to juggle dozens of constructor arguments.

---

<br>

<p align="center">
  Made with ❤️ by <a href="https://github.com/syedyshiraz" target="_blank">syedyshiraz</a>
</p>

