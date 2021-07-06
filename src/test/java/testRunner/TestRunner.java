package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/duncan/IdeaProjects/movercado-frontend-tests/Features",
        glue = "stepsDefinition",
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html"},
        publish=true
)
public class TestRunner {
}
