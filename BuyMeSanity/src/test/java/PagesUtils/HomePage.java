package PagesUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.Random;

public class HomePage extends BasePage {

    private WebDriver driver;
    public HomePage(WebDriver driver){
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
    private By ammountDd = By.cssSelector("span[title='סכום']");
    private By amountOption = By.cssSelector("li[value='2']");


    public void registerToSite() {
        super.clickElement(signinBtn);
        super.clickElement(registerLinkBtn);
        super.sendKeysToElement(registerFirstNameTb, "Efi");
        super.sendKeysToElement(registerMailTb, generateRandomEmail());
        super.sendKeysToElement(registerPwTb, "Aa123456");
        super.sendKeysToElement(registerSecondPwTb, "Aa123456");
        super.clickElement(registerAgreementRb);
        super.clickElement(registerBtn);
    }

    public boolean isSingedIn(){
        boolean result=false;
        result=super.getWebElement(myaccountBtn).isDisplayed();
        return  result;
    }




    protected String generateRandomEmail() {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder user = new StringBuilder();
        Random rnd = new Random();
        while (user.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * str.length());
            user.append(str.charAt(index));
        }
        String mail = user+"@at.com";
        return mail;

    }
}
