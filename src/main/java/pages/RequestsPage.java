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

    @FindBy(xpath = "//*[@id=\"all_cashout_requests_listed\"]")
    WebElement allRequestCheckBox;
    @FindBy(xpath = "//*[@id=\"cashout_requests_buttons\"]/input")
    WebElement approveButton;

    public void navigateToCheckoutRequests(){
        tikoMenu.click();
        cashOutRequestLink.click();
    }
    public void clickDownloadButton(){
        downloadButton.click();
    }

    public void approveMultiple() throws InterruptedException {
    allRequestCheckBox.click();
        Thread.sleep(200);
    approveButton.click();
    }
}
