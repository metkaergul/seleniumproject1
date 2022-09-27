package com.cydeo.base;

import com.cydeo.tests.Utility.DriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {


   public  WebDriver driver;
    @BeforeMethod
    public void setupMethod(){

        WebDriverManager.chromedriver().setup();
        driver = DriverUtility.getDriver();

    }
    @AfterMethod
    public void tearDown(){
        DriverUtility.closeDriver();

    }

}
