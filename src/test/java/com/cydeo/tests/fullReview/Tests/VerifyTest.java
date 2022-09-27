package com.cydeo.tests.fullReview.Tests;

import com.cydeo.tests.Utility.DriverUtility;
import com.cydeo.tests.fullReview.Pages.RegistrationPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class VerifyTest {

    WebDriver driver;
    RegistrationPage registrationPage;

    @BeforeMethod
    public void setUpMethod() {

        driver = DriverUtility.getDriver();

        driver.get("https://practice.cydeo.com/registration_form");
    }
    @AfterMethod
    public void tearDown(){
        DriverUtility.closeDriver();
    }

//    @Test
//    public void registration_Test() {
//
//
//
//
//        Actions actions = new Actions(driver);
//
//        actions.moveToElement(registrationPage.cydeoLink);
//
//
//    }

    @Test
    public void navigation_test(){
        registrationPage=new RegistrationPage();
        registrationPage.homeLink.click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().refresh();

        Assert.assertEquals(driver.getCurrentUrl(),"https://practice.cydeo.com/registration_form");


    }
    @Test
    public void validateTest(){

//        driver.get("https://practice.cydeo.com/registration_form");

        JavascriptExecutor js= (JavascriptExecutor) DriverUtility.getDriver();

        js.executeScript("window.scrollBy(0,500)");

        registrationPage=new RegistrationPage();

        Assert.assertEquals(driver.getTitle(),"Registration Form");
        Assert.assertTrue(registrationPage.homeLink.isDisplayed());


    }
    @Test
    public void test3(){

        registrationPage=new RegistrationPage();
        List<WebElement> genderRadioButtons = registrationPage.genderRadioButtons;
       Assert.assertTrue(genderRadioButtons.size()==3);

        Select select=new Select(registrationPage.departmentDropdown);
        List<String>allOptionsTexts=new ArrayList<>();
        List<WebElement> allDepartmens = select.getOptions();
                    for(WebElement eachOptions:allDepartmens){
                        allOptionsTexts.add(eachOptions.getText());

                    }






    }




}
