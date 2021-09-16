package stepsDefinition;

import configs.ConfigJsonData;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.HomePage;
import pages.InteractionPage;

import java.io.IOException;

public class Test_add_interaction extends BaseTest{
    HomePage home = null;
    InteractionPage interactionPage = null;
    ConfigJsonData config = new ConfigJsonData();
    Test_request_cash_out test_request_cash_out = null;


    @Then("Navigate to the interaction page")
    public void navigate_to_the_interaction_page() {
        home = PageFactory.initElements(driver, HomePage.class);
        home.openNewInteractionPage();
    }

    @Then("Fill the interaction form and submit")
    public void fill_the_interaction_form_and_submit() throws IOException {
        interactionPage = PageFactory.initElements(driver, InteractionPage.class);
        interactionPage.fillAndSubmitInteraction(config.interactionName(0),config.interactionDescription(0));
    }

    @Then("A success message is displayed")
    public void a_success_message_is_displayed() throws IOException {
        Assert.assertTrue(verifyMessage(config.getSuccess(0)));
    }
    public void rafiki_receives_a_tiko_miles() throws IOException {
        Assert.assertTrue(test_request_cash_out.verifyMessage(config.getResponse(0)));
    }

    // verify message method
    boolean verifyMessage(String message) {
       interactionPage = PageFactory.initElements(driver, InteractionPage.class);
        String actualMessage = interactionPage.getActualMessage();
        return actualMessage.equals(message);
    }
}
