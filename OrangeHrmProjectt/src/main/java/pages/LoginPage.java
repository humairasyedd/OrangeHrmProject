package pages;

import Browser.Browser;
import Browser.Info;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(css="input[name='username']") private WebElement userName;
    @FindBy(xpath="//input[@name='password']") private WebElement password;
    @FindBy(className = "orangehrm-login-button") private WebElement logiButton;

    public PIMPage loginToPIMpage(){
        userName.sendKeys(Info.USER_NAME);
        password.sendKeys(Info.PASSWORD);
        logiButton.click();
        return PageFactory.initElements(Browser.driver, PIMPage.class);
    }

}
