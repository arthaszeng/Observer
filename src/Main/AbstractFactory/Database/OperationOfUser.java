package AbstractFactory.Database;

import AbstractFactory.Product.User;

public interface OperationOfUser {
    void insert (User user);
    User getUser (int id);
}
