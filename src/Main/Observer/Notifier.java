package Observer;

import java.util.ArrayList;
import java.util.List;

interface Notifier {
    List<Observer> observers = new ArrayList<>();
    void attach(Observer observer);
    void detach (Observer observer);
    void myNotify();

    String getName();
}
