package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver= driver;
    }

    //message page locators
    @FindBy(xpath = "//*[@id=\"main-navbar-items\"]/ul[1]/li[2]/a")
    WebElement messagesLink;
    @FindBy(xpath = "/html/body/div/div[2]/div/div/div/a")
    WebElement newMessage;
    @FindBy(xpath = "/html/body/div/div[3]/table/tbody/tr[1]/td[2]")
    WebElement messageValue;
    @FindBy(xpath = "/html/body/div/div[3]/table/tbody/tr[2]/td[2]")
    WebElement messageValue2;

    //transaction page locators
    @FindBy(xpath = "//*[@id=\"main-navbar-items\"]/ul[1]/li[5]/a")
    WebElement tikoLink;
    @FindBy(xpath = "//*[@id=\"main-navbar-items\"]/ul[1]/li[5]/ul/li[6]/a")
    WebElement transactionLink;
    @FindBy(xpath = "/html/body/div/div[3]/a[1]")
    WebElement newTransaction;

    public void openNewMessagePage(){
      messagesLink.click();
      newMessage.click();
      MessagePage messagePage = new MessagePage(driver);
    }
    public void openNewTransactionPage(){
        tikoLink.click();
        transactionLink.click();
        newTransaction.click();
        TransactionPage transactionPage = new TransactionPage(driver);
    }

    public String getActualMessage(){
        return messageValue.getText();
    }

    public String getActualMessage2(){
        return messageValue2.getText();
    }



}
