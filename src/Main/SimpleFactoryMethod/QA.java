package SimpleFactoryMethod;

public class QA extends ThoughtWorker {
    public QA() {
        this.role = "QA";
    }

    @Override
    public void work() {
        System.out.println(role + " is to ensure the quality of the products.");
    }
}
