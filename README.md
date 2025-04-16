# 🎨 Design Patterns – A Complete Overview

Design Patterns are standard solutions to common software design problems. They promote **clean code**, **reusability**, and **scalability** by applying well-known best practices.

---

## 📚 Design Pattern Categories

### ✅ Official "Gang of Four" (GoF) Categories:

1. **Creational Patterns** – Handle object creation
2. **Structural Patterns** – Handle object composition
3. **Behavioral Patterns** – Handle object interaction

### ❗ Other Useful Categories (Not GoF):

4. **Concurrency Patterns** – Handle multi-threading and parallelism  
5. **Architectural Patterns** – Handle high-level system structure

---

## 1️⃣ Creational Design Patterns

These patterns abstract and control how objects are created.

| Pattern           | Purpose                                                  |
|------------------|-----------------------------------------------------------|
| `Singleton`        | Ensure only one instance of a class exists              |
| `Factory Method`   | Create objects without specifying exact classes         |
| `Abstract Factory` | Create families of related objects                      |
| `Builder`          | Construct complex objects step-by-step                 |
| `Prototype`        | Clone existing objects instead of creating from scratch |

---

## 2️⃣ Structural Design Patterns

These focus on how classes and objects are composed to form larger structures.

| Pattern     | Purpose                                                     |
|-------------|-------------------------------------------------------------|
| `Adapter`   | Convert one interface into another                          |
| `Bridge`    | Separate abstraction from implementation                    |
| `Composite` | Treat individual and composite objects uniformly            |
| `Decorator` | Add responsibilities to objects dynamically                 |
| `Facade`    | Provide a unified interface to a subsystem                  |
| `Flyweight` | Use sharing to support many fine-grained objects efficiently|
| `Proxy`     | Provide a surrogate for another object                      |

---

## 3️⃣ Behavioral Design Patterns

These deal with communication between objects and assigning responsibilities.

| Pattern                 | Purpose                                              |
|-------------------------|------------------------------------------------------|
| `Chain of Responsibility` | Pass request along a chain of handlers            |
| `Command`               | Encapsulate a request as an object                  |
| `Interpreter`           | Define a grammar and interpret language             |
| `Iterator`              | Access elements of a collection sequentially        |
| `Mediator`              | Simplify communication between objects              |
| `Memento`               | Capture and restore an object's state               |
| `Observer`              | Notify observers of state changes                   |
| `State`                 | Alter behavior when internal state changes          |
| `Strategy`              | Define a family of interchangeable algorithms       |
| `Template Method`       | Define the skeleton of an algorithm                 |
| `Visitor`               | Add new operations without changing classes         |

---

## 4️⃣ Concurrency Patterns (🧵 Non-GoF)

Used for safe and efficient multi-threaded programming.

| Pattern                   | Purpose                                              |
|---------------------------|------------------------------------------------------|
| `Thread Pool`             | Manage and reuse a fixed number of threads          |
| `Producer-Consumer`       | Balance production and consumption across threads   |
| `Read-Write Lock`         | Allow concurrent reads while controlling writes     |
| `Double-Checked Locking`  | Optimize performance in singleton initialization    |
| `Future / Promise`        | Represent async operation results                   |
| `Monitor Object`          | Encapsulate synchronization logic                   |

---

## 5️⃣ Architectural Patterns (🏛️ Non-GoF)

These define high-level system organization and application structure.

| Pattern            | Purpose                                                  |
|--------------------|----------------------------------------------------------|
| `MVC` (Model-View-Controller) | Separate concerns of data, UI, and logic     |
| `MVVM`             | UI binding with observables for separation of concerns   |
| `Layered` (n-tier) | Organize system into logical layers                      |
| `Microservices`    | Build loosely coupled, independently deployable services |
| `Event-Driven`     | Communicate asynchronously using events                  |
| `Client-Server`    | Split frontend and backend responsibilities              |
| `Pipe and Filter`  | Transform data through a series of independent filters   |

---

## 🔍 How to Decide Which Pattern to Use?

| Scenario                          | Recommended Pattern(s)                     |
|----------------------------------|--------------------------------------------|
| Creating flexible objects         | `Factory`, `Builder`, `Prototype`          |
| Enforcing single instance         | `Singleton`                                |
| Wrapping or extending behavior    | `Decorator`, `Proxy`                       |
| Simplifying complex systems       | `Facade`, `Adapter`                        |
| Changing behavior at runtime      | `Strategy`, `State`, `Command`             |
| Handling async or parallel tasks  | `Thread Pool`, `Future`, `Producer-Consumer`|
| Building scalable applications    | `MVC`, `Microservices`, `Layered`          |

---

## 🧵 Summary

| Category               | Official GoF? | Focus Area                               |
|------------------------|----------------|------------------------------------------|
| Creational Patterns    | ✅ Yes         | Object instantiation                      |
| Structural Patterns    | ✅ Yes         | Class and object composition              |
| Behavioral Patterns    | ✅ Yes         | Communication and responsibility handling |
| Concurrency Patterns   | ❌ No          | Multi-threading and synchronization       |
| Architectural Patterns | ❌ No          | High-level application architecture       |

---

> 📖 **Design patterns are conceptual tools, not strict rules.**  
> Think in terms of **problems and solutions**, not just pattern names.

---

<br>

<p align="center">
  Made with ❤️ by <a href="https://github.com/syedyshiraz" target="_blank">syedyshiraz</a>
</p>
