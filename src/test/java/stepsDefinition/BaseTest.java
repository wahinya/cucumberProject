package stepsDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest
{
    public static WebDriver driver = null;
    public void initializer(){
        String uRL = System.getProperty("testUrl");
        System.setProperty("webdriver.chrome.driver", "resource/chromedriver");
        driver = new ChromeDriver();
        driver.get(uRL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginPage loginPage = new LoginPage(driver);
    }
}
