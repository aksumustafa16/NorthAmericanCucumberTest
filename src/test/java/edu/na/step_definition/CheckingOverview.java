package edu.na.step_definition;

import edu.na.utilites.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class CheckingOverview {

    @Then("the user click the Checking Overview")
    public void the_user_click_the_Checking_Overview() throws InterruptedException {
        Driver.get().findElement(By.linkText("Overview")).click();
    }
}
