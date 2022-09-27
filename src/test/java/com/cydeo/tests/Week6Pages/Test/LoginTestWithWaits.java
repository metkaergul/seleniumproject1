package com.cydeo.tests.Week6Pages.Test;

import com.cydeo.tests.Utility.DriverUtility;
import com.cydeo.tests.Week6Pages.LogInPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestWithWaits {

    LogInPage logInPage;

    @BeforeMethod
    public void setUpMethod() {
        DriverUtility.getDriver().get("https://practice.cydeo.com/dynamic_loading/3");
        logInPage = new LogInPage();

    }
    @AfterMethod
    public void tearDown(){

        DriverUtility.closeDriver();
    }

    @Test
    public void test1(){

        WebDriverWait wait=new WebDriverWait(DriverUtility.getDriver(),10);

        wait.until(ExpectedConditions.invisibilityOf(logInPage.loading));
        String username="tomsmith";
        String password="SuperSecretPassword";

        logInPage.loginMethod(username,password);






    }
}
