package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/duncan/IdeaProjects/Movercado/Features/cashout_requests.feature",
        glue = "stepsDefinition",
        dryRun = false,
        plugin = {"pretty","html:test-output"}
)
public class TestRunner {
}
