package stepsDefinition;

import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import pages.BusinessCSVUploadPage;

public class Test_upload_business_csv extends BaseTest {
    String url = "/Users/duncan/IdeaProjects/movercado-frontend-tests/resource/business.csv";
    BusinessCSVUploadPage businessCSVUploadPage = null;

    @Then("Access the business csv upload page")
    public void access_the_business_csv_upload_page() throws InterruptedException {
    businessCSVUploadPage=PageFactory.initElements(driver,BusinessCSVUploadPage.class);
    businessCSVUploadPage.navigateToUploadPage();
    Thread.sleep(500);
    businessCSVUploadPage.fetchCSVToUpload(url);
    Thread.sleep(500);

    }

    @Then("upload a csv file")
    public void upload_a_csv_file() {
    businessCSVUploadPage.saveUploadedCSV();
    }
}
