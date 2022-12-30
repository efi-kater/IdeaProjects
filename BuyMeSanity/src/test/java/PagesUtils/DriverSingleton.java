package PagesUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverSingleton {
    private static WebDriver driver;

    public static WebDriver getDriverInstance(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-extensions");
            driver = new ChromeDriver(options);
        }

        return driver;
    }
}
