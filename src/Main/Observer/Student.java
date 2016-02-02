package Observer;

public class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void Update(Notifier notifier) {
        System.out.println(String.format("%s said to %s: Go to the class.", notifier.getName(), name));
    }
}
