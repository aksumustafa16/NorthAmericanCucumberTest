package co.uk.aviva.step_definition;

import co.uk.aviva.utilites.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DownloadProjectProposalPresentationStepDef {

    @Test
    public void DownloadProjectProposalPresentation() throws InterruptedException {
        Driver.get().findElement(By.id("myCourses-label")).click();
        Driver.get().findElement(By.linkText("COMP 5393 1 - Capstone Project")).click();
        Driver.get().findElement(By.linkText("Resources")).click();
        Thread.sleep(2000);
        Driver.get().findElement(By.id("pg0_V_CardLayoutControl_cardSetsRepeater_ctl00_cardsInSetRepeater_ctl03_NonAdminButtonLink")).click();

    }

}
