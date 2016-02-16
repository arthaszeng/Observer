package AbstractFactory.Database;

import AbstractFactory.Product.Administrator;

public interface InterfaceAdmin {
    void insert(Administrator administrator);
    Administrator getAdmin(int id);
}
