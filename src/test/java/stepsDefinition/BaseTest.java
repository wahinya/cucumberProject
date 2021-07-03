package stepsDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest
{
    public static WebDriver driver = null;
    @BeforeClass
    public void initializer(){
        System.setProperty("webdriver.chrome.driver", "resource/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://maximo.movercado.org/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginPage loginPage = new LoginPage(driver);
    }
}
