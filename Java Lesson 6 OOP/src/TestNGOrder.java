import org.testng.annotations.*;

public class TestNGOrder {
    @Test(priority = 3)
    public void test_method_1() {
        System.out.println("@Test - test_method_1");
    }

    @Test(priority = 2)
    public void test_method_2() {
        System.out.println("@Test - test_method_2");
    }
}