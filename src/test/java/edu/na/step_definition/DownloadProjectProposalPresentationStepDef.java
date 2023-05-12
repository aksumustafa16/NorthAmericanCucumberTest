package edu.na.step_definition;

import edu.na.utilites.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class DownloadProjectProposalPresentationStepDef {

    @Then("the user click the Download Proposal button")
    public void the_user_click_the_Download_Proposal_button() throws InterruptedException {
        Driver.get().findElement(By.linkText("Resources")).click();
        Thread.sleep(2000);
        Driver.get().findElement(By.id("pg0_V_CardLayoutControl_cardSetsRepeater_ctl00_cardsInSetRepeater_ctl03_NonAdminButtonLink")).click();
    }
}
