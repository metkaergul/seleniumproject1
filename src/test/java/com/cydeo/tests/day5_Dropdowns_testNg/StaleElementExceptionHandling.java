package com.cydeo.tests.day5_Dropdowns_testNg;

import com.cydeo.tests.Utility.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class StaleElementExceptionHandling {


    WebDriver driver;
@BeforeMethod
    public void setUpMethod(){
        WebDriverManager.chromedriver().setup();
     driver = Utilities.getDriver("chrome");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    // Go to https://practice.cydeo.com/add_remove_elements/
    driver.get("https://practice.cydeo.com/add_remove_elements/");

}
@Test
    public void StaleElementReferenceException(){

   // Click to “Add Element” button
    WebElement addElementButton = driver.findElement(By.xpath("//div[@class='example']/button"));
    addElementButton.click();
    WebElement deleteButton = driver.findElement(By.xpath("//div[@id='elements']/button"));
    // Verify “Delete” button is displayed after clicking.
    System.out.println("after clicking add button delete Button isDisplayed: = " + deleteButton.isDisplayed());
    deleteButton.click();
    //after clicking delete button ,delete button element is not attached to the page anymore so we can not use
    //previous reference name to the check if it is displayed or not after clicking delete button
   // If WebDriver throws a stale element exception in this case, even though the element still exists, the reference is lost. You should discard the current reference you hold and replace it

    //After clicking delete button verify if delete button is displayed or not
    try{
        System.out.println(" after clicking delete button deleteButton isDisplayed = " + deleteButton.isDisplayed());
    }catch(StaleElementReferenceException e){
        System.out.println("state elemnt exception is thrown");
        System.out.println("it means the web elements is completely deleted from the page");
        System.out.println("after clicking delete button deleteButton.isDisplayed() = false");
    }





}
@AfterMethod
    public void tearDown(){
    driver.close();

}


}
/*TC #1: StaleElementReferenceException handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/add_remove_elements/
3. Click to “Add Element” button
4. Verify “Delete” button is displayed after clicking.
5. Click to “Delete” button.
6. Verify “Delete” button is NOT displayed after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS */