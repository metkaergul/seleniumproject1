package com.cydeo.tests.fullReview.Tests;

import com.cydeo.tests.Utility.DriverUtility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionTest {
    Actions action;
    WebDriver driver;
    @BeforeMethod
    public void setUp(){

       driver=DriverUtility.getDriver();

    }
//    @AfterMethod
//    public void tearDown(){
//        DriverUtility.closeDriver();
//    }



    @Test
    public void hover(){

    driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
       action=new Actions(driver);
        WebElement hover=driver.findElement(By.xpath("//button[.='Sub Menu [Hover On Me]']"));
        action.moveToElement(hover).perform();
        System.out.println(driver.findElement(By.id("link1")).getText());

    }

    @Test
    public void double_click_test(){

        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        action=new Actions(driver);
        action.doubleClick(driver.findElement(By.xpath("//input[@value='Double Click Me']"))).perform();

        Alert alert=driver.switchTo().alert();
        alert.accept();


    }
}
