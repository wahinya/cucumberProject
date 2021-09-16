package stepsDefinition;

import configs.ConfigJsonData;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.HomePage;
import pages.MessagePage;

import java.io.IOException;

public class Test_service_validation extends BaseTest {
    HomePage homePage = null;
    MessagePage messagePage = null;
    ConfigJsonData config = new ConfigJsonData();
    Test_request_cash_out test_request_cash_out = new Test_request_cash_out();

    // missed call logic

    @When("Rafiki send a missed call through a transport to receive a code")
    public void rafiki_send_a_missed_call_through_a_transport_to_receive_a_code() throws IOException, InterruptedException {
            homePage = PageFactory.initElements(driver, HomePage.class);
            messagePage = PageFactory.initElements(driver, MessagePage.class);
            homePage.openNewMessagePage();
            messagePage.addTransport(config.getTransport(6));
            messagePage.addContact(config.getContact(6));
            messagePage.addTrigger(config.getTrigger(6));
            Thread.sleep(200);
            messagePage.clickSave();
            messagePage.clickCancel();
    }
    @Then("Service provider validate the code")
    public void service_provider_validate_the_code() throws IOException, InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        String code = homePage.getActualMessage();
        homePage.openNewMessagePage();
        messagePage.addTransport(config.getTransport(7));
        messagePage.addContact(config.getContact(7));
        messagePage.addTrigger("validate"+" "+ code);
        Thread.sleep(200);
        messagePage.clickSave();
        messagePage.clickCancel();
    }


    // Request validate - logic

    @When("Provider send a request through a transport to receive a code")
    public void provider_send_a_requestvalidate_through_a_transport_to_receive_a_code() throws IOException, InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        messagePage = PageFactory.initElements(driver, MessagePage.class);
        homePage.openNewMessagePage();
        messagePage.addTransport(config.getTransport(14));
        messagePage.addContact(config.getContact(14));
        messagePage.addTrigger(config.getTrigger(14));
        Thread.sleep(200);
        messagePage.clickSave();
        messagePage.clickCancel();
    }
    @Then("Rafiki validate the code")
    public void rafiki_validate_the_code() throws IOException, InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        String code = homePage.getActualMessage();
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.openNewMessagePage();
        messagePage.addTransport(config.getTransport(15));
        messagePage.addContact(config.getContact(15));
        messagePage.addTrigger("validate"+" "+ code);
        Thread.sleep(200);
        messagePage.clickSave();
        messagePage.clickCancel();
    }

    @Then("Rafiki receive a success message")
    public void rafiki_receive_a_success_message() throws IOException {
        Assert.assertTrue(test_request_cash_out.verifyMessage2(config.getResponse2(7)));
    }
    @Then("Service provider receive a success message")
    public void service_provider_receive_a_success_message() throws IOException {
        Assert.assertTrue(test_request_cash_out.verifyMessage(config.getResponse(7)));
    }
    @When("Rafiki rate the service")
    public void rafiki_rate_the_service() throws IOException, InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        messagePage = PageFactory.initElements(driver, MessagePage.class);
        Thread.sleep(5000);
        homePage.openNewMessagePage();
        messagePage.addTransport(config.getTransport(8));
        messagePage.addContact(config.getContact(8));
        messagePage.addTrigger(config.getTrigger(8));
        Thread.sleep(200);
        messagePage.clickSave();
        messagePage.clickCancel();
    }
    @When("Rafiki answer the first question")
    public void rafiki_answer_the_first_question() throws IOException, InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        messagePage = PageFactory.initElements(driver, MessagePage.class);
        homePage.openNewMessagePage();
        messagePage.addTransport(config.getTransport(9));
        messagePage.addContact(config.getContact(9));
        messagePage.addTrigger(config.getTrigger(9));
        Thread.sleep(200);
        messagePage.clickSave();
        messagePage.clickCancel();
    }
    @Then("Rafiki answer last question")
    public void rafiki_answer_the_last_question() throws IOException, InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        messagePage = PageFactory.initElements(driver, MessagePage.class);
        homePage.openNewMessagePage();
        messagePage.addTransport(config.getTransport(16));
        messagePage.addContact(config.getContact(16));
        messagePage.addTrigger(config.getTrigger(16));
        Thread.sleep(200);
        messagePage.clickSave();
        messagePage.clickCancel();
    }
    @Then("Rafiki receives 5 tiko miles success message")
    public void rafiki_receives_a_tiko_miles() throws IOException {
        Assert.assertTrue(test_request_cash_out.verifyMessage(config.getResponse(16)));
    }
}
