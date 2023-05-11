package co.uk.aviva.step_definition;

import co.uk.aviva.utilites.Driver;
import org.junit.Test;
import org.openqa.selenium.By;

public class CheckNewsAndAnnouncementsStepDef {
    @Test
    public void ViewAssignmentFromCalender() throws InterruptedException {
        Driver.get().findElement(By.id("myCourses-label")).click();
        Driver.get().findElement(By.linkText("COMP 5393 1 - Capstone Project")).click();
        Driver.get().findElement(By.linkText("News and Announcements")).click();
        Thread.sleep(2000);
    }
}
