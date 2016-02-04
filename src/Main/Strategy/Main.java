package Strategy;

public class Main {
    public static void main(String args[]) {
        int times = 16;
        Context context = new Context(new StrategyEat());
        System.out.println(context.getResult(times));

        context = new Context(new StrategyMove());
        System.out.println(context.getResult(times));

        context = new Context(new StrategyMove());
        System.out.println(context.getResult(times));
    }
}
