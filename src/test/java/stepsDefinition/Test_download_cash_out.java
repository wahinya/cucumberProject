package stepsDefinition;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import pages.RequestsPage;
public class Test_download_cash_out extends BaseTest{
    RequestsPage requestsPage = null;
    @Then("Access the cash_out requests page")
    public void access_the_cash_out_requests_page() {
        requestsPage = PageFactory.initElements(driver, RequestsPage.class);
        requestsPage.navigateToCheckoutRequests();
    }
    @Then("Download a csv file")
    public void download_a_csv_file() {
        requestsPage = PageFactory.initElements(driver, RequestsPage.class);
        requestsPage.clickDownloadButton();
    }
}
