package AbstractFactory.Factory;

import AbstractFactory.Database.InterfaceAdmin;
import AbstractFactory.Database.InterfaceUser;

public interface AbstractFactory {
    InterfaceUser createUser();
    InterfaceAdmin createAdmin();
}
