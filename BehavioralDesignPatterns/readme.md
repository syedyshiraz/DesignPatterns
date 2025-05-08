# 🧠 Behavioral Design Patterns in Object-Oriented Design

## 📚 What Are Behavioral Patterns?

**Behavioral Design Patterns** are focused on **how objects interact** and **communicate** with each other.

They help distribute responsibilities between objects and manage **dynamic behavior changes**, often enabling **flexible, reusable, and loosely coupled designs**.

---

## 🔍 How to Identify Behavioral Patterns in Code

Look for these signs:

- Objects are **delegating behavior** or **sending messages** to other objects.
- There's a system of **event handlers, callbacks, or observers**.
- You're handling **dynamic behavior switching** (state, strategy).
- You're structuring **chains of responsibility** or **command execution flows**.

---

## 🧰 Why Use Behavioral Patterns?

- Promote **separation of concerns**.
- Make behavior **interchangeable or extendable**.
- Reduce **tight coupling** between components.
- Improve **flexibility** when implementing workflows, decisions, or communication.

---

## 🌟 Common Behavioral Design Patterns

| Pattern Name               | What It Does                                                                       | When to Use |
|----------------------------|------------------------------------------------------------------------------------|-------------|
| **Observer**               | Notifies multiple objects when a state changes                                    | When many dependents must stay in sync |
| **Strategy**               | Encapsulates interchangeable behaviors (algorithms)                              | When you need dynamic behavior swapping |
| **Command**                | Wraps requests as objects                                                         | When you want to queue, undo, or log requests |
| **State**                  | Allows an object to change its behavior based on internal state                  | When behavior depends on state changes |
| **Chain of Responsibility**| Passes requests through a chain of potential handlers                            | When multiple handlers may process a request |
| **Mediator**               | Centralizes communication between components                                     | When you want to reduce direct dependencies |
| **Template Method**        | Defines a skeleton algorithm with steps that subclasses override                 | When you want consistent process with variable steps |
| **Iterator**               | Provides a way to traverse a collection without exposing its structure           | When you're working with aggregate data structures |
| **Visitor**                | Allows defining new operations on objects without changing their classes         | When you need to perform operations across a complex object structure |

---

## 🧠 Quick Clues for Each Pattern

- 👂 **Observer**: "I want to notify all listeners when something changes."
- 🔁 **Strategy**: "I want to switch out behavior at runtime."
- 📝 **Command**: "I want to encapsulate actions as objects."
- ⚙️ **State**: "The object's behavior changes as its internal state changes."
- 🔗 **Chain of Responsibility**: "I want to try multiple handlers in sequence."
- 🧭 **Mediator**: "I want a central authority to manage communication."
- 🧪 **Template Method**: "I want a skeleton method that delegates parts to subclasses."
- 🔍 **Iterator**: "I want to traverse a collection without exposing its structure."
- 🎯 **Visitor**: "I want to run new operations on an object structure without modifying it."

---

## 📌 TL;DR

> **Behavioral Patterns** help objects communicate effectively, allowing behavior to evolve and flow without creating tight coupling or repetitive logic.

---

## ✨ Pro Tip

Many behavioral patterns are ideal for use in **event-driven architectures**, **UI frameworks**, or **rule-based engines**.

For example:
🎮 **State + Strategy** → dynamic game object behavior  
🔁 **Command + Chain of Responsibility** → layered input processing or middleware

---

<br>

<p align="center">
  Made with ❤️ by <a href="https://github.com/syedyshiraz" target="_blank">syedyshiraz</a>
</p>

