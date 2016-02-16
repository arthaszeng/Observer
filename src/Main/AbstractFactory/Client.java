package AbstractFactory;

import AbstractFactory.Database.OperationOfAdmin;
import AbstractFactory.Database.OperationOfUser;
import AbstractFactory.Factory.AbstractFactory;
import AbstractFactory.Factory.AccessFactory;
import AbstractFactory.Factory.SqlFactory;
import AbstractFactory.Product.Administrator;
import AbstractFactory.Product.User;

public class Client {

    public static void main (String args[]) {
        User user = new User();
        Administrator admin = new Administrator();

        AbstractFactory factory = new SqlFactory();

        OperationOfUser iUser = factory.createUser();
        OperationOfAdmin iAdmin = factory.createAdmin();

        iUser.insert(user);
        iUser.getUser(888);

        iAdmin.insert(admin);
        iAdmin.getAdmin(666);

        System.out.println("\nThe result after modifying database\n");

        //////////////////////////////////////////////
        //if we want to use an other database,////////
        //just modify here, only one line of code;///////
        factory = new AccessFactory();////////////////
        //////////////////////////////////////////////

        iUser = factory.createUser();
        iAdmin = factory.createAdmin();

        iUser.insert(user);
        iUser.getUser(888);

        iAdmin.insert(admin);
        iAdmin.getAdmin(666);
    }

}

/////////////////////////////result//////////////////
//        add a record of user in SQL database.
//        get a record of user from SQL database.
//        add a record of administrator in SQL database.
//        get a record of administrator from SQL database.
//
//        The result after modifying database
//
//        add a record of user in Access database.
//        get a record of user from Access database.
//        add a record of administrator in access database.
//        get a record of administrator from access database.
