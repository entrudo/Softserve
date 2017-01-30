package src.test.java.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApplyButton {
    private WebElement applyButton;
    private WebDriver driver;

    public ApplyButton(WebDriver driver) {
        this.driver = driver;
        applyButton = driver.findElement(By.id("applybutton"));
    }
    
    public void clickOnApplyButton(){
        applyButton.click();
    }
}
