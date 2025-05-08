# 👀 Observer Design Pattern – Stay in the Loop

## 📖 What is the Observer Pattern?

The **Observer Design Pattern** defines a **one-to-many dependency** between objects so that when one object changes state, all its dependents are **notified and updated automatically**.

It is widely used in **event-driven** systems like GUIs, pub/sub messaging, and data-binding scenarios.

---

## 🔍 How to Spot an Observer Pattern

Clues that you're looking at the Observer pattern:

- A central object (the **Subject**) is being "watched".
- Many **Observers** subscribe to get updates from the Subject.
- A state change in the Subject **triggers automatic updates** to the Observers.
- You see methods like `addObserver()`, `removeObserver()`, and `notifyObservers()`.

---

## 🧰 When to Use Observer Pattern

- When multiple objects need to be **notified of state changes** in another object.
- When there is a need to **decouple** the Subject from its Observers.
- In **event-driven** architectures.
- In **real-time systems** like weather monitoring, stock tracking, or chat apps.

---

## 🏗️ How to Create an Observer Pattern

### Step 1: Define the Observer Interface
Create an interface with an `update()` method that Observers will implement.

---

### Step 2: Define the Subject Interface
Define methods like `addObserver()`, `removeObserver()`, and `notifyObservers()`.

---

### Step 3: Implement the Subject
Keep a list of observers and notify them on state changes.

---

### Step 4: Implement Concrete Observers
Each observer implements the update method to respond to changes.

---

## Personal Notes (to create observer pattern around any subject):

### Step 1: Think in terms of broadcaster and listeners
>E.g: The WeatherStation is the **broadcaster**, and PhoneDisplay or LEDDisplay are the **listeners**.

### Step 2: Start with an Observer interface
>Define `void update(data)` in your interface.

### Step 3: Create a Subject class with a list of observers
>Subject should have `addObserver`, `removeObserver`, and `notifyObservers` methods.

### Step 4: In each observer, implement the update logic
>Write your display or reaction logic inside the `update()` method.

---

## ✅ Benefits

- **Loose Coupling**: Subject and observers know little about each other.
- **Dynamic Subscription**: Observers can join or leave at runtime.
- **Scalability**: Easily add more observers without changing Subject.
- **Consistency**: Keeps all views synchronized with the state.

---

## 🧪 Observer Pattern in the Real Java World

| Java API               | Observer Role                         |
|------------------------|----------------------------------------|
| `java.util.Observer`   | Built-in Observer interface (deprecated after Java 9) |
| `Swing/AWT`            | Event Listeners like `ActionListener` |
| `RxJava`               | Reactive Observers for streams        |
| `Spring Events`        | Custom ApplicationEvents + Listeners  |

---

## 🧭 Naming Conventions

- **Interface**: `Observer`, `Subscriber`, `Listener`
- **Subject Class**: `Subject`, `Publisher`, `EventSource`, `Broadcaster`
- **Observer Implementations**: `PhoneDisplay`, `LogListener`, `EmailNotifier`

---

## 🧵 TL;DR

> Observer Pattern is like a **YouTube subscription**.  
> You subscribe once, and anytime the channel (subject) posts a new video (state change), **you’re notified automatically**.

---

<br>

<p align="center">
  Made with ❤️ by <a href="https://github.com/syedyshiraz" target="_blank">syedyshiraz</a>
</p>

