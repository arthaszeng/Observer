package TemplateMethod;

public class Main {
    public static void main (String args[]) {
        AbstractWingkDog abstractWingkDog1 = new ConcreteWingkDog1();
        AbstractWingkDog abstractWingkDog2 = new ConcreteWingkDog2();

        abstractWingkDog1.wingkDog();
        abstractWingkDog2.wingkDog();
    }
}
