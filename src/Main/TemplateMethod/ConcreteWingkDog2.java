package TemplateMethod;

public class ConcreteWingkDog2 extends AbstractWingkDog {
    @Override
    public void getPeople() {
        System.out.print("曾超伟");
    }

    @Override
    public void getDog() {
        System.out.print("小布");
    }
}
