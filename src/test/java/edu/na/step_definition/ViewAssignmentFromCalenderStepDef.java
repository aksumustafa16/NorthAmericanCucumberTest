package co.uk.aviva.step_definition;

import co.uk.aviva.utilites.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class ViewAssignmentFromCalenderStepDef {


    @Test
    public void ViewAssignmentFromCalender() throws InterruptedException {
        Driver.get().findElement(By.id("myCourses-label")).click();
        Driver.get().findElement(By.linkText("COMP 5393 1 - Capstone Project")).click();
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
