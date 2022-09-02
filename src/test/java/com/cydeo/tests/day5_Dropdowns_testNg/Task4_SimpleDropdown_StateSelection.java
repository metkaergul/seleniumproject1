package com.cydeo.tests.day5_Dropdowns_testNg;

import com.cydeo.tests.Utilities;
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

public class Task4_SimpleDropdown_StateSelection {
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
    public  void SimpledropDown(){
        //  Verify “Simple dropdown” default selected value is correct
        //  Expected: “Please select an option”
        //in order to locate dropdown we need to create object from select class and put our web element into the select object
        //constructor
        Select simpleDropdown=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement firstSelectedOption = simpleDropdown.getFirstSelectedOption();

        String expectedFirstSelectedOption="Please select an option";
        String actualFirstSelectedOption=firstSelectedOption.getText();
        Assert.assertEquals(expectedFirstSelectedOption,actualFirstSelectedOption);
    }

    @Test
    public void StateDropdown(){
        // Verify “State selection” default selected value is correct
        //Expected: “Select a State”

        Select stateDropdown= new Select(driver.findElement(By.xpath("//select[@id='state']")));

        WebElement stateDropdownFirstSelectedOption = stateDropdown.getFirstSelectedOption();
        String expectedFirstStateDropdownValue="Select a State";
        String actualFirstStateDropdownValue=stateDropdownFirstSelectedOption.getText();
        Assert.assertEquals(expectedFirstStateDropdownValue,actualFirstStateDropdownValue);


    }
    @AfterMethod
    public void tearDown(){

        driver.close();
    }


}
/*
TC#4: Verifying “Simple dropdown” and “State selection” dropdown
default values
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a State”

 */