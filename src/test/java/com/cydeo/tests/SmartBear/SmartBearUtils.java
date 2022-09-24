package com.cydeo.tests.SmartBear;

import com.cydeo.tests.Utility.DriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartBearUtils {


    public static void  loginToSmartBear(WebDriver driver){

        DriverUtility.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx ");

        WebElement userName = DriverUtility.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester"+ Keys.ENTER);


        WebElement password = DriverUtility.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        password.sendKeys("test"+ Keys.ENTER);


        }

    }



/*Mini-Task: CREATE A CLASS à SmartBearUtils
• Create a method called loginToSmartBear
• This method simply logs in to SmartBear when you call it.
• Accepts WebDriver type as parameter */