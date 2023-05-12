package edu.na.step_definition;

import edu.na.utilites.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class StartingChatStepDef {

    @Then("the user start the chata")
    public void the_user_start_the_chata() throws InterruptedException {
        Driver.get().findElement(By.linkText("Chat")).click();
        Thread.sleep(2000);
        Driver.get().switchTo().frame("b7dea712-4d78-4dff-8045-4d2c5cd2ff38inputMessage_ifr");
        Driver.get().findElement(By.id("tinymce")).sendKeys("Whit this chat box I will start the chat right now.");
    }
}
