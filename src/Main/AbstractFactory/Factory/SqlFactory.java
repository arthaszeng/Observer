package AbstractFactory.Factory;

import AbstractFactory.Database.*;

public class SqlFactory implements AbstractFactory {
    @Override
    public OperationOfUser createUser() {
        return new SqlUser();
    }

    @Override
    public OperationOfAdmin createAdmin() {
        return new SqlAdmin();
    }
}
