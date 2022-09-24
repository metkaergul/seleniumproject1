package com.cydeo.pages;

import com.cydeo.tests.Utility.DriverUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscordLoginPage {


    public DiscordLoginPage() {

        PageFactory.initElements(DriverUtility.getDriver(),this);

    }



    @FindBy(xpath = "//input[@class='inputDefault-3FGxgL input-2g-os5 inputField-2RZxdl']")
    public WebElement userNameInputBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;




}
