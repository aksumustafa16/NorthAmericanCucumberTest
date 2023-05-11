package co.uk.aviva.pages;

import co.uk.aviva.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//button[text()='Accept all Cookies']")
    public WebElement acceptCookies;

    @FindBy(xpath = "(//*[*='Log in'])[2]")
    public WebElement loginButton;

    @FindBy(xpath = "(//a[text()='Insurance'])[1]")
    public WebElement insurance;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "loginButton")
    public WebElement submit;

   @FindBy(xpath = "//*[@class='o-masthead-logo__link']")
   public WebElement avivaLogo;

    @FindBy(xpath = "(//a[@class='a-button a-button--tertiary'])[2]")
    public WebElement carInsurance;





    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
       // submit.click();
        // verification that we logged
    }
}
