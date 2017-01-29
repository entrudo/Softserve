package src.test.java.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewComments {
    
    private WebDriver driver;
    private String nameOfComment;
    private int numberOfComment;
    private int numberOfCategory;
    
    public CreateNewComments(WebDriver driver, String nameOfComment, int numberOfComment, int
            numberOfCategory) {
        this.driver = driver;
        this.nameOfComment = nameOfComment;
        this.numberOfComment = numberOfComment;
        this.numberOfCategory = numberOfCategory;
        build();
    }
    
    private void build() {
        WebElement newButton = driver.findElement(By.className("buttonAsLink"));
        newButton.click();
    
        WebElement commentText = driver.findElement(By.id("Text"));
        commentText.click();
        commentText.sendKeys(nameOfComment);
    
        WebElement number = driver.findElement(By.id("Number"));
        number.click();
        number.sendKeys(Integer.toString(numberOfComment));
    
        WebElement checkBox = driver.findElement(By.cssSelector("#alvailablecategories " +
                "input[value='" + numberOfCategory + "']"));
        checkBox.click();
    
        driver.findElement(By.name("CurSelect")).click();
        driver.findElement(By.cssSelector("input[value='Save & Return']")).click();
    }
}
