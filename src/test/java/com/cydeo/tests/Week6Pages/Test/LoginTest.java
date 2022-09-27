package com.cydeo.tests.Week6Pages.Test;

import com.cydeo.tests.Utility.DriverUtility;
import com.cydeo.tests.Week6Pages.LogInPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;
    LogInPage logInPage;


    @BeforeMethod
    public void setUpMethod() {
        driver = DriverUtility.getDriver();

        logInPage = new LogInPage();
    }

    @Test
    public void happyTest() {
        driver.get("https://practice.cydeo.com/login");
        String username = "tomsmith";
        String password = "SuperSecretPassword";
        logInPage.userNameInputBox.sendKeys("tomsmith");
        logInPage.passwordInputBox.sendKeys("SuperSecretPassword");
        logInPage.loginButton.click();
//        String expectedMessage="You logged into a secure area!";
//        Assert.assertEquals(logInPage.successMessage.getText(),expectedMessage);
//
    }

    @Test
    public void negativeTest() {
        driver.get("https://practice.cydeo.com/login");
        String username = "wrong";
        String password = "SuperSecretPass";
        logInPage.userNameInputBox.sendKeys(username);
        logInPage.passwordInputBox.sendKeys(password);
        logInPage.loginButton.click();
        String expectedMessage = "Your username is invalid!";
        Assert.assertEquals(logInPage.successMessage.getText(), expectedMessage);


    }
}