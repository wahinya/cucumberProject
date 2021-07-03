package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver= driver;
    }
    @FindBy(xpath = "//*[@id=\"main-navbar-items\"]/ul[1]/li[2]/a")
    WebElement messagesLink;

    @FindBy(xpath = "/html/body/div/div[2]/div/div/div/a")
    WebElement newMessage;

    @FindBy(xpath = "//*[@id=\"filter_message\"]")
    WebElement messageSearchBox;

    @FindBy(xpath = "//*[@id=\"message_search\"]/div[2]/div[3]/div/button")
    WebElement searchButton;

    @FindBy(xpath = "/html/body/div/div[3]/table/tbody/tr[1]/td[2]")
    WebElement messageValue;

    public void clickMessageLink(){
      messagesLink.click();
      newMessage.click();
      MessagePage messagePage = new MessagePage(driver);
    }
//    public void addSearchText(String message){
//        messageSearchBox.sendKeys(message);
//    }
//    public void clickSearchButton(){
//        searchButton.click();
//    }
    public String getActualMessage(){
        return messageValue.getText();
    }

}
