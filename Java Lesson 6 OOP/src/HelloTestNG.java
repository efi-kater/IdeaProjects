import org.testng.annotations.*;

public class HelloTestNG {
    // Run once at the beginning of the test
    @BeforeClass
    public void runOnceBeforeClass() {
        System.out.println("Before all");
    }
    @BeforeMethod
    public void beforeEachTest(){
        System.out.println("before test");
    }

    // Run once at the end of the test
    @AfterClass
    public void runOnceAfterClass() {
        System.out.println("After all");
    }
    @AfterMethod
    public void afterEachTest(){
        System.out.println("after test");
    }

    @Ignore
    @Test
    public void test_method_1() {
        System.out.println("@Test - test_method_1");
    }

    @Test
    public void test_method_2() {
        System.out.println("@Test - test_method_2");
    }
}
