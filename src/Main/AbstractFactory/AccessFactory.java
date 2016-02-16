package AbstractFactory;

public class AccessFactory implements AbstractFactory {
    @Override
    public InterfaceUser createUser() {
        return new AccessUser();
    }

    @Override
    public InterfaceAdmin createAdmin() {
        return new AccessAdmin();
    }
}
