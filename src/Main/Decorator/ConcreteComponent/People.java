package Decorator.ConcreteComponent;

import Decorator.Component.Component;

public class People extends Component {
    @Override
    public void operation() {
        System.out.print("作为一个人，可以做：");
    }
}
