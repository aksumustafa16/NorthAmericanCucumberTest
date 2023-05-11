package co.uk.aviva.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "co/uk/aviva/step_definition",
        plugin = {
                "pretty",
                "html:target/html-reports.html",
                "json:target/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        dryRun = false,
        tags = "@login")
public class CukesRunner {
}
