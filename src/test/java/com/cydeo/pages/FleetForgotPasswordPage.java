package com.cydeo.pages;

import com.cydeo.tests.Utility.DriverUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetForgotPasswordPage {


    public FleetForgotPasswordPage() {
        PageFactory.initElements(DriverUtility.getDriver(),this);
    }


    @FindBy(xpath = "//input[@placeholder='Username or Email']")
    public WebElement forgotPasswordInputBox;

    @FindBy(xpath = "//button[.='Request']")
    public WebElement requestButton;

    @FindBy(xpath = "//a[.='« Return to Login']")
    public WebElement returnToLoginLink;






}
