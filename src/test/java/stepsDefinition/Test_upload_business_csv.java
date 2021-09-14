package stepsDefinition;

import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import pages.BusinessCSVUploadPage;

public class Test_upload_business_csv extends BaseTest {
    String url = "/Users/duncan/IdeaProjects/movercado-frontend-tests/resource/valid_csv.csv";
    String url2 = "/Users/duncan/IdeaProjects/movercado-frontend-tests/resource/invalid_csv.csv";
    String url3 = "/Users/duncan/IdeaProjects/movercado-frontend-tests/resource/csv_whitespace_businessType.csv";
    BusinessCSVUploadPage businessCSVUploadPage = null;

    @Then("Access the business csv upload page")
    public void access_the_business_csv_upload_page() throws InterruptedException {
    businessCSVUploadPage=PageFactory.initElements(driver,BusinessCSVUploadPage.class);
    businessCSVUploadPage.navigateToUploadPage();
    Thread.sleep(500);
    businessCSVUploadPage.fetchCSVToUpload(url);
    Thread.sleep(500);

    }
    @Then("Access the invalid business csv upload page")
    public void access_the_invalid_business_csv_upload_page() throws InterruptedException {
        businessCSVUploadPage=PageFactory.initElements(driver,BusinessCSVUploadPage.class);
        businessCSVUploadPage.navigateToUploadPage();
        Thread.sleep(500);
        businessCSVUploadPage.fetchCSVToUpload(url2);
        Thread.sleep(500);

    }
    @Then("Access the business csv with white spaced business type upload page")
    public void access_the_whiteSpaced_businessType_csv_upload_page() throws InterruptedException {
        businessCSVUploadPage=PageFactory.initElements(driver,BusinessCSVUploadPage.class);
        businessCSVUploadPage.navigateToUploadPage();
        Thread.sleep(500);
        businessCSVUploadPage.fetchCSVToUpload(url3);
        Thread.sleep(500);

    }

    @Then("upload a csv file")
    public void upload_a_csv_file() {
    businessCSVUploadPage.saveUploadedCSV();
    }
}