package AbstractFactory;

public class SqlUser implements InterfaceUser {
    @Override
    public void insert(User user) {
        System.out.println("add a record of user in SQL database.");
    }

    @Override
    public User getUser(int id) {
        System.out.println("get a record of user from SQL database.");
        return null;
    }
}
