package CreationalDesignPatterns.SingletonDesignPattern;

public class Singleton {
    private static volatile Singleton instance;

    public String value;
    
    private Singleton(String value){
        this.value = value;
    }

    //This is called the second check in double-checked locking. It reduces the overhead of acquiring a lock by first checking the locking condition without synchronization.
    public static Singleton getInstance(String val){
        if(instance==null){
            synchronized(Singleton.class){//It locks on the Singleton.class object, which is a shared lock across all threads (since there's only one Class object per classloader).
                if(instance==null){//After acquiring the lock, it checks again if the instance is still null.  Because another thread might have already created the instance while the current thread was waiting to acquire the lock.
                    instance = new Singleton(val);
                }
            }
        }
        return instance;
    }
}
