import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Main {
    public static void main(String[] args) throws IOException {
//        URL oracle = new URL("http://www.oracle.com/");
//        URLConnection yc = oracle.openConnection();
//        BufferedReader in = new BufferedReader(new InputStreamReader(
//                yc.getInputStream()));
//        String inputLine;
//        while ((inputLine = in.readLine()) != null)
//            System.out.println(inputLine);
//        in.close();
        WebDriver driver = new HtmlUnitDriver();

        // And now use this to visit Google
        driver.get("http://www.google.com");

    }
}
