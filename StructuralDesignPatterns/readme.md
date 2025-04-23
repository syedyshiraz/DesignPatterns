# 🧱 Structural Design Patterns in Object-Oriented Design

## 📚 What Are Structural Patterns?

**Structural Design Patterns** deal with the **composition of classes and objects**.  
They help ensure that components fit together in a flexible and maintainable way, forming **larger structures** without tight coupling.

These patterns focus on **how classes and objects are combined** to form bigger systems.

---

## 🔍 How to Identify Structural Patterns in Code

Look for signs like:

- You're trying to **bridge incompatible interfaces**.
- You want to **simplify or restrict access** to a complex subsystem.
- You're adding responsibilities or functionality **dynamically**.
- Multiple objects **share responsibilities or behavior**.
- Object structure is being reused without inheritance.

---

## 🧰 Why Use Structural Patterns?

- Promote **code reusability** via composition over inheritance.
- Simplify complex systems by abstracting interactions.
- Enable systems to grow without modifying existing code.
- Provide flexibility in how components are connected.

---

## 🌟 Common Structural Design Patterns

| Pattern Name     | What It Does                                                                 | When to Use |
|------------------|------------------------------------------------------------------------------|-------------|
| **Adapter**       | Converts one interface to another                                            | When you need to use an existing class but its interface doesn't match |
| **Bridge**        | Decouples abstraction from implementation                                    | When abstraction and implementation should vary independently |
| **Composite**     | Treats individual objects and compositions uniformly                        | When working with tree structures (e.g., menus, filesystems) |
| **Decorator**     | Adds behavior to objects dynamically                                         | When you want to add responsibilities without modifying code |
| **Facade**        | Provides a simplified interface to a complex subsystem                      | When simplifying complex APIs |
| **Flyweight**     | Shares common parts of objects to reduce memory usage                       | When you have many similar objects and memory matters |
| **Proxy**         | Provides a placeholder to control access to an object                       | When you need control (e.g., lazy loading, logging, security) |

---

## 🧠 Quick Clues for Each Pattern

- 🔌 **Adapter**: "This doesn’t plug in — I need a connector."
- 🌉 **Bridge**: "I want to vary both sides (interface and implementation)."
- 🌳 **Composite**: "I want to treat a group of objects as one."
- 🤩 **Decorator**: "I want to wrap and add behavior without touching the original."
- 🌛 **Facade**: "This system is too complex — I want a simpler interface."
- 🦶 **Flyweight**: "I have lots of objects — can I share some data to save space?"
- 🕵️‍♂️ **Proxy**: "I want to control access to an object."

---

## ✅ Benefits

- Enables **flexibility and reusability** in code structure.
- Encourages **composition over inheritance**.
- Makes code **easier to read, maintain, and scale**.
- Helps to **decouple** systems for better modularity.

---

## 🤪 Structural Patterns in the Real Java World

| API / Framework         | Pattern Used  | Purpose                                          |
|--------------------------|---------------|--------------------------------------------------|
| `java.util.Collections`  | Decorator     | Methods like `synchronizedList()` add behavior   |
| `javax.swing.JComponent` | Composite     | UI elements can contain other components         |
| `java.lang.reflect.Proxy`| Proxy         | Creates dynamic proxy classes                    |
| `java.sql.ConnectionPool`| Flyweight     | Reuses connection instances                      |
| `Spring AOP`             | Proxy         | Adds cross-cutting concerns like logging/security|
| `Log4j Facade`           | Facade        | Provides simple logging API hiding complex backends |

---

## 🽝 TL;DR

> **Structural Patterns** help you glue parts of your system together  
> — cleanly, flexibly, and without tight coupling.

---

## ✍️ Personal Notes (To Apply Structural Patterns)

### ✅ Reverse the Flow

Start from how you want to **use** the object.

E.g.:
```java
MediaPlayer player = new MediaAdapter("vlc");
player.play("vlc", "movie.vlc");
```

Then figure out:

1. What existing class/interface is not compatible?
2. What structure do I want to interact with?
3. Which pattern helps me connect or enhance it?

👉 Then build your **bridge, adapter, proxy, or decorator** around that intent.

---

## ✨ Pro Tip

You can combine Structural Patterns with Creational and Behavioral ones.

For example:
- **Proxy + Singleton**: One shared access-controlled instance.
- **Adapter + Factory**: Return compatible interfaces for incompatible systems.
- **Composite + Builder**: Build tree structures step-by-step.

---

<br>

<p align="center">
  Made with ❤️ by <a href="https://github.com/syedyshiraz" target="_blank">syedyshiraz</a>
</p>

