package AbstractFactory.Factory;

import AbstractFactory.Database.AccessAdmin;
import AbstractFactory.Database.AccessUser;
import AbstractFactory.Database.InterfaceAdmin;
import AbstractFactory.Database.InterfaceUser;

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
