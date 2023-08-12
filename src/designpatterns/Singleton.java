package designpatterns;

// thread-safe singleton pattern
public class Singleton {
    private static final Object lockObj = new Object();
    private static int objectCount = 0;
    private static Singleton instance;
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (lockObj) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    private Singleton() {
        objectCount++;
        System.out.println(objectCount + " Singleton object(s) created");
    }
}
