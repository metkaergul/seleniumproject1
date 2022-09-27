package com.cydeo.tests.Week6Pages;

import com.cydeo.tests.Utility.DriverUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {


    public LogInPage() {

        PageFactory.initElements(DriverUtility.getDriver(), this);
    }

    @FindBy(name="username")
    public WebElement userNameInputBox;

    @FindBy(name="password")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='flash success']")
    public WebElement successMessage;

    @FindBy(xpath = "//div[@id='loading']")
    public WebElement loading;


    public void loginMethod(String username,String password){

        userNameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        loginButton.click();


    }



}
