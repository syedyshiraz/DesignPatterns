# 🧬 Prototype Design Pattern – Cloning Without New

## 📖 What is the Prototype Pattern?

The **Prototype Design Pattern** allows object creation by **cloning an existing object** instead of instantiating a new one. This is particularly useful when the cost of creating a new object is expensive.

---

## 🔍 How to Spot a Prototype Pattern

Signs you're looking at a Prototype Pattern:

- Classes implement a `clone()` method.
- Objects are created using `.clone()` instead of `new`.
- There is a common interface that all cloneable classes implement.
- Cloned objects can be customized without affecting the original.

---

## 🧰 When to Use the Prototype Pattern

- When object creation is **resource-intensive**.
- To avoid **repetitive initialization**.
- When an object has a **few standard configurations** that are frequently reused.
- To make a **copy of objects** at runtime with customized states.

---

## 🏗️ How to Create a Prototype Pattern

### Step 1: Create a Common Prototype Interface

```java
public interface IShapesPrototype extends Cloneable {
    IShape clone();
}
```

### Step 2: Create the Base Shape Interface

```java
public interface IShape extends IShapesPrototype {
    void draw();
}
```

### Step 3: Implement Concrete Shapes

```java
public class Circle implements IShape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a circle of radius " + radius);
    }

    public IShape clone() {
        return new Circle(this.radius);
    }
}

public class Rectangle implements IShape {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("Drawing a rectangle of width " + width + " and height " + height);
    }

    public IShape clone() {
        return new Rectangle(this.width, this.height);
    }
}
```

---

### Step 4: Use Cloning in the Client Code

```java
public class Main {
    public static void main(String[] args) {
        Circle cOne = new Circle(5);
        Rectangle rOne = new Rectangle(5, 5);

        cOne.draw();
        rOne.draw();

        IShape sOne = cOne.clone();
        IShape sTwo = rOne.clone();

        sOne.draw();
        sTwo.draw();
    }
}
```

---

## 🧐 Personal Notes for Applying the Prototype Pattern

### ✅ Reverse the Flow

Start from how you'd use it:

```java
IShape shape = shapeRegistry.get("circle").clone();
shape.draw();
```

Then:
- Define a prototype interface (with `clone()` method).
- Create concrete classes implementing `clone()`.
- Optionally, maintain a **registry** of prototypes to retrieve and clone from.

---

## ✅ Benefits

- **Faster object creation**.
- Reduces the need for repetitive code.
- Avoids subclassing just to create variations.
- Makes object configuration easier at runtime.

---

## 🧪 Prototype Pattern in the Real Java World

| Java API       | Cloning Used                  | Purpose                                |
|----------------|-------------------------------|----------------------------------------|
| `Object.clone()` | Native Java method            | Base method for cloning objects        |
| `BufferedImage` | `.getSubimage()` acts similar | Clones part of image without new object |
| `Cloneable`     | Java interface                | Marker to allow cloning of an object   |

---

## 🧭 Naming Conventions

- Prototype interface: `IPrototype`, `CloneableType`
- Method: `clone()`
- Registry (optional): `ShapeRegistry`, `PrototypeCache`

---

## 🧵 TL;DR

> The Prototype Pattern lets you **copy objects efficiently** rather than rebuilding them — especially handy when construction is expensive or complex.

---

<br>

<p align="center">
  Made with ❤️ by <a href="https://github.com/syedyshiraz" target="_blank">syedyshiraz</a>
</p>

