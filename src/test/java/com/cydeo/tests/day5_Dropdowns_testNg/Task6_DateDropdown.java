package com.cydeo.tests.day5_Dropdowns_testNg;

import com.cydeo.tests.Utility.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task6_DateDropdown {

    WebDriver driver;


    @BeforeClass
    public void setupMethod(){

        WebDriverManager.chromedriver().setup();
        driver = Utilities.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown ");

    }
    @Test
    public void yearDropdown(){

        Select yearDropdown= new Select(driver.findElement(By.xpath("//select[@id='year']")));
        yearDropdown.selectByVisibleText("1923");
        String expectedYearText= "1923";
        String actualYearText=yearDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedYearText,actualYearText);

    }
    @Test
    public void monthDropdown(){

        Select monthDropdown= new Select(driver.findElement(By.xpath("//select[@id='month']")));
        monthDropdown.selectByValue("11");
        String expectedMonthText= "December";
        String actualMonthText=monthDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedMonthText,actualMonthText);

    }
    @Test
    public void dayDropdown(){

        Select dayDropdown= new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dayDropdown.selectByIndex(0);
        String expectedDayText= "1";
        String actualDayText=dayDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedDayText,actualDayText);

    }
    @AfterClass
    public void tearDown(){
        driver.close();
    }

}
/*
TC #6: Selecting date on dropdown and verifying
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select “December 1st, 1923” and verify it is selected.
Select year using  : visible text
Select month using   : value attribute
Select day using : index number  */