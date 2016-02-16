package AbstractFactory.Database;

import AbstractFactory.Product.User;

public interface InterfaceUser {
    void insert (User user);
    User getUser (int id);
}
