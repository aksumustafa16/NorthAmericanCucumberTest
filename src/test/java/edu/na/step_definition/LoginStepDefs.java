package co.uk.aviva.step_definition;

import co.uk.aviva.pages.LoginPage;
import co.uk.aviva.utilites.BrowserUtils;
import co.uk.aviva.utilites.ConfigurationReader;
import co.uk.aviva.utilites.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.time.Duration;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("the user in on the main page")
    public void the_user_in_on_the_main_page() {
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
