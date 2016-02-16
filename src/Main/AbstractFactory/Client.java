package AbstractFactory;

public class Client {

    public static void main (String args[]) {
        User user = new User();
        Administrator admin = new Administrator();

        AbstractFactory factory = new SqlFactory();

        InterfaceUser iUser = factory.createUser();
        InterfaceAdmin iAdmin = factory.createAdmin();

        iUser.insert(user);
        iUser.getUser(888);

        iAdmin.insert(admin);
        iAdmin.getAdmin(666);

        System.out.println("\nThe result after modifying database\n");

        //////////////////////////////////////////////
        //if we want to use an other database,////////
        //just modify here, only one line code;///////
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
