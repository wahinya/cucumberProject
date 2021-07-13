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

    @When("Rafiki request a payment code")
    public void requestPaymentCode() throws IOException, InterruptedException {
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
    @When("Retailer validate the code")
    public void sendReceiveCode() throws IOException, InterruptedException {
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
    @When("Confirm that Rafiki balance reduce")
    public void checkTikoDecrease() throws IOException {
        Assert.assertTrue(test_request_cash_out.verifyMessage(config.getResponse(4)));
        test_request_cash_out.close_browser();
    }
//    @When("Confirm that retailer balance increase")
//    public void checkTikoIncrease() throws IOException {
//        Assert.assertTrue(test_request_cash_out.verifyMessage(config.getResponse2(4)));
//        test_request_cash_out.close_browser();
//    }
}
