package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessCSVUploadPage {
    WebDriver driver;
    public BusinessCSVUploadPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"main-navbar-items\"]/ul[1]/li[4]/a")
    WebElement actors;
    @FindBy(xpath = "//*[@id=\"main-navbar-items\"]/ul[1]/li[4]/ul/li[7]/a")
    WebElement businesses;
    @FindBy(xpath = "/html/body/div/div[3]/a[2]/span")
    WebElement uploadUpsert;

    @FindBy(xpath = "//*[@id=\"businesses_file\"]")
    WebElement  inputField;

    @FindBy(xpath = "/html/body/div/form/input[3]")
    WebElement uploadButton;


 public void navigateToUploadPage(){
     actors.click();
     businesses.click();
     uploadUpsert.click();
 }
 public void fetchCSVToUpload(String absolutePathOfFile){
     inputField.sendKeys(absolutePathOfFile);

 }
    public void saveUploadedCSV(){
        uploadButton.click();
    }

}
