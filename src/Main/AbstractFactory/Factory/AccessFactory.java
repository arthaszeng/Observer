package AbstractFactory.Factory;

import AbstractFactory.Database.AccessAdmin;
import AbstractFactory.Database.AccessUser;
import AbstractFactory.Database.OperationOfAdmin;
import AbstractFactory.Database.OperationOfUser;

public class AccessFactory implements AbstractFactory {
    @Override
    public OperationOfUser createUser() {
        return new AccessUser();
    }

    @Override
    public OperationOfAdmin createAdmin() {
        return new AccessAdmin();
    }
}
