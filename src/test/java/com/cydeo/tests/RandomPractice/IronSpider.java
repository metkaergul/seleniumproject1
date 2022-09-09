package com.cydeo.tests.RandomPractice;

import com.cydeo.tests.Utilities;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IronSpider {

    public WebDriver driver;
    // Step1 ---> Go to "https://www.ironspider.ca/index.htm"
    @BeforeMethod
    public void setUpMethod(){

        driver= Utilities.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Step1 ---> Go to "https://www.ironspider.ca/index.htm"
        driver.get("https://www.ironspider.ca/index.htm");
    }

    @Test
    public void buttonAndCheckboxes(){



    }
    // Step2 ---> Click Web Pages Forms button
    // Step3 ---> Click Checkboxes & Radio Buttons button
    // Step4 ---> Select all checkboxes
    // Step5 ---> Verify all checkboxes are clickable or not



}
