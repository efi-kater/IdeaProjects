package PagesUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;


public class DriverSingleton {
    private static WebDriver driver;

    public static WebDriver getDriverInstance()  {
        if(driver == null){
            //String type = getData("browserType");
//            if(type.equals("Chrome")){
//                System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);//when running the code don't forget to replace the path with your path for chrome driver
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("--disable-extensions");
//                driver = new ChromeDriver(options);
//            }
            System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);//when running the code don't forget to replace the path with your path for chrome driver
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-extensions");
            driver = new ChromeDriver(options);
        }
        return driver;
    }
    public static String getData (String keyName) throws Exception{
        File fXmlFile = new File("C:\\Users\\Owner\\IdeaProjects\\BuyMeSanity\\src\\main\\resources\\data.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(keyName).item(0).getTextContent();
    }

}
