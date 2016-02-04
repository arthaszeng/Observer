package Strategy;

public class StrategyMove extends StrategySuper {
    @Override
    public String actionInterface(int times) {
        return String.format("牵小布逛%d次街", times);
    }
}
