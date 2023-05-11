package co.uk.aviva.step_definition;

import co.uk.aviva.utilites.Driver;
import org.junit.Test;
import org.openqa.selenium.By;

public class PrintDueNextAssignmentsStepDef {

    @Test
    public void PrintDueNextAssignments() throws InterruptedException {
        Driver.get().findElement(By.id("myCourses-label")).click();
        Driver.get().findElement(By.linkText("COMP 5393 1 - Capstone Project")).click();
        Driver.get().findElement(By.linkText("Coursework")).click();
        Thread.sleep(2000);
        System.out.println("First assignment:" + Driver.get().findElement(By.id("pg0_V__dueNext__rptDueNext_ctl00__hypAssign")).getText());
        System.out.println("Second assignment:" + Driver.get().findElement(By.id("pg0_V__dueNext__rptDueNext_ctl01__hypAssign")).getText());


    }
}
