package Decorator.Decorator;

public class Run extends Movement {
    @Override
    public void operation() {
        super.operation();
        System.out.print(" 跑");
    }
}
