package Strategy;

public class Context {
    private StrategySuper strategy;

    public Context(StrategySuper strategy) {
        this.strategy = strategy;
    }

    public String getResult (int times) {
        return strategy.actionInterface(times);
    }
 }
