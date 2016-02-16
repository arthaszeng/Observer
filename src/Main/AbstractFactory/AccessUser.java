package AbstractFactory;

public class AccessUser implements InterfaceUser {
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
