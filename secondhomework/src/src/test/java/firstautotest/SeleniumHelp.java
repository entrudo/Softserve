package src.test.java.firstautotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumHelp {

    private WebDriver webDriver;

    public WebElement findById(String id){
        WebElement webElement = webDriver.findElement(By.id(id));
        return webElement;
    }

    public WebElement findByName(String name){
        WebElement webElement = webDriver.findElement(By.name(name));
        return webElement;
    }

    public WebElement findByCss(String css){
        WebElement webElement = webDriver.findElement(By.cssSelector(css));
        return webElement;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
