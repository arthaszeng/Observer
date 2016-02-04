package TemplateMethod;

abstract class AbstractWingkDog {
    public abstract void getPeople();
    public abstract void getDog();

    public void wingkDog () {
        getPeople();
        System.out.print("遛");
        getDog();
        System.out.println();
    }
}
