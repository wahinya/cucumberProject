package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessagePage {
    private WebDriver driver;

    public MessagePage(WebDriver driver) {
        this.driver= driver;
    }

    // Message page locators

    @FindBy(xpath = "//*[@id=\"transport\"]")
    WebElement transportField;

    @FindBy(xpath = "//*[@id=\"contact\"]")
    WebElement contactField;

    @FindBy(xpath = "//*[@id=\"text\"]")
    WebElement textField;

    @FindBy(xpath = "/html/body/div/form/input[3]")
    WebElement saveButton;
    @FindBy(xpath = "/html/body/div/form/a")
    WebElement cancelButton;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]")
    WebElement message;

    @FindBy(xpath = "/html/body/div/div[3]/table/tbody/tr[1]/td[2]")
    WebElement message2;


    // Locator methods
    public void addTransport(String transport) throws InterruptedException {
        transportField.sendKeys(transport);
    }
    public void addContact(String contact){
        contactField.sendKeys(contact);
    }
    public void addTrigger(String trigger){
        textField.sendKeys(trigger);
    }
    public void clickSave(){
        saveButton.click();
    }
    public void clickCancel(){
        cancelButton.click();
    }
    public String getMessage(){
        return message.getText();
    }
    public String getMessage2(){
        return message2.getText();
    }


}
