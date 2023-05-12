package edu.na.step_definition;

import edu.na.utilites.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class SendingEmailTestStepDef {

    @Then("the user send the email")
    public void the_user_send_the_email() throws InterruptedException {
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
