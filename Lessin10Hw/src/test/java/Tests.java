import com.paulhammant.ngwebdriver.ByAngular;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static java.lang.Integer.parseInt;
import static org.testng.Assert.*;

public class Tests {
    private WebDriver driver;

    @BeforeMethod
    public void init(){
        this.driver = DriverSingleton.getDriverInstance();

  }

  @Test
    public void ex1() throws InterruptedException {
        driver.get("https://dgotlieb.github.io/Selenium/synchronization.html");

        //part1
        List<WebElement> checkbox = driver.findElements(By.cssSelector("input[id='checkbox']"));
        int count =0;
        for (int i=0;i<checkbox.size();i++){
            if (checkbox.get(i).isDisplayed()){
                count++;
            }
        }
        assertEquals(count,1);
        driver.findElement(By.id("btn")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Daniel for some reason this is not working
        count=0;
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[id='message']")));
        List<WebElement> checkboxAfter = driver.findElements(By.cssSelector("input[id='checkbox']"));
        for (int i=0;i<checkboxAfter.size();i++){
          if (checkboxAfter.get(i).isDisplayed()){
              count++;
          }
        }
        assertEquals(count,2);

       //part2
        assertFalse(driver.findElement(By.tagName("h4")).isDisplayed());
        driver.findElement(By.cssSelector("button[id='hidden']")).click();
        Thread.sleep(5000);
        assertTrue(driver.findElement(By.tagName("h4")).isDisplayed());

        //part3
        driver.findElement(By.cssSelector("button[id='rendered']")).click();
        WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/h4")));
        assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/h4")).isDisplayed());
  }

  @Test
    public void ex2(){
      driver.get("https://dgotlieb.github.io/AngularJS/main.html");
      String name = String.valueOf(driver.findElement(ByAngular.model("firstName")).getAttribute("value"));
      for (int i = 0; i<name.length();i++){
          driver.findElement(ByAngular.model("firstName")).sendKeys(Keys.BACK_SPACE);
      }
      driver.findElement(ByAngular.model("firstName")).sendKeys("Efi");
      assertEquals(driver.findElement(ByAngular.model("firstName")).getAttribute("value"),"Efi");
  }

    @Test
    public void ex4(){
        driver.get("https://dgotlieb.github.io/WebCalculator/");
        CalcPage calcPage = new CalcPage();
        System.out.println(calcPage.SEVEN_HEIGHT);
        System.out.println(calcPage.SEVEN_WIDTH);
        System.out.println(calcPage.isSixDisplayed());
        assertEquals(parseInt(calcPage.calcSixPlusSeven()),13);
    }


}
