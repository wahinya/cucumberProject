package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/duncan/IdeaProjects/movercado-frontend-tests/Features/07_transaction_person_to_person_zero_miles.feature",
        glue = "stepsDefinition",
        publish=true
)
public class TestRunner {
}
