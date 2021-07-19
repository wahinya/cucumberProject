package stepsDefinition;

import configs.ConfigJsonData;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.HomePage;
import pages.MessagePage;

import java.io.IOException;

public class Test_refferal extends BaseTest{
    HomePage homePage = null;
    MessagePage messagePage = null;
    ConfigJsonData config = new ConfigJsonData();
    Test_request_cash_out test_request_cash_out = new Test_request_cash_out();

    @Then("Mobilizer request a referral code")
    public void mobilizer_request_a_referral_code() throws IOException, InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        messagePage = PageFactory.initElements(driver, MessagePage.class);
        homePage.openNewMessagePage();
        messagePage.addTransport(config.getTransport(10));
        messagePage.addContact(config.getContact(10));
        messagePage.addTrigger(config.getTrigger(10));
        Thread.sleep(200);
        messagePage.clickSave();
        messagePage.clickCancel();

    }
    @Then("Rafiki validate referral the code")
    public void rafiki_validate_referral_the_code() throws IOException, InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        String code = homePage.getActualMessage();
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.openNewMessagePage();
        messagePage.addTransport(config.getTransport(11));
        messagePage.addContact(config.getContact(11));
        messagePage.addTrigger(code);
        Thread.sleep(200);
        messagePage.clickSave();
        messagePage.clickCancel();
    }

    @Then("Rafiki success is verified")
    public void rafiki_success_is_verified() throws IOException {
        Assert.assertTrue(test_request_cash_out.verifyMessage(config.getResponse(11)));
    }
    @Then("Mobilizer success is verified")
    public void mobilizer_success_is_verified() throws IOException {
        Assert.assertTrue(test_request_cash_out.verifyMessage2(config.getResponse2(11)));
    }

}
