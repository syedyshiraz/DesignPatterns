# 🔒 Singleton Design Pattern – One Instance to Rule Them All

## 📖 What is the Singleton Pattern?

The **Singleton Design Pattern** ensures that a class has **only one instance** throughout the application and provides a **global point of access** to it.

---

## 🔍 How to Spot a Singleton Pattern

You're probably looking at a Singleton if:

- A class has a private constructor.
- There's a static method like `getInstance()` or `get()`.
- It restricts instantiation to a single object.
- The class controls its own instance lifecycle.

---

## 🧰 When to Use the Singleton Pattern

- When exactly **one instance** is needed to coordinate actions across the system.
- For **shared resources** like configuration, logging, caches, database connections.
- To provide a **global access point** to the instance.

---

## 🏗️ How to Create a Singleton Pattern

### Step 1: Private Constructor
```java
public class Logger {
    private Logger() {
        // private constructor to prevent instantiation
    }
```

### Step 2: Static Instance Field
```java
    private static Logger instance;
```

### Step 3: Provide a Global Access Method
```java
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}
```

### Step 4: Use It
```java
public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println(logger1 == logger2);  // true
    }
}
```

---

## 🧐 Personal Notes for Applying the Singleton Pattern

### ✅ Reverse the Flow:
Start from usage:
```java
Logger log = Logger.getInstance();
log.info("Hello Singleton!");
```
Then:
- Make constructor private
- Create static `getInstance()`
- Store the single instance statically inside the class

---

## ✅ Benefits
- Controlled access to a single instance
- Reduced memory footprint
- Useful for global resources (logger, config, cache)

---

## 🧪 Singleton Pattern in the Real Java World

| Real Example Class      | Use Case                       |
|--------------------------|---------------------------------|
| `Runtime.getRuntime()`   | JVM runtime                    |
| `Logger.getLogger()`     | Logging                        |
| `Desktop.getDesktop()`   | Desktop integration            |
| `Spring Beans (default)` | Managed singleton by container |

---

## 🧭 Naming Conventions
- Singleton class name: `Logger`, `ConfigManager`, `Cache`
- Method: `getInstance()`, `get()`

---

## 🧵 TL;DR
> Singleton Pattern ensures a class has **only one instance** and provides a global access point.
> It’s like having a single control center for all your logs, configs, or settings.

---

<br>

<p align="center">
  Made with ❤️ by <a href="https://github.com/syedyshiraz" target="_blank">syedyshiraz</a>
</p>

