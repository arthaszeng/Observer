package AbstractFactory.Database;

import AbstractFactory.Product.Administrator;

public interface OperationOfAdmin {
    void insert(Administrator administrator);
    Administrator getAdmin(int id);
}
