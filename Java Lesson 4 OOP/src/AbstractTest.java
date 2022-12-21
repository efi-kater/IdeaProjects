public class AbstractTest {
    public static void main(String[] args) {
        Employee a = new Accountant();
        a.work();

        Employee p = new Programmer();
        p.work();
    }
}
