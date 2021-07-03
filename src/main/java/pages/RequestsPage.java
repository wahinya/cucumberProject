package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RequestsPage {
    WebDriver driver;
    public RequestsPage(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(xpath = "//*[@id=\"main-navbar-items\"]/ul[1]/li[5]/a")
    WebElement tikoMenu;
    @FindBy(xpath = "//*[@id=\"main-navbar-items\"]/ul[1]/li[5]/ul/li[14]/a")
    WebElement cashOutRequestLink;
    @FindBy(xpath = "/html/body/div/div[2]/div/div/div/a")
    WebElement downloadButton;

    public void navigateToCheckoutRequests(){
        tikoMenu.click();
        cashOutRequestLink.click();
    }
    public void clickDownloadButton(){
        downloadButton.click();
    }

}
