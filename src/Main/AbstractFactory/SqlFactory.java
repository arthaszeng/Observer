package AbstractFactory;

public class SqlFactory implements AbstractFactory {
    @Override
    public InterfaceUser createUser() {
        return new SqlUser();
    }

    @Override
    public InterfaceAdmin createAdmin() {
        return new SqlAdmin();
    }
}
