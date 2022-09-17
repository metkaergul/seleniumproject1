package com.cydeo.tests.day5_Dropdowns_testNg;

import com.cydeo.tests.Utility.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RadioButtonHandling {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){

        WebDriverManager.chromedriver().setup();
        driver = Utilities.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

    }
    @Test
    public void RadioButton(){

        WebElement  hockeyButton =driver.findElement(By.xpath("//input[@id='hockey']"));

        hockeyButton.click();
        System.out.println("after clicking hockey button hockeyButton is Selected = " + hockeyButton.isSelected());


    }
    @AfterMethod
    public void tearDown(){

        driver.close();
    }


}

/*TC #2: Radiobutton handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS  */