package Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Singleton {
    private int symble = 1;
    private static Singleton instance;
    private static final Object syncLock = new Object();
    private static Lock lock = new ReentrantLock();
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            lock.lock();
            if (instance == null) {
                instance = new Singleton();
            }
            lock.unlock();
        }
        return instance;
    }

    public void show() {
        System.out.println(symble);
    }

    public void inc() {
        symble++;
    }
}
