package Strategy;

public class StrategyEat extends StrategySuper {
    @Override
    public String actionInterface(int times) {
        return String.format("吃%d碗豆腐脑", times);
    }

}
