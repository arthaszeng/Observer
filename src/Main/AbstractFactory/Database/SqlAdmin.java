package AbstractFactory.Database;

import AbstractFactory.Product.Administrator;

public class SqlAdmin implements InterfaceAdmin {

    @Override
    public void insert(Administrator administrator) {
        System.out.println("add a record of administrator in SQL database.");
    }

    @Override
    public Administrator getAdmin(int id) {
        System.out.println("get a record of administrator from SQL database.");
        return null;
    }
}
