# 🏗️ Creational Design Patterns in Object-Oriented Design

## 📚 What Are Creational Patterns?

**Creational Design Patterns** are focused on the **creation of objects** in a flexible and efficient manner.

Instead of instantiating objects directly with `new`, creational patterns **abstract the instantiation process**, giving you more control over:
- What is created
- How it is created
- When it is created

---

## 🔍 How to Identify Creational Patterns in Code

Look for these signs:

- Direct use of `new` is avoided in most places.
- Object creation is centralized or delegated.
- There's a need for:
  - Controlling how many instances of a class are created.
  - Selecting among multiple concrete implementations.
  - Delaying or customizing object creation.
  - Reusing previously created instances.

---

## 🧰 Why Use Creational Patterns?

- Promote **loose coupling** between classes.
- Encapsulate object creation logic.
- Improve flexibility and scalability.
- Help with testability (e.g., mocking dependencies).

---

## 🌟 Common Creational Design Patterns

| Pattern Name     | What It Does                                                              | When to Use |
|------------------|---------------------------------------------------------------------------|-------------|
| **Singleton**     | Ensures a class has only one instance and provides a global access point | When you need one (and only one) instance of a class |
| **Factory Method**| Creates objects without exposing the instantiation logic to the client   | When you have a supertype with multiple subtypes |
| **Abstract Factory** | Provides an interface to create families of related objects           | When your system needs to be independent of the way its objects are created |
| **Builder**       | Constructs complex objects step by step                                  | When object creation requires many steps or configurations |
| **Prototype**     | Creates new objects by copying an existing object (cloning)              | When object creation is expensive and similar objects are needed repeatedly |

---

## 🧠 Quick Clues for Each Pattern

- 🧍 **Singleton**: "I need exactly one instance globally shared."
- 🏭 **Factory Method**: "I need to return different subtypes based on input."
- 🧩 **Abstract Factory**: "I need to return related groups of objects together."
- 🏗️ **Builder**: "I need to build an object step-by-step with optional values."
- 🧬 **Prototype**: "I need to duplicate existing instances instead of building from scratch."

---

## 📌 TL;DR

> **Creational Patterns** help you create objects in a smart way — controlling how they're built, what they contain, and how many exist.

---

## ✨ Pro Tip

You often see these patterns combined.  
For example:  
🔄 **Builder + Singleton** → a single builder object that configures different complex instances.

---

<br>

<p align="center">
  Made with ❤️ by <a href="https://github.com/syedyshiraz" target="_blank">syedyshiraz</a>
</p>
