package co.uk.aviva.step_definition;

import co.uk.aviva.utilites.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class FindStudentsInRosterStepDef {


    @Test
    public void FindStudentsInRoster() throws InterruptedException {

        Driver.get().findElement(By.linkText("Roster")).click();
        Thread.sleep(2000);
        Driver.get().findElement(By.id("SearchInput0")).sendKeys("Aksu");
        String ExpectedName = "Aksu, Mustafa";
        String ActualName = Driver.get().findElement(By.id("pg0_V_RosterTableResults_ctl01_UserFullNameLabel")).getText();
        Assert.assertEquals(ActualName,ExpectedName,"Verify that actual name is same with expected name");

    }

}
