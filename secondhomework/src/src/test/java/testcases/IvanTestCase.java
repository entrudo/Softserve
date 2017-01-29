package src.test.java.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IvanTestCase extends BaseTestClase {

    @Test
    public void testFunctionGropingByActiveStatus() {
        //Assert
        Select selectStatus = new Select(driver.findElement(By.id("SelectedStatus")));
        selectStatus.selectByVisibleText("Active");
        new ApplyButton(driver).clickOnApplyButton();
        
        //Act
        Boolean result = new FindDublicateInTable("inactivecolumn", "", driver)
                .findEqualsValueInTable();
        
        //Assert
        Assert.assertFalse(result);
    }
    
    @Test
    public void testFunctionGropingByInactiveStatus() {
        //Assert
        Select selectStatus = new Select(driver.findElement(By.id("SelectedStatus")));
        selectStatus.selectByVisibleText("Inactive");
        new ApplyButton(driver).clickOnApplyButton();
        
        //Act
        Boolean result = new FindDublicateInTable("inactivecolumn", "V", driver)
                .findEqualsValueInTable();
        
        //Assert
        Assert.assertFalse(result);
    }
    
    @Test
    public void testSortingByCategoryNameCat0(){
        //Assert
        Select selectStatus = new Select(driver.findElement(By.id("SelectedCateg")));
        selectStatus.selectByVisibleText("Cat0");
        new ApplyButton(driver).clickOnApplyButton();

        //Act
        Boolean result = new FindDublicateInTable("categorycolumn", "Cat0", driver)
                .findContainsValueInTable();

        //Assert
        Assert.assertFalse(result);
    }
    
    @Test
    public void testSortingByCategoryNameCat1(){
        //Assert
        Select selectStatus = new Select(driver.findElement(By.id("SelectedCateg")));
        selectStatus.selectByVisibleText("Cat1");
        new ApplyButton(driver).clickOnApplyButton();
        
        //Act
        Boolean result = new FindDublicateInTable("categorycolumn", "Cat1", driver)
                .findContainsValueInTable();
        
        //Assert
        Assert.assertFalse(result);
    }
    
    @Test
    public void testSortingByCategoryNameCat5(){
        //Assert
        Select selectStatus = new Select(driver.findElement(By.id("SelectedCateg")));
        selectStatus.selectByVisibleText("Cat5");
        new ApplyButton(driver).clickOnApplyButton();
        
        //Act
        Boolean result = new FindDublicateInTable("categorycolumn", "Cat5", driver)
                .findContainsValueInTable();
        
        //Assert
        Assert.assertFalse(result);
    }
}
