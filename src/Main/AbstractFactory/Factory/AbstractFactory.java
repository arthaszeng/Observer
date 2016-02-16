package AbstractFactory.Factory;

import AbstractFactory.Database.OperationOfAdmin;
import AbstractFactory.Database.OperationOfUser;

public interface AbstractFactory {
    OperationOfUser createUser();
    OperationOfAdmin createAdmin();
}
