package co.uk.aviva.step_definition;

import co.uk.aviva.utilites.Driver;
import org.junit.Test;
import org.openqa.selenium.By;

public class SendingEmailTestStepDef {

    @Test
    public void SendingEmailTest() throws InterruptedException {
        Driver.get().findElement(By.id("myCourses-label")).click();
        Driver.get().findElement(By.linkText("COMP 5393 1 - Capstone Project")).click();
        Driver.get().findElement(By.linkText("Course Information")).click();
        Thread.sleep(2000);
        Driver.get().findElement(By.id("pg0_V_rptFaculty_ctl00_EmailAddress")).click();
        Thread.sleep(2000);
        Driver.get().findElement(By.name("pg0$V$SubjectTextBox")).sendKeys("Test For Sending Email");
        Thread.sleep(2000);
        Driver.get().switchTo().frame("pg0_V_BodyTextEditor_ctl00_ifr");
        Driver.get().findElement(By.id("tinymce")).sendKeys("This email is sending for to test sending email page in Course information page");



    }

}
