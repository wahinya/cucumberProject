package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver= driver;
    }

    // page locator

    @FindBy(xpath = "//*[@id=\"zocial-google\"]")
    WebElement googleLink;

    @FindBy(xpath = "//*[@id=\"identifierId\"]")
    WebElement emailField;

    @FindBy(xpath = "//*[@id=\"identifierNext\"]")
    WebElement nextButton;

    @FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"passwordNext\"]")
    WebElement signButton;

    public void clickLoginLink(){
       googleLink.click();
    }
    public void addEmail(String email) throws InterruptedException {
       emailField.sendKeys(email);
       Thread.sleep(1000);
       nextButton.click();
    }

    public void addPassword(String password){
        passwordField.sendKeys(password);
        signButton.click();
        HomePage homePage = new HomePage(driver);
    }
}
