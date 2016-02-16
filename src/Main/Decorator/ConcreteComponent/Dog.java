package Decorator.ConcreteComponent;

import Decorator.Component.Component;

public class Dog extends Component {
    @Override
    public void operation() {
        System.out.print("作为一只狗，可以做：");
    }
}
