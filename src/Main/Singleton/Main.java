package Singleton;

public class Main {
    public static void main(String args[]) {
        Singleton s1 = Singleton.getInstance();
        s1.inc();
        s1.show();

        Singleton s2 = Singleton.getInstance();
        s2.inc();
        s2.show();
        System.out.println(s1 == s2);

        CreateThreads threads = new CreateThreads();
        threads.makeTrouble();
    }
}
