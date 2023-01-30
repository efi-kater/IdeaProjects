package PagesUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class HomePage extends BasePage {

    private WebDriver driver;
    public HomePage() {
        driver=DriverSingleton.getDriverInstance();
            }


    private By myaccountBtn = By.cssSelector("span[class='arrow ember-view bm-icon sm']");
    private By signinBtn = By.cssSelector("li[class='notSigned']");
    private By registerLinkBtn = By.cssSelector("span[class='text-link theme']");

    private By registerFirstNameTb = By.cssSelector("input[placeholder='שם פרטי']");
    private By registerMailTb = By.cssSelector("input[placeholder='מייל']");
    private By registerPwTb = By.cssSelector("input[placeholder='סיסמה']");
    private By registerSecondPwTb = By.cssSelector("input[placeholder='אימות סיסמה']");

    private By registerAgreementRb = By.cssSelector("circle[class='fill']");

    private By registerBtn = By.cssSelector("button[type='submit']");

    private By ammountDd = By.cssSelector("div[outerText='סכום']");

    private By amountOption99_199 = By.cssSelector("li[value='2']");

    private By regionDd = By.cssSelector("div[alt='אזור']");

    private By regionTelAviv = By.cssSelector("li[value='13']");

    private By categoryDd = By.cssSelector("div[alt='קטגוריה']");

    private By favGifts_2023 = By.cssSelector("li[value='438']");

    private By searchBtn = By.xpath("/html/body/div[6]/div/header/div[3]/div/div/form/a");
    private By presentOfTheWeekX = By.xpath("/html/body/div[4]/div/div[2]/button/svg");




    public void clickSigninBtn()  {
        super.clickElement(signinBtn);
    }

    public void clickRegisterLinkBtn()  {
        super.clickElement(registerLinkBtn);
    }

    public void clickRegisterAgreenemtRb()  {
        super.clickElement(registerAgreementRb);
    }

    public void clickRegisterBtn()  {
        super.clickElement(registerBtn);
    }

    public void setRegisterFirstNameTb(String registerFirstNameTb)  {
        super.sendKeysToElement(this.registerFirstNameTb, registerFirstNameTb);
    }

    public String getRegisterFirstNameTb()  {
        String result= super.getWebElement(registerFirstNameTb).getAttribute("value");
        return result;
    }

    public void setRegisterMailTb(String registerMailTb)  {
        super.sendKeysToElement(this.registerMailTb, registerMailTb);
    }

    public String getRegisterMailTb()  {
        String result= super.getWebElement(registerMailTb).getAttribute("value");
        return result;
    }

    public void setRegisterPwTb(String registerPwTb)  {
        super.sendKeysToElement(this.registerPwTb, registerPwTb);
    }

    public String getRegisterPwTb()  {
        String result= super.getWebElement(registerPwTb).getAttribute("value");
        return result;
    }

    public void setRegisterSecondPwTb(String registerSecondPwTb) {
        super.sendKeysToElement(this.registerSecondPwTb, registerSecondPwTb);
    }

    public String getRegisterSecondPwTb()  {
        String result= super.getWebElement(registerSecondPwTb).getAttribute("value");
        return result;
    }



    public boolean isSingedIn()  {
        boolean result=false;
        result=super.getWebElement(myaccountBtn).isDisplayed();
        return  result;
    }

    public void clickAmountDd()  {
        super.clickElement(ammountDd);
    }
    public void clickAmountOption99_199()  {
        super.clickElement(amountOption99_199);
    }
    public void clickRegionDd()  {
        super.clickElement(regionDd);
    }
    public void clickRegionTelAviv()  {
        super.clickElement(regionTelAviv);
    }
    public void clickCategoryDd()  {
        super.clickElement(categoryDd);
    }
    public void clickFavGifts_2023()  {
        super.clickElement(favGifts_2023);
    }
    public void clickSearchBtn()  {
        super.clickElement(searchBtn);
    }

    public void frames(){
        List< WebElement> list = new ArrayList<>();
        list = driver.findElements(By.tagName("iframe"));
        System.out.println(list.size());
    }




}
