# 🔌 Adapter Design Pattern – Bridging Interface Gaps

## 📖 What is the Adapter Pattern?

The **Adapter Design Pattern** helps incompatible interfaces work together. It acts as a **bridge** between two incompatible types by wrapping an existing class with a new interface.

---

## 🔍 How to Spot an Adapter Pattern

You're likely looking at an Adapter Pattern if:

- One interface or class doesn't match what the client expects.
- A wrapper or middle class is introduced to translate between interfaces.
- You see code like `MediaPlayer player = new MediaAdapter("vlc")`
- Existing classes are reused without modifying their source code.

---

## 🧰 When to Use the Adapter Pattern

- When you want to use an existing class, but its interface doesn't match your need.
- You need to reuse legacy or third-party code.
- To decouple the client code from complex interface mismatches.

---

## 🏗️ How to Create an Adapter Pattern

### Step 1: Create the Target Interface

```java
public interface IMediaPlayer {
    void play(String audioType, String fileName);
}
```

### Step 2: Create an Incompatible (Adaptee) Class

```java
public class AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}
```

### Step 3: Create the Adapter Class

```java
public class MediaAdapter implements IMediaPlayer {
    private AdvancedMediaPlayer advancedPlayer = new AdvancedMediaPlayer();

    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedPlayer.playVlc(fileName);
        } else if(audioType.equalsIgnoreCase("mp4")) {
            advancedPlayer.playMp4(fileName);
        } else {
            System.out.println("Invalid format: " + audioType);
        }
    }
}
```

### Step 4: Use It in Your Client Code

```java
public class AudioPlayer implements IMediaPlayer {
    private MediaAdapter mediaAdapter;

    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else {
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(audioType, fileName);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        IMediaPlayer player = new AudioPlayer();
        player.play("mp3", "song.mp3");
        player.play("mp4", "video.mp4");
        player.play("vlc", "movie.vlc");
        player.play("avi", "clip.avi");
    }
}
```

---

## 🧐 Personal Notes for Applying the Adapter Pattern

### ✅ Think in Roles:
- **Client** wants to call a known interface.
- **Adaptee** has useful behavior but an incompatible interface.
- **Adapter** makes them talk to each other.

### ✅ Useful when working with:
- Legacy systems
- Third-party libraries
- Code that can’t be modified

---

## ✅ Benefits
- Reuse existing functionality without modifying it
- Decouples systems with incompatible interfaces
- Encourages flexible code

---

## 🧪 Adapter Pattern in the Real Java World

| Real Example Class   | Acts As         | Purpose                            |
|----------------------|------------------|-------------------------------------|
| `InputStreamReader`  | Adapter          | Converts `InputStream` to `Reader`  |
| `Arrays.asList()`    | Adapter method   | Wraps array into a `List`           |
| `java.util.logging.Logger` | Adapter | Adapts different logging frameworks |

---

## 🧭 Naming Conventions

- Interface: `ITarget`, `IMediaPlayer`
- Adaptee: `AdvancedMediaPlayer`, `LegacyService`
- Adapter: `MediaAdapter`, `LegacyAdapter`

---

## 🧵 TL;DR

> Adapter Pattern lets you **connect mismatched interfaces** — it’s like a translator between two people who speak different languages.

---

<br>

<p align="center">
  Made with ❤️ by <a href="https://github.com/syedyshiraz" target="_blank">syedyshiraz</a>
</p>

