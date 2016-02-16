package Decorator.Decorator;

public class Sleep extends Movement {
    @Override
    public void operation() {
        super.operation();
        System.out.print(" 睡觉");
    }
}
