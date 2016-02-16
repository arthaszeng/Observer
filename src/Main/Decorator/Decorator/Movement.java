package Decorator.Decorator;

import Decorator.Component.Component;

public class Movement extends Component {
    private Component component;

    public void setComponent (Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
