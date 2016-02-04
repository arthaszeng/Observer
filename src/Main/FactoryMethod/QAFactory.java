package FactoryMethod;

public class QAFactory implements InterfaceFactory {
    @Override
    public ThoughtWorker createTWer() {
        return new QA();
    }
}
