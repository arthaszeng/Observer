package Decorator;

import Decorator.ConcreteComponent.Dog;
import Decorator.ConcreteComponent.People;
import Decorator.Decorator.Run;
import Decorator.Decorator.Sleep;

public class Client {
    public static void main(String args[]) {
        People people = new People();
        Dog dog = new Dog();
        Sleep sleep = new Sleep();
        Run run = new Run();

        sleep.setComponent(people);
        run.setComponent(sleep);
        run.operation();
        System.out.println();

        run.setComponent(dog);
        sleep.setComponent(run);
        sleep.operation();
        System.out.println();
    }
}


///////the result below:
//作为一个人，可以做： 睡觉 跑
//作为一只狗，可以做： 跑 睡觉
