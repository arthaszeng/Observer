package FactoryMethod;

public class DevFactory implements InterfaceFactory {
    @Override
    public ThoughtWorker createTWer() {
        return new Dev();
    }
}
