package com.cydeo.tests.day5_Dropdowns_testNg;

import com.cydeo.tests.Utility.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task5_StateDropdown {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){

        WebDriverManager.chromedriver().setup();
        driver = Utilities.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown ");

    }
    @Test
    public void StateDropdown(){

        Select statesDropdown= new Select(driver.findElement(By.xpath("//select[@id='state']")));
        statesDropdown.selectByVisibleText("Illinois");
        statesDropdown.selectByValue("VA");
        statesDropdown.selectByIndex(5);

        WebElement currentSelectedOption = statesDropdown.getFirstSelectedOption();
              String currentOptiontext=  currentSelectedOption.getText();
        Assert.assertEquals(currentOptiontext,"California");

    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
/*
TC #5: Selecting state from State dropdown and verifying result
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select Illinois
4. Select Virginia
5. Select California
6. Verify final selected option is California.
Use all Select options. (visible text, value, index) */