package edu.na.step_definition;

import edu.na.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Test;
import org.openqa.selenium.By;

public class CheckNewsAndAnnouncementsStepDef {

    @Then("the user click the News and Announcements button")
    public void the_user_click_the_News_and_Announcements_button() throws InterruptedException {
        Driver. get().findElement(By.linkText("News and Announcements")).click();
        Thread.sleep(2000);
    }
}
