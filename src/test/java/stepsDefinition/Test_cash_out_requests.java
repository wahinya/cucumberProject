package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.MessagePage;

public class Test_cash_out_requests extends BaseTest{
    HomePage homePage = null;
    MessagePage messagePage = null;
    LoginPage loginPage= null;

    @Given("User launch browser or mobile app")
    public void user_launch_browser() {
       initializer();
    }

    @When("User logs into mvc with email {string} and password {string}")
    public void userLogsIntoMvcWithEmailAndPassword(String arg0, String arg1) throws InterruptedException {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickLoginLink();
        loginPage.addEmail(arg0);
        loginPage.addPassword(arg1);
    }

    @When("Send a message with transport as {string} contact as {string} and a trigger as {string}")
    public void send_a_message_with_transport_as_contact_as_and_a_trigger_as(String transport, String contact, String trigger) throws InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickMessageLink();
        Thread.sleep(1000);
        messagePage = PageFactory.initElements(driver, MessagePage.class);
        messagePage.addTransport(transport);
        messagePage.addContact(contact);
        messagePage.addTrigger(trigger);
        messagePage.clickSave();
        messagePage.clickCancel();
        Thread.sleep(1000);
    }

    @Then("A message as {string} is generated")
    public void a_success_message_as_is_generated(String message) {
        Assert.assertTrue(verifyMessage(message));
    }
    private boolean verifyMessage(String message) {
        homePage = PageFactory.initElements(driver, HomePage.class);
        String actualMessage = homePage.getActualMessage();
        return actualMessage.equals(message);
    }
}
