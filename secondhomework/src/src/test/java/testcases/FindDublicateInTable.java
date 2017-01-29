package src.test.java.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class FindDublicateInTable {
    private String className;
    private String desiredValue;
    private WebDriver driver;
    private int count = 0;
    
    public FindDublicateInTable(String className, String desiredValue, WebDriver driver) {
        this.className = className;
        this.desiredValue = desiredValue;
        this.driver = driver;
    }
    
    public Boolean findContainsValueInTable(){
        List<WebElement> table = driver.findElements(By.cssSelector("table > tbody > tr"));
        for (WebElement element : table){
            WebElement actual = element.findElement(By.className(className));
            if (!actual.getText().equals(desiredValue)){
                count++;
            }
        }
        return count > 0;
    }
    
    public Boolean findEqualsValueInTable(){
        List<WebElement> table = driver.findElements(By.cssSelector("table > tbody > tr"));
        for (WebElement element : table){
            WebElement actual = element.findElement(By.className(className));
            if (!actual.getText().equals(desiredValue)){
                count++;
            }
        }
        return count > 0;
    }
}
