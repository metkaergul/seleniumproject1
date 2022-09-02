package com.cydeo.tests.day5_Dropdowns_testNg;

import com.cydeo.tests.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task8_MultipleSelectDropdown {

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
    public void MultipleSelectDropdown(){

       Select multipleLanguagesDropdown= new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

        List<WebElement> allLanguageOptions = multipleLanguagesDropdown.getOptions();
        for (WebElement eachOptions : allLanguageOptions) {
            eachOptions.click();
            System.out.println(eachOptions.getText());
        }

        multipleLanguagesDropdown.deselectAll();


    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
/*
TC #8: Selecting value from multiple select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select all the options from multiple select dropdown.
4. Print out all selected values.
5. Deselect all values.
  */