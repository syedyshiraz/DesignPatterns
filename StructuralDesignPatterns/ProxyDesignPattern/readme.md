# 🕵️ Proxy Design Pattern – Control Access Like a Pro

## 📖 What is the Proxy Pattern?

The **Proxy Design Pattern** provides a surrogate or placeholder for another object to **control access** to it.  
A proxy usually implements the same interface as the real object and **adds additional behavior** (like access control, lazy loading, logging, etc.) before delegating the call to the actual object.

---

## 🔍 How to Spot a Proxy Pattern

Look out for these clues in the code:

- You see a class implementing the **same interface as another class**, but adding extra logic before forwarding calls.
- Access to a real object is **controlled, delayed, or monitored**.
- There's delegation: the proxy **calls methods on another object** internally.
- You see uses like:
  `Service service = new ProxyService();`

---

## 🧰 When to Use Proxy Pattern

- You need **access control** (Protection Proxy).
- You want **lazy loading** of heavy resources (Virtual Proxy).
- You want to **log, cache, or audit** requests (Smart Proxy).
- You’re working with **remote objects** (Remote Proxy).

---

## 🏗️ How to Create a Proxy Pattern

### Step 1: Define a Common Interface

Create an interface that both the real subject and proxy implement.

---

### Step 2: Implement the Real Class

Create the real object that contains the actual business logic.

---

### Step 3: Create a Proxy Class

Make a proxy class that implements the same interface and contains a reference to the real object. Add additional behavior before/after delegating.

---

### Step 4: Use the Proxy in Your Code

The client code uses the proxy just like the real object.

---

## Personal Notes (to create a proxy pattern around any object):

### Step 1: Write a common interface for the behavior
> E.g: `interface Service { void perform(); }`

### Step 2: Create a real implementation that performs the actual work
> E.g: `class RealService implements Service { perform() { // do work } }`

### Step 3: Create a proxy class that adds logic before/after delegation
> E.g:
```java
class ServiceProxy implements Service {
    private RealService realService = new RealService();
    public void perform() {
        System.out.println("Checking permissions");
        realService.perform();
    }
}
```

---

## ✅ Benefits

- **Control Access**: Protect sensitive operations.
- **Lazy Instantiation**: Load resources only when needed.
- **Logging and Auditing**: Intercept requests easily.
- **Remote Handling**: Work with distributed objects as if they’re local.

---

## 🧪 Proxy Pattern in the Real Java World

| Context              | Real Class            | Proxy Class / Use Case       |
|----------------------|------------------------|-------------------------------|
| RMI (Remote Method Invocation) | Remote Object       | Stub (Proxy for remote access) |
| Hibernate            | Real Entity Class     | Proxy for lazy loading        |
| Spring AOP           | Target Bean           | Proxy for logging/security     |

---

## 🧭 Naming Conventions

- **Interface**: `Service`, `Internet`, `Image`, etc.
- **Real Class**: `RealService`, `RealInternet`, etc.
- **Proxy Class**: `ServiceProxy`, `ProxyInternet`, `VirtualImage`, etc.

---

## 🧵 TL;DR

> Proxy Pattern is like a bodyguard.  
> You talk to **them** first, and they decide **whether** or **when** you get to the real person.

---

<br>

<p align="center">
  Made with ❤️ by <a href="https://github.com/syedyshiraz" target="_blank">syedyshiraz</a>
</p>

