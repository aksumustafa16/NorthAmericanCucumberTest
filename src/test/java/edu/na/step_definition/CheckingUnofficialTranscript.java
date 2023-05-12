package edu.na.step_definition;

import edu.na.utilites.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class CheckingUnofficialTranscript {

    @Then("the user click the Checking Unofficial Transcript")
    public void the_user_click_the_Checking_Unofficial_Transcript() throws InterruptedException {
        Driver.get().findElement(By.linkText("Academics")).click();
        Driver.get().findElement(By.linkText("Grades")).click();
        Thread.sleep(1000);
        Driver.get().findElement(By.id("pg0_V_lnkViewTrans")).click();
    }
}
