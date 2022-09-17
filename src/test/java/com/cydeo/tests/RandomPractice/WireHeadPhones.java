package com.cydeo.tests.RandomPractice;

import com.cydeo.tests.Utility.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WireHeadPhones {
    WebDriver driver;

    @BeforeMethod
    public void setUpmethod(){

        WebDriverManager.chromedriver().setup();
        driver= Utilities.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //-  Go to https://www.flipkart.com/
        driver.get("https://www.flipkart.com/");
    }

    @Test
    public void wireHeadphones(){


        WebElement handleFirstPopUp = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        handleFirstPopUp.click();

        Actions action=new Actions(driver);




    }

    //- Locate Wire Headphones (under Electronics Menu)


}
