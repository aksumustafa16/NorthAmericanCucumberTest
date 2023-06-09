package edu.na.step_definition;

import edu.na.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class ViewAssignmentFromCalenderStepDef {

    @Then("the user see the assignments")
    public void the_user_see_the_assignments() throws InterruptedException {
        Driver.get().findElement(By.linkText("Course Calendar")).click();
        Thread.sleep(2000);
        Driver.get().findElement(By.xpath("(//*[@*='fc-content'])[18]")).click();
        Thread.sleep(1000);
        Driver.get().findElement(By.linkText("View assignment")).click();
        String ActualText = Driver.get().findElement(By.id("pg0_V_HeaderNavigation__lblName")).getText();
        String ExpectedText = "Source Code";
        System.out.println(ActualText + " " + ExpectedText);
        Assert.assertEquals(ActualText,ExpectedText);
    }
}
