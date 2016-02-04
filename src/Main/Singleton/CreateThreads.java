package Singleton;

public class CreateThreads {
    private int num = 0;
    private MyThread runable = new MyThread ();

    public void makeTrouble () {
        for(int i = 0; i < 100000; i++) {
            Thread thread = new Thread(runable);
            thread.run();
            if (thread.isAlive()) {
                num++;
            }
        }

        System.out.println(num);
    }
}
