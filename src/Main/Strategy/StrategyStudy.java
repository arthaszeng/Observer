package Strategy;

public class StrategyStudy extends StrategySuper {
    @Override
    public String actionInterface(int times) {
        return String.format("敲%d行代码");
    }
}
