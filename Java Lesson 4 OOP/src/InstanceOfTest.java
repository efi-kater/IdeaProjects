public class InstanceOfTest {
    public static void main(String[] args) {
        Cow a = new Cow();

        System.out.println(a instanceof Cow); // true
        System.out.println(a instanceof Animal); // true
        System.out.println(a instanceof Inter); //true
    }
}
