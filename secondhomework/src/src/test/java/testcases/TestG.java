package src.test.java.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestG {
    private WebDriver driver;
    private int count = 0;
    
    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://commentssprintone.azurewebsites.net/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        createCommands();
    }

    @Test
    public void testFunctionGropingByActiveStatus() {
        //Assert
        WebElement applyButton = driver.findElement(By.id("applybutton"));
        Select selectStatus = new Select(driver.findElement(By.id("SelectedStatus")));
        selectStatus.selectByVisibleText("Active");
        applyButton.click();
        List<WebElement> table = driver.findElements(By.cssSelector("table > tbody > tr"));
        
        //Act
        for (WebElement element : table){
            WebElement actual = element.findElement(By.className("inactivecolumn"));
            if (!actual.getText().equals("")){
                count++;
            }
        }
        
        //Assert
        Assert.assertEquals(count, 0);
    }
    
    @Test
    public void testFunctionGropingByInactiveStatus() {
        //Assert
        WebElement applyButton = driver.findElement(By.id("applybutton"));
        Select selectStatus = new Select(driver.findElement(By.id("SelectedStatus")));
        selectStatus.selectByVisibleText("Inactive");
        applyButton.click();
        List<WebElement> table = driver.findElements(By.cssSelector("table > tbody > tr"));
        
        //Act
        for (WebElement element : table){
            WebElement actual = element.findElement(By.className("inactivecolumn"));
            if (!actual.getText().equals("V")){
                count++;
            }
        }
        
        //Assert
        Assert.assertEquals(count, 0);
    }
    
    @Test
    public void testSortingByCategoryNameCat0(){
        //Assert
        WebElement applyButton = driver.findElement(By.id("applybutton"));
        Select selectStatus = new Select(driver.findElement(By.id("SelectedCateg")));
        selectStatus.selectByVisibleText("Cat0");
        applyButton.click();
        List<WebElement> table = driver.findElements(By.cssSelector("table > tbody > tr"));

        //Act
        for (WebElement element : table){
            WebElement actual = element.findElement(By.className("categorycolumn"));
            if (!actual.getText().contains("Cat0")){
                count++;
            }
        }

        //Assert
        Assert.assertEquals(count, 0);
    }
    
    @Test
    public void testSortingByCategoryNameCat1(){
        //Assert
        WebElement applyButton = driver.findElement(By.id("applybutton"));
        Select selectStatus = new Select(driver.findElement(By.id("SelectedCateg")));
        selectStatus.selectByVisibleText("Cat1");
        applyButton.click();
        List<WebElement> table = driver.findElements(By.cssSelector("table > tbody > tr"));
        
        //Act
        for (WebElement element : table){
            WebElement actual = element.findElement(By.className("categorycolumn"));
            if (!actual.getText().contains("Cat1")){
                count++;
            }
        }
        
        //Assert
        Assert.assertEquals(count, 0);
    }
    
    @Test
    public void testSortingByCategoryNameCat5(){
        //Assert
        WebElement applyButton = driver.findElement(By.id("applybutton"));
        Select selectStatus = new Select(driver.findElement(By.id("SelectedCateg")));
        selectStatus.selectByVisibleText("Cat5");
        applyButton.click();
        List<WebElement> table = driver.findElements(By.cssSelector("table > tbody > tr"));
        
        //Act
        for (WebElement element : table){
            WebElement actual = element.findElement(By.className("categorycolumn"));
            if (!actual.getText().contains("Cat5")){
                count++;
            }
        }
        
        //Assert
        Assert.assertEquals(count, 0);
    }

    @BeforeMethod
    public void resresh() throws InterruptedException {
        driver.get("http://commentssprintone.azurewebsites.net/");
        count = 0;
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }
    
    private void createCommands(){
        WebElement newButton = driver.findElement(By.className("buttonAsLink"));
        newButton.click();
        
        WebElement commentText = driver.findElement(By.id("Text"));
        commentText.click();
        commentText.sendKeys("test");
        
        WebElement number = driver.findElement(By.id("Number"));
        number.click();
        number.sendKeys("123");
        
        WebElement checkBox = driver.findElement(By.cssSelector("#alvailablecategories " +
                "input[value='6']"));
        checkBox.click();
        
        driver.findElement(By.name("CurSelect")).click();
        driver.findElement(By.cssSelector("input[value='Save & Return']")).click();
    }
}
