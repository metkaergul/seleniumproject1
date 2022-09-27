package com.cydeo.tests.fullReview.Pages;

import com.cydeo.tests.Utility.DriverUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegistrationPage {

    public RegistrationPage(){

        PageFactory.initElements(DriverUtility.getDriver(),this);
    }

    @FindBy(xpath = "//h2")
    public WebElement registrationFormHeader;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstNameInputBox;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastNameInputBox;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement UserNameInputBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInputBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneNumber;

//    @FindBy(xpath =" (//input[@type='radio'])[1]")
//    public WebElement radioButtonMale;
//
//    @FindBy(xpath =" (//input[@type='radio'])[2]")
//    public WebElement radioButtonFemale;
//
//    @FindBy(xpath = "(//input[@type='radio'])[3]")
//    public WebElement radioButtonOther;

    @FindBy(xpath = "//a[.='Home']")
    public WebElement homeLink;

    @FindBy(xpath =" //input[@type='radio']")
    public List<WebElement> genderRadioButtons;

    @FindBy(xpath = "//input[@name='birthday']")
    public WebElement birthdayInputBox;

    @FindBy(xpath = "//select[@class='form-control selectpicker']")
    public WebElement departmentDropdown;

    @FindBy(name="job_title")
    public WebElement jobTitleDropdown;

    @FindBy(css = "#inlineCheckbox1")
    public WebElement cProgrammingLanguage;

    @FindBy(css = "#inlineCheckbox2")
    public WebElement javaProgrammingLanguage;

    @FindBy(css = "#inlineCheckbox3")
    public WebElement javaScriptProgrammingLanguage;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signUpButton;

    @FindBy(partialLinkText = "CY")
    public WebElement cydeoLink;


}
