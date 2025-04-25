# 🧹 Decorator Design Pattern – How to Spot & Implement It

## 📖 What is the Decorator Pattern?

The **Decorator Design Pattern** is used to **add new behavior** to objects **dynamically** without altering their structure.  
You wrap the original object in a **decorator class** that adds new functionality, keeping the original object intact.

---

## 🔍 How to Spot a Decorator Pattern

Look out for these clues in the code:

- You see a class wrapping another class that implements the same interface.
- You find constructor injection like:  
  `Component obj = new FancyDecorator(new BasicComponent());`
- Behavior is being added before/after calling the original object’s method.
- There’s a chain of enhancements, each wrapping the previous one.

---

## 🧰 When to Use Decorator Pattern

- You want to add responsibilities **without modifying existing code**.
- You have many feature combinations — subclassing gets messy.
- You want to follow the **Open/Closed Principle** (open for extension, closed for modification).
- You need **layered enhancements** at runtime.

---

## 🏗️ How to Create a Decorator Pattern

### Step 1: Define a Common Interface

Define an interface that both the **core component** and **decorators** will implement.

---

### Step 2: Create a Concrete Implementation

Create a basic class that implements the interface — this is the original object you'll decorate.

---

### Step 3: Build Abstract Decorator

Create a class that also implements the interface and holds a reference to another component (to wrap it). This class should delegate the method call to the wrapped component.

---

### Step 4: Create Concrete Decorators

Write decorators that extend the abstract decorator and **add extra behavior**.

---

### Step 5: Use the Decorator in Your Code

Wrap your objects with decorators to add functionality dynamically:
```java
Component c = new FancyDecorator(new BasicComponent());
```

---

## Personal Notes (to build a decorator pattern around any entity):

### Step 1: Start with the Interface

Define what the entity should do using an interface.
>E.g: `interface Entity { void render(); }`

### Step 2: Build a Base Implementation

Create a class that implements the interface with core behavior.
>E.g: `class BasicEntity implements Entity { public void render() { ... } }`

### Step 3: Create an Abstract Decorator

Have a class implement the same interface and take `Entity` as a constructor param. Also, provide a default implementation that delegates method calls.
>E.g:  
```java
abstract class EntityDecorator implements Entity {
   protected Entity entity;
   EntityDecorator(Entity entity) { this.entity = entity; }

   public void render() {
      entity.render();
   }
}
```

### Step 4: Write Concrete Decorators

Each decorator extends `EntityDecorator` and overrides behavior.
>E.g:  
```java
class GlowingEntity extends EntityDecorator {
   public GlowingEntity(Entity entity) {
      super(entity);
   }

   public void render() {
      super.render();
      addGlow();
   }

   private void addGlow() {
      System.out.println("Adding glow effect.");
   }
}
```

---

## ✅ Benefits

- **Flexible Enhancement**: Add behavior without altering code.
- **Reusable Decorators**: Compose new features by combining decorators.
- **Single Responsibility**: Each decorator handles a specific concern.
- **Runtime Flexibility**: Add/remove features on the fly.

---

## 🧪 Decorator Pattern in the Real Java World

| API Class              | Decorator Example                  | Adds Behavior To          |
|------------------------|------------------------------------|---------------------------|
| `BufferedReader`       | Wraps `FileReader`                 | Adds buffering            |
| `Collections.unmodifiableList()` | Wraps a List            | Makes list read-only      |
| `InputStream` hierarchy| `DataInputStream(new FileInputStream())` | Adds data reading capabilities |

---

## 🤭 Naming Conventions

- **Interface/Base**: `Component`, `Entity`, `Notifier`, etc.
- **Decorators**: `ComponentDecorator`, `LoggingDecorator`, `BorderDecorator`, etc.

---

## 🧵 TL;DR

> Decorator Pattern is like a gift wrapper.  
> You take a regular item and **wrap it** to make it fancier — without ever changing what’s inside.

---

<br>

<p align="center">
  Made with ❤️ by <a href="https://github.com/syedyshiraz" target="_blank">syedyshiraz</a>
</p>

