package co.uk.aviva.step_definition;


import co.uk.aviva.pages.LoginPage;
import co.uk.aviva.utilites.BrowserUtils;
import co.uk.aviva.utilites.ConfigurationReader;
import co.uk.aviva.utilites.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class NavigationMenuStepDefs {

    @When("the user navigates to all Insurance buttons 2")
    public void the_user_navigates_to_all_Insurance_buttons2() {
        Driver.get().manage().window().maximize();
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForClickablility(new LoginPage().acceptCookies, Duration.ofSeconds(10)).click();
        BrowserUtils.waitForClickablility(new LoginPage().insurance, Duration.ofSeconds(10)).click();
        WebElement tabElement = Driver.get().findElement(By.xpath("(//a[@class='a-button a-button--tertiary'])[2]"));
        BrowserUtils.waitForClickablility(tabElement, Duration.ofSeconds(10)).click();
        Assert.assertTrue("Actual Title: " + Driver.get().getTitle(), Driver.get().getTitle().contains(ConfigurationReader.get("2")));
        Driver.closeDriver();
    }

    @When("the user navigates to all Insurance buttons 3")
    public void the_user_navigates_to_all_Insurance_buttons3() {
        Driver.get().manage().window().maximize();
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForClickablility(new LoginPage().acceptCookies, Duration.ofSeconds(10)).click();
        BrowserUtils.waitForClickablility(new LoginPage().insurance, Duration.ofSeconds(10)).click();
        WebElement tabElement = Driver.get().findElement(By.xpath("(//a[@class='a-button a-button--tertiary'])[3]"));
        BrowserUtils.waitForClickablility(tabElement, Duration.ofSeconds(10)).click();
        Assert.assertTrue("Actual Title: " + Driver.get().getTitle(), Driver.get().getTitle().contains(ConfigurationReader.get("3")));
        Driver.closeDriver();
    }

    @When("the user navigates to all Insurance buttons 4")
    public void the_user_navigates_to_all_Insurance_buttons4() {
        Driver.get().manage().window().maximize();
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForClickablility(new LoginPage().acceptCookies, Duration.ofSeconds(10)).click();
        BrowserUtils.waitForClickablility(new LoginPage().insurance, Duration.ofSeconds(10)).click();
        WebElement tabElement = Driver.get().findElement(By.xpath("(//a[@class='a-button a-button--tertiary'])[4]"));
        BrowserUtils.waitForClickablility(tabElement, Duration.ofSeconds(10)).click();
        Assert.assertTrue("Actual Title: " + Driver.get().getTitle(), Driver.get().getTitle().contains(ConfigurationReader.get("4")));
        Driver.closeDriver();
    }

    @When("the user navigates to all Insurance buttons 5")
    public void the_user_navigates_to_all_Insurance_buttons5() {
        Driver.get().manage().window().maximize();
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForClickablility(new LoginPage().acceptCookies, Duration.ofSeconds(10)).click();
        BrowserUtils.waitForClickablility(new LoginPage().insurance, Duration.ofSeconds(10)).click();
        WebElement tabElement = Driver.get().findElement(By.xpath("(//a[@class='a-button a-button--tertiary'])[5]"));
        BrowserUtils.waitForClickablility(tabElement, Duration.ofSeconds(10)).click();
        Assert.assertTrue("Actual Title: " + Driver.get().getTitle(), Driver.get().getTitle().contains(ConfigurationReader.get("5")));
        Driver.closeDriver();
    }

    @When("the user navigates to all Insurance buttons 6")
    public void the_user_navigates_to_all_Insurance_buttons6() {
        Driver.get().manage().window().maximize();
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForClickablility(new LoginPage().acceptCookies, Duration.ofSeconds(10)).click();
        BrowserUtils.waitForClickablility(new LoginPage().insurance, Duration.ofSeconds(10)).click();
        WebElement tabElement = Driver.get().findElement(By.xpath("(//a[@class='a-button a-button--tertiary'])[6]"));
        BrowserUtils.waitForClickablility(tabElement, Duration.ofSeconds(10)).click();
        Assert.assertTrue("Actual Title: " + Driver.get().getTitle(), Driver.get().getTitle().contains(ConfigurationReader.get("6")));
        Driver.closeDriver();
    }

    @When("the user navigates to all Insurance buttons 7")
    public void the_user_navigates_to_all_Insurance_buttons7() {
        Driver.get().manage().window().maximize();
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForClickablility(new LoginPage().acceptCookies, Duration.ofSeconds(10)).click();
        BrowserUtils.waitForClickablility(new LoginPage().insurance, Duration.ofSeconds(10)).click();
        WebElement tabElement = Driver.get().findElement(By.xpath("(//a[@class='a-button a-button--tertiary'])[7]"));
        BrowserUtils.waitForClickablility(tabElement, Duration.ofSeconds(10)).click();
        Assert.assertTrue("Actual Title: " + Driver.get().getTitle(), Driver.get().getTitle().contains(ConfigurationReader.get("7")));
        Driver.closeDriver();
    }

    @When("the user navigates to all Insurance buttons 8")
    public void the_user_navigates_to_all_Insurance_buttons8() {
        Driver.get().manage().window().maximize();
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForClickablility(new LoginPage().acceptCookies, Duration.ofSeconds(10)).click();
        BrowserUtils.waitForClickablility(new LoginPage().insurance, Duration.ofSeconds(10)).click();
        WebElement tabElement = Driver.get().findElement(By.xpath("(//a[@class='a-button a-button--tertiary'])[8]"));
        BrowserUtils.waitForClickablility(tabElement, Duration.ofSeconds(10)).click();
        Assert.assertTrue("Actual Title: " + Driver.get().getTitle(), Driver.get().getTitle().contains(ConfigurationReader.get("8")));
        Driver.closeDriver();
    }

    @When("the user navigates to all Insurance buttons 9")
    public void the_user_navigates_to_all_Insurance_buttons9() {
        Driver.get().manage().window().maximize();
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForClickablility(new LoginPage().acceptCookies, Duration.ofSeconds(10)).click();
        BrowserUtils.waitForClickablility(new LoginPage().insurance, Duration.ofSeconds(10)).click();
        WebElement tabElement = Driver.get().findElement(By.xpath("(//a[@class='a-button a-button--tertiary'])[9]"));
        BrowserUtils.waitForClickablility(tabElement, Duration.ofSeconds(10)).click();
        Assert.assertTrue("Actual Title: " + Driver.get().getTitle(), Driver.get().getTitle().contains(ConfigurationReader.get("9")));
        Driver.closeDriver();
    }

}
