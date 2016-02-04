package SimpleFactoryMethod;

public class Main {

    public static void main(String args[]) {
        TWerFactory factory = new TWerFactory();
        ThoughtWorker twer1 = factory.createTwer("qa");
        ThoughtWorker twer2 = factory.createTwer("dev");

        twer1.work();
        twer2.work();
    }
}
