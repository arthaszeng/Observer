package SimpleFactoryMethod;

public class TWerFactory {
    private ThoughtWorker twer;

    public ThoughtWorker createTwer(String role) {
        switch (role.toUpperCase()) {
            case "DEV" :
                twer = new Dev();
                break;
            case "QA" :
                twer = new QA();
                break;
            default:
                twer = null;
        }
        return twer;
    }
}
