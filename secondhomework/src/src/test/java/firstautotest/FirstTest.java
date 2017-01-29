package src.test.java.firstautotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FirstTest extends BaseClass {

    @Test
    public void openGoogleAndFindJava() {
        webDriver.get("https://google.com");
        WebElement searchElement = webDriver.findElement(By.name("q"));
        searchElement.sendKeys("Java");
        searchElement.submit();

        WebElement result = webDriver.findElement(By.className("r"));

        assertEquals(result.getText(), "Загрузить бесплатное программное обеспечение Java");
    }

    @Test
    public void findSoftServeInGoogleAndClickOnThisLink(){
        webDriver.get("https://google.com");
        WebElement webElement = webDriver.findElement(By.name("q"));
        webElement.sendKeys("SoftServe");
        webElement.submit();

        WebElement resultOfSearch = webDriver.findElement(By.cssSelector("h3 > a"));
        resultOfSearch.click();

        String result = webDriver.getTitle();
        assertEquals(result, "SoftServe | A Digital Services Company for Digital Transformation -" +
                " SoftServe");
    }
}
