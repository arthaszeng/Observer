package Observer;

public class Coach implements Observer {
    private String name;

    public Coach(String name) {
        this.name = name;
    }

    @Override
    public void Update(Notifier notifier) {
        System.out.println(String.format("%s said to %s: Go to take a lecture.", notifier.getName(), name));
    }
}
