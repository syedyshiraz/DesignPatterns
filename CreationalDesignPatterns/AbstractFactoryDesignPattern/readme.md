# 🧱 Abstract Factory Design Pattern – Families of Related Objects

## 📖 What is the Abstract Factory Pattern?

The **Abstract Factory Design Pattern** provides an interface for creating **families of related or dependent objects** without specifying their concrete classes.  
It allows you to produce different types of related products (like tires and engines) using a single factory interface.

---

## 🔍 How to Spot an Abstract Factory Pattern

Look out for these patterns in code:

- There’s an interface for creating a **family of products**.
- You see multiple factory classes implementing the same interface, producing different variants of products.
- The client code only knows about the factory interface, **not the concrete classes**.
- Often used when **products are meant to work together** (e.g., UI themes, vehicle parts).

---

## 🧰 When to Use the Abstract Factory Pattern

- When you want to ensure that a family of related products is used together.
- To create a layer of **abstraction over object creation**.
- When your code needs to work with multiple families of products.
- To avoid tight coupling between product implementations and client code.

---

## 🏗️ How to Create an Abstract Factory Pattern

### Step 1: Define Abstract Product Interfaces

```java
public interface Engine {
    void assemble();
}

public interface Tire {
    void manufacture();
}
```

---

### Step 2: Define Concrete Products for Each Variant

```java
// SUV Variants
public class SUVEngine implements Engine {
    public void assemble() {
        System.out.println("Assembling a powerful SUV engine.");
    }
}

public class SUVTire implements Tire {
    public void manufacture() {
        System.out.println("Manufacturing all-terrain SUV tires.");
    }
}

// Sedan Variants
public class SedanEngine implements Engine {
    public void assemble() {
        System.out.println("Assembling a fuel-efficient sedan engine.");
    }
}

public class SedanTire implements Tire {
    public void manufacture() {
        System.out.println("Manufacturing smooth ride sedan tires.");
    }
}
```

---

### Step 3: Create the Abstract Factory Interface

```java
public interface CarPartsFactory {
    Engine createEngine();
    Tire createTire();
}
```

---

### Step 4: Implement Concrete Factories

```java
public class SUVPartsFactory implements CarPartsFactory {
    public Engine createEngine() {
        return new SUVEngine();
    }

    public Tire createTire() {
        return new SUVTire();
    }
}

public class SedanPartsFactory implements CarPartsFactory {
    public Engine createEngine() {
        return new SedanEngine();
    }

    public Tire createTire() {
        return new SedanTire();
    }
}
```

---

### Step 5: Use the Factory in the Client Code

```java
public class CarAssemblyLine {
    private Engine engine;
    private Tire tire;

    public CarAssemblyLine(CarPartsFactory factory) {
        engine = factory.createEngine();
        tire = factory.createTire();
    }

    public void buildCar() {
        engine.assemble();
        tire.manufacture();
    }
}
```

---

### Step 6: Main Method to Test It

```java
public class Main {
    public static void main(String[] args) {
        CarPartsFactory factory;

        String carType = "SUV"; // or "Sedan"

        if (carType.equalsIgnoreCase("SUV")) {
            factory = new SUVPartsFactory();
        } else {
            factory = new SedanPartsFactory();
        }

        CarAssemblyLine assemblyLine = new CarAssemblyLine(factory);
        assemblyLine.buildCar();
    }
}
```

---

## ✅ Benefits

- Helps group related objects together.
- Keeps code loosely coupled and easily extendable.
- Supports open/closed principle by allowing new product families via new factories.

---

## 🧪 Abstract Factory Pattern in the Real Java World

| Java API                | Abstract Factory Used             | Purpose                                    |
|-------------------------|-----------------------------------|--------------------------------------------|
| `DocumentBuilderFactory`| XML parsing                       | Creates parsers for XML documents          |
| `SocketFactory`         | Networking                        | Creates sockets (default, SSL, etc.)       |
| `UIManager`             | Swing Look and Feel               | Creates UI components for different themes |

---

## 🧵 TL;DR

> Abstract Factory Pattern helps you **create families of related objects** without binding your code to specific classes. It's all about **clean scalability and consistency**.

---

<br>

<p align="center">
  Made with ❤️ by <a href="https://github.com/syedyshiraz" target="_blank">syedyshiraz</a>
</p>

