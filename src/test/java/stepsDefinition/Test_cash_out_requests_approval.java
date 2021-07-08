package stepsDefinition;

import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import pages.RequestsPage;

public class Test_cash_out_requests_approval extends BaseTest{
    RequestsPage requestsPage = null;

    @Then("Select cash out requests & approve")
    public void select_cash_out_requests_to_approve() throws InterruptedException {
        requestsPage = PageFactory.initElements(driver, RequestsPage.class);
        requestsPage.approveMultiple();
    }

    @Then("Confirm success message")
    public void confirm_success_message() {
    }
}
