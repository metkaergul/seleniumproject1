package com.cydeo.pages;

import com.cydeo.tests.Utility.DriverUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetLoginPage {



    public FleetLoginPage() {
        PageFactory.initElements(DriverUtility.getDriver(),this);
    }


    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement usernameInputBox;


    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordInputBox;

    @FindBy(css = "input#remember_me")
    public WebElement rememberMeCheckBox;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotYourPasswordLink;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;






}
