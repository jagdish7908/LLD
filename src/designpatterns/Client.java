package designpatterns;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        for (var i = 0; i < 10; i++) {
            Runnable r = () -> Singleton.getInstance();
            pool.execute(r);
        }
        pool.close();
    }
}
