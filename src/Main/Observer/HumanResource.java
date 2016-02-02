package Observer;

public class HumanResource implements Notifier {
    private String name;

    public HumanResource(String name) {
        this.name = name;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void myNotify() {
        for (Observer o: observers) {
            o.Update(this);
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
