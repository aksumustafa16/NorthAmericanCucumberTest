package edu.na.step_definition;


import edu.na.pages.LoginPage;
import edu.na.utilites.BrowserUtils;
import edu.na.utilites.ConfigurationReader;
import edu.na.utilites.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
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
    @Test
    public void HomeButtonAssertion() {
        Driver.get().findElement(By.linkText("Home")).click();
        Assert.assertEquals(Driver.get().getCurrentUrl(),ConfigurationReader.get("homeButtonUrl"));
    } @Test
    public void CampusLifeButtonAssertion() {
        Driver.get().findElement(By.linkText("Campus Life")).click();
        Assert.assertEquals(Driver.get().getCurrentUrl(),ConfigurationReader.get("campusLifeButtonUrl"));
    } @Test
    public void AcademicsButtonAssertion() {
        Driver.get().findElement(By.linkText("Academics")).click();
        Assert.assertEquals(Driver.get().getCurrentUrl(),ConfigurationReader.get("academicsButtonUrl"));
    } @Test
    public void StudentsButtonAssertion() {
        Driver.get().findElement(By.linkText("Students")).click();
        Assert.assertEquals(Driver.get().getCurrentUrl(),ConfigurationReader.get("studentsButtonUrl"));
    } @Test
    public void AlumniButtonAssertion() {
        Driver.get().findElement(By.linkText("Alumni")).click();
        Assert.assertEquals(Driver.get().getCurrentUrl(),ConfigurationReader.get("alumniButtonUrl"));
    }
    @Test
    public void MyPagesButtonAssertion() {
        Driver.get().findElement(By.linkText("My Pages")).click();
        Assert.assertEquals(Driver.get().getCurrentUrl(),ConfigurationReader.get("myPagesButtonUrl"));
    }
}
