package edu.na.step_definition;

import edu.na.pages.LoginPage;
import edu.na.utilites.BrowserUtils;
import edu.na.utilites.ConfigurationReader;
import edu.na.utilites.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("the user in on the main page")
    public void the_user_in_on_the_main_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Driver.get().findElement(By.id("userName")).sendKeys(ConfigurationReader.get("username"));
        Driver.get().findElement(By.id("siteNavBar_welcomeBackBarLoggedOut_JicsLoginRedirectContinue")).click();
        Driver.get().findElement(By.id("password")).sendKeys(ConfigurationReader.get("password"));
        Driver.get().findElement(By.name("siteNavBar$welcomeBackBarLoggedOut$ButtonLogin")).click();
        Assert.assertEquals(Driver.get().getCurrentUrl(),"https://portal.na.edu/ICS/");
    }

    @When("the user click the login button")
    public void the_user_click_the_login_button() {
        BrowserUtils.waitForClickablility(loginPage.loginButton, Duration.ofSeconds(10)).click();
    }

    @When("the user enter wrong credentials")
    public void the_user_enter_wrong_credentials() {
        loginPage.login("abcdefg", "abcdefg");

    }

    @Then("the user should not be able to login")
    public void the_user_should_not_be_able_to_login() {
        Assert.assertEquals(ConfigurationReader.get("expectedUrl"), Driver.get().getCurrentUrl());
    }
}
