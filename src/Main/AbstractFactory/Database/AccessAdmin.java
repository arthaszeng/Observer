package AbstractFactory.Database;

import AbstractFactory.Product.Administrator;

public class AccessAdmin implements InterfaceAdmin {

    @Override
    public void insert(Administrator administrator) {
        System.out.println("add a record of administrator in access database.");
    }

    @Override
    public Administrator getAdmin(int id) {
        System.out.println("get a record of administrator from access database.");
        return null;
    }
}
