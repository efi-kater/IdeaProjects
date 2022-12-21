public class StaticTest {
    public static void main(String[] args) {
        StaticExample staticExample = new StaticExample();
        System.out.println(staticExample.password2);

        System.out.println(StaticExample.password);

        // todo: This will not work, because password2 is not static..
        // System.out.println(StaticExample.password2);
    }
}
