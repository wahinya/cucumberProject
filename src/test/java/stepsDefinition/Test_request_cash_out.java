package stepsDefinition;
import configs.ConfigJsonData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.MessagePage;

import java.io.IOException;

public class Test_request_cash_out extends BaseTest {
    ConfigJsonData config = new ConfigJsonData();
    HomePage homePage = null;
    MessagePage messagePage = null;
    LoginPage loginPage = null;

    @Given("User launch browser or mobile app")
    public void user_launch_browser() {
        initializer();
    }

    @When("User logs into mvc with valid email and password")
    public void userLogsIntoMvcWithEmailAndPassword() throws InterruptedException, IOException {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickLoginLink();
        loginPage.addEmail(config.getUsername(0));
        loginPage.addPassword(config.getPassword(0));
    }
//    @Test
//    public void cashOUTRequests() throws InterruptedException, IOException {
//        homePage = PageFactory.initElements(driver, HomePage.class);
//        messagePage = PageFactory.initElements(driver, MessagePage.class);
//        homePage.openNewMessagePage();
//        int index = config.messages().length();
//
//        for (int i = 0; i < index; ++i) {
//            messagePage.addTransport(config.getTransport(i));
//            messagePage.addContact(config.getContact(i));
//            messagePage.addTrigger(config.getTrigger(i));
//            Thread.sleep(1000);
//            messagePage.clickSave();
//            messagePage.clickCancel();
//            Assert.assertTrue(verifyMessage(config.getResponse(i)));
//            homePage.openNewMessagePage();
//        }

    @When("Send a message with valid trigger and amount and validate")
    public void valid_trigger_amount() throws IOException, InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        messagePage = PageFactory.initElements(driver, MessagePage.class);
        homePage.openNewMessagePage();
        messagePage.addTransport(config.getTransport(0));
        messagePage.addContact(config.getContact(0));
        messagePage.addTrigger(config.getTrigger(0));
        messagePage.clickSave();
        messagePage.clickCancel();
        Assert.assertTrue(verifyMessage(config.getResponse(0)));
        close_browser();
    }
    @When("Send wrong trigger and confirm results")
    public void invalid_wrong_trigger() throws IOException, InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        messagePage = PageFactory.initElements(driver, MessagePage.class);
        homePage.openNewMessagePage();
        messagePage.addTransport(config.getTransport(1));
        messagePage.addContact(config.getContact(1));
        messagePage.addTrigger(config.getTrigger(1));
        messagePage.clickSave();
        messagePage.clickCancel();
        Assert.assertTrue(verifyMessage(config.getResponse(1)));
        close_browser();
    }
    @When("Send request with invalid cash out amount and confirm results")
    public void invalid_minimum_cash_out_amount_exceeded() throws IOException, InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        messagePage = PageFactory.initElements(driver, MessagePage.class);
        homePage.openNewMessagePage();
        messagePage.addTransport(config.getTransport(2));
        messagePage.addContact(config.getContact(2));
        messagePage.addTrigger(config.getTrigger(2));
        messagePage.clickSave();
        messagePage.clickCancel();
        Assert.assertTrue(verifyMessage(config.getResponse(2)));
        close_browser();
    }
    @When("Send request with invalid minimum amount after cash-out and confirm results")
    public void invalid_minimum_amount_after_cash_exceeded() throws IOException, InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        messagePage = PageFactory.initElements(driver, MessagePage.class);
        homePage.openNewMessagePage();
        messagePage.addTransport(config.getTransport(3));
        messagePage.addContact(config.getContact(3));
        messagePage.addTrigger(config.getTrigger(3));
        messagePage.clickSave();
        messagePage.clickCancel();
        Assert.assertTrue(verifyMessage(config.getResponse(3)));
        close_browser();
    }
    boolean verifyMessage(String message) {
        homePage = PageFactory.initElements(driver, HomePage.class);
        String actualMessage = homePage.getActualMessage();
        return actualMessage.equals(message);
    }
    boolean verifyMessage2(String message) {
        homePage = PageFactory.initElements(driver, HomePage.class);
        String actualMessage2 = homePage.getActualMessage2();
        return actualMessage2.equals(message);
    }

    void close_browser() {
        driver.quit();
    }
}