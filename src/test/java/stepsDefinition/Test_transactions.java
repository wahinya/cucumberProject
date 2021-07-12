package stepsDefinition;

import configs.ConfigJsonData;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.MessagePage;

import java.io.IOException;

public class Test_transactions extends BaseTest{
    HomePage homePage = null;
    MessagePage messagePage = null;
    ConfigJsonData config = new ConfigJsonData();

    @When("Rafiki request a payment code")
    public void requestPaymentCode() throws IOException, InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.openNewMessagePage();
        messagePage.addTransport(config.getTransport(4));
        messagePage.addContact(config.getContact(4));
        messagePage.addTrigger(config.getTrigger(4));
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
        messagePage.addTrigger(config.getTrigger(5)+" " +code);
        messagePage.clickSave();
        messagePage.clickCancel();
    }
    @When("Confirm that Rafiki balance reduce")
    public void checkTikoDecrease() {
    }
    @When("Confirm that retailer balance increase")
    public void checkTikoIncrease() {
    }
}
