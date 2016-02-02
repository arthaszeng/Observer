package Observer;

public class main {
    public static void main(String args[]) {
        HumanResource hr1 = new HumanResource("Yuan");
        HumanResource hr2 = new HumanResource("Fang");
        Student zeng = new Student("Zeng");
        Coach water = new Coach("Water");
        hr1.attach(zeng);
        hr1.attach(water);
        hr1.myNotify();

        hr2.attach(zeng);
        hr2.attach(water);
        hr2.detach(zeng);
        hr2.myNotify();
    }
}
