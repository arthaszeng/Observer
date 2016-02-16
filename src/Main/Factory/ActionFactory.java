package Factory;

public class ActionFactory {

    public ActionSuper getAction(String symble) {
        switch (symble) {
            case "eat":
                return new ActionEat();
            case "move":
                return new ActionMove();
            case "study":
                return new ActionStudy();
            default:
                return new ActionSuper() {
                    @Override
                    public void doAction() {
                        System.out.println("没事情可以做");
                    }
                };
        }
    }
}
