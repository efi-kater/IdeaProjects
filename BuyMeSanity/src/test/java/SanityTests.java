import PagesUtils.Constants;
import PagesUtils.DriverSingleton;
import PagesUtils.HomePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;


public class SanityTests {
    private WebDriver driver;

    @BeforeMethod
    public void init(){
        this.driver = DriverSingleton.getDriverInstance();
        this.driver.get(Constants.SITE);
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));



    }

    @Test
    public void test1(){
        HomePage homePage = new HomePage(driver);
        try {
            homePage.registerToSite();
            assertTrue(homePage.isSingedIn());

        } catch (NoSuchElementException e){
            e.printStackTrace();
        }

}

    @AfterMethod
    public void tearDown(){

    }
}
