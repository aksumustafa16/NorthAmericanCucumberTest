package edu.na.step_definition;

import edu.na.utilites.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FindStudentsInRosterStepDef {

    @Then("the user click the Search button")
    public void the_user_click_the_Search_button() throws InterruptedException {
        Driver.get().findElement(By.linkText("Roster")).click();
        Thread.sleep(2000);
        Driver.get().findElement(By.id("SearchInput0")).sendKeys("Aksu Mustafa");
        String ExpectedName = "Aksu, Mustafa";
        String ActualName = Driver.get().findElement(By.id("pg0_V_RosterTableResults_ctl01_UserFullNameLabel")).getText();
        Assert.assertEquals(ActualName,ExpectedName,"Verify that actual name is same with expected name");

    }

}
