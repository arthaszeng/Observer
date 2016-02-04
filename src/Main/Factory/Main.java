package Factory;

public class Main {
    private void doSomething (ActionSuper action) {
        action.doAction();
    }

    public static void main(String args[]) {
        Main main = new Main();
        ActionFactory factory = new ActionFactory();

        main.doSomething(factory.getAction("eat"));
        main.doSomething(factory.getAction("move"));
        main.doSomething(factory.getAction("study"));
        main.doSomething(factory.getAction("wrong"));
    }

}
/////////////////////////
//console output below://
//吃碗豆腐脑            //
//牵小布去逛街          //
//学英语，敲代码        //
//没事情可以做          //
////////////////////////