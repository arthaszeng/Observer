package FactoryMethod;

public class Main {

    public static void main(String args[]) {
        InterfaceFactory qaFactory = new QAFactory();
        InterfaceFactory devFactory = new DevFactory();
        ThoughtWorker twer1 = qaFactory.createTWer();
        ThoughtWorker twer2 = devFactory.createTWer();

        twer1.work();
        twer2.work();
    }
}
