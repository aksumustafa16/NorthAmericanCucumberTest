package edu.na.step_definition;

import edu.na.utilites.ConfigurationReader;
import edu.na.utilites.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUpMethod() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Driver.get().findElement(By.id("userName")).sendKeys(ConfigurationReader.get("username"));
        Driver.get().findElement(By.id("siteNavBar_welcomeBackBarLoggedOut_JicsLoginRedirectContinue")).click();
        Driver.get().findElement(By.id("password")).sendKeys(ConfigurationReader.get("password"));
        Driver.get().findElement(By.name("siteNavBar$welcomeBackBarLoggedOut$ButtonLogin")).click();
        Driver.get().findElement(By.id("myCourses-label")).click();
        Driver.get().findElement(By.linkText("COMP 5393 1 - Capstone Project")).click();
    }

    @After
    public void afterMethod() throws InterruptedException {
        Thread.sleep(2000);
        Driver.get().quit();
    }
}
