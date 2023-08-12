package designpatterns;

public class Singleton {
    private static Object lockObj = new Object();
    private static int objectCount = 0;
    private static Singleton instance;
    public static Singleton getInstance() {
        synchronized (lockObj) {
            if(instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    private Singleton() {
        objectCount++;
        System.out.println(objectCount + " Singleton object(s) created");
    }
}
