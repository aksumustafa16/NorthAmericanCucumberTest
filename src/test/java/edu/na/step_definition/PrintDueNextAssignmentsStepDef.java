package edu.na.step_definition;

import edu.na.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class PrintDueNextAssignmentsStepDef {

    @Then("the user click the Print Assignments button")
    public void the_user_click_the_Print_Assignments_button() throws InterruptedException {
        Driver.get().findElement(By.linkText("Coursework")).click();
        Thread.sleep(2000);
        System.out.println("First assignment:" + Driver.get().findElement(By.id("pg0_V__dueNext__rptDueNext_ctl00__hypAssign")).getText());
        System.out.println("Second assignment:" + Driver.get().findElement(By.id("pg0_V__dueNext__rptDueNext_ctl01__hypAssign")).getText());

    }
}
