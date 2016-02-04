package Singleton;

public class MyThread implements Runnable {
    @Override
    public void run() {
        Singleton.getInstance();
    }
}
