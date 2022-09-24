package com.cydeo.tests.SmartBear;

import com.cydeo.tests.Utility.DriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SmartBearLinkVerification {


    @Test
    public void smartBear_Link_Verification(){

        DriverUtility.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx ");

        WebElement userName = DriverUtility.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester"+ Keys.ENTER);


        WebElement password = DriverUtility.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        password.sendKeys("test"+ Keys.ENTER);

        List<WebElement> allLinks=DriverUtility.getDriver().findElements(By.xpath("//a"));
        System.out.println("allLinks.size() = " + allLinks.size());
        int count=0;
        for (WebElement eachLink : allLinks) {
            count++;
            System.out.println(count  +". link text  = " + eachLink.getText());
        }
//
//            SmartBearUtils.loginToSmartBear(DriverUtility.getDriver());
    }




}
/*TC #1: Smartbear software link verification
1. Open browser
2. Go to website:
http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
3. Enter username: “Tester”
4. Enter password: “test”
5. Click to Login button
6. Print out count of all the links on landing page
7. Print out each link text on this page

Mini-Task: CREATE A CLASS à SmartBearUtils
• Create a method called loginToSmartBear
• This method simply logs in to SmartBear when you call it.
• Accepts WebDriver type as parameter */