import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalcPage extends BasePage{

    private WebDriver driver;

    public CalcPage(){
        this.driver=DriverSingleton.getDriverInstance();
    }

    private By sevenDigit = By.id("seven");
    private By sixDigit = By.id("six");
    private By addBtn = By.id("add");
    private By equalBtn = By.id("equal");
    private By screen = By.id("screen");

    public final int SEVEN_HEIGHT = super.getWebElement(sevenDigit).getRect().getHeight();
    public final int SEVEN_WIDTH = super.getWebElement(sevenDigit).getRect().getWidth();

    public boolean isSixDisplayed(){
        boolean result = super.getWebElement(sixDigit).isDisplayed();
        return result;
    }

    public String calcSixPlusSeven(){
        String result = "";
        clickElement(sevenDigit);
        clickElement(addBtn);
        clickElement(sixDigit);
        clickElement(equalBtn);
        result = super.getWebElement(screen).getText();
        return result;
    }

}
