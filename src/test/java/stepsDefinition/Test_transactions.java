package stepsDefinition;

import configs.ConfigJsonData;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.HomePage;
import pages.MessagePage;

import java.io.IOException;

public class Test_transactions extends BaseTest{
    HomePage homePage = null;
    MessagePage messagePage = null;
    ConfigJsonData config = new ConfigJsonData();
    Test_request_cash_out test_request_cash_out = new Test_request_cash_out();

    @When("actor1 request a payment code")
    public void actor1RequestPaymentCode() throws IOException, InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        messagePage = PageFactory.initElements(driver, MessagePage.class);
        homePage.openNewMessagePage();
        messagePage.addTransport(config.getTransport(4));
        messagePage.addContact(config.getContact(4));
        messagePage.addTrigger(config.getTrigger(4));
        Thread.sleep(200);
        messagePage.clickSave();
        messagePage.clickCancel();
    }

    @When("actor with zero miles request a payment code")
    public void actorWithZeroMilesRequestPaymentCode() throws IOException, InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        messagePage = PageFactory.initElements(driver, MessagePage.class);
        homePage.openNewMessagePage();
        messagePage.addTransport(config.getTransport(17));
        messagePage.addContact(config.getContact(17));
        messagePage.addTrigger(config.getTrigger(17));
        Thread.sleep(200);
        messagePage.clickSave();
        messagePage.clickCancel();
    }

    @When("actor2 validate the code")
    public void actor2SendReceiveCode() throws IOException, InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        String code = homePage.getActualMessage();
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.openNewMessagePage();
        messagePage.addTransport(config.getTransport(5));
        messagePage.addContact(config.getContact(5));
        messagePage.addTrigger(code);
        Thread.sleep(200);
        messagePage.clickSave();
        messagePage.clickCancel();
    }
    @When("business request a payment code")
    public void businessRequestPaymentCode() throws IOException, InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        messagePage = PageFactory.initElements(driver, MessagePage.class);
        homePage.openNewMessagePage();
        messagePage.addTransport(config.getTransport(12));
        messagePage.addContact(config.getContact(12));
        messagePage.addTrigger(config.getTrigger(12));
        Thread.sleep(200);
        messagePage.clickSave();
        messagePage.clickCancel();
    }
    @When("person validate the code")
    public void personSendReceiveCode() throws IOException, InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        String code = homePage.getActualMessage();
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.openNewMessagePage();
        messagePage.addTransport(config.getTransport(13));
        messagePage.addContact(config.getContact(13));
        messagePage.addTrigger(code);
        Thread.sleep(200);
        messagePage.clickSave();
        messagePage.clickCancel();
    }
    @When("confirm that person tiko miles balance reduce by 10")
    public void checkPersonTikoMilesDecrease() throws IOException {
        Assert.assertTrue(test_request_cash_out.verifyMessage(config.getResponse(13)));
        // test_request_cash_out.close_browser();
    }
    @When("confirm that business tiko miles balance increase by 10")
    public void checkBusinessTikoMilesIncrease() throws IOException {
        Assert.assertTrue(test_request_cash_out.verifyMessage2(config.getResponse2(13)));
       // test_request_cash_out.close_browser();
    }
    @When("confirm the result")
    public void checkErrorMessage() throws IOException {
        Assert.assertTrue(test_request_cash_out.verifyMessage(config.getResponse(13)));
        // test_request_cash_out.close_browser();
    }
}
