package src.test.java.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTestClase {
    WebDriver driver;
    String addressOfSite = "http://commentssprintone.azurewebsites.net/";
    
    @BeforeTest
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(addressOfSite);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        new CreateNewComments(driver, "Test", 123, 6);
        new CreateNewComments(driver, "Test2", 124, 6);
    }
    
    @BeforeMethod
    public void resreshPage() {
        driver.get(addressOfSite);
    }
    
    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
