import org.junit.*;

public class JUnitTest {
    // Run once at the beginning of the test
    @BeforeClass
    public void runOnceBeforeClass() {
        System.out.println("Before all");
    }
    @Before
    public static void beforeEachTest(){
        System.out.println("before test");
    }

    // Run once at the end of the test
    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("After all");
    }
    @After
    public static void afterEachTest(){
        System.out.println("after test");
    }

    @Ignore
    @Test
    public static void test_method_1() {
        System.out.println("@Test - test_method_1");
    }

    @Test
    public static void test_method_2() {
        System.out.println("@Test - test_method_2");
    }
}
