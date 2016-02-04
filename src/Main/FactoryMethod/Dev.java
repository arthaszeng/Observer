package FactoryMethod;

public class Dev extends ThoughtWorker {
    public Dev() {
        this.role = "Dev";
    }

    @Override
    public void work() {
        System.out.println(role + " is to program.");
    }
}
