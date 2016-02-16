package AbstractFactory.Database;

import AbstractFactory.Product.User;

public class AccessUser implements OperationOfUser {
    @Override
    public void insert(User user) {
        System.out.println("add a record of user in Access database.");
    }

    @Override
    public User getUser(int id) {
        System.out.println("get a record of user from Access database.");
        return null;
    }
}
