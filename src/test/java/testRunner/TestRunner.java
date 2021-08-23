package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/duncan/IdeaProjects/movercado-frontend-tests/Features/12_servicevalidation_requestvalidate_ratingPQ_credit.feature",
        glue = "stepsDefinition",
        publish=true
)
public class TestRunner {
}