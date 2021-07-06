package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TransactionPage {
    WebDriver driver;

    public TransactionPage(WebDriver driver) {
    }

    // new transaction page locators
    @FindBy(xpath = "//*[@id=\"type\"]")
    WebElement selectType;

    @FindBy(xpath = "//*[@id=\"type\"]/option[1]")
    WebElement selectTransfer;

    @FindBy(xpath = "//*[@id=\"type\"]/option[2]")
    WebElement selectDeposit;

    @FindBy(xpath = "//*[@id=\"origin_label\"]")
    WebElement origin;

    @FindBy(xpath = "//*[@id=\"destination_label\"]")
    WebElement destination;


    List<WebElement> search = driver.findElements(By.linkText("maximo"));

    public void addSearchOrigin(String searchText){
        origin.sendKeys(searchText);
    }
    public void clickFirstResult() {
        if(!search.isEmpty())
        {
        search.get(0).click();
        }
}



}
