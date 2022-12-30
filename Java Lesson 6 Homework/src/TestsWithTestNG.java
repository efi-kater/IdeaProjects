import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
import org.testng.annotations.*;
import  org.testng.annotations.Test;


public class TestsWithTestNG {
    @BeforeClass
    public void beforeAll() {
        System.out.println("Before");
    }

    @Test
    public void test1(){
        System.out.println("A");
    }

    @Test
    public void test2(){
        System.out.println("B");
    }

    @Test
    public void test3(){
        System.out.println("C");
    }

    @AfterClass
    public void afterAll(){
        System.out.println("After");
    }
}