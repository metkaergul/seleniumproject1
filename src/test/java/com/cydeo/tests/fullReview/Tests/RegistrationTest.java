package com.cydeo.tests.fullReview.Tests;

import com.cydeo.tests.Utility.DriverUtility;
import com.cydeo.tests.fullReview.Pages.RegistrationPage;
import com.cydeo.tests.fullReview.Pages.SuccessPage;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest {



    WebDriver driver;
    RegistrationPage registrationPage;
    SuccessPage successPage;
    Faker faker=new Faker();

    @BeforeMethod
    public void setUpMethod() {

        driver = DriverUtility.getDriver();
        registrationPage=new RegistrationPage();
        successPage=new SuccessPage();
        driver.get("https://practice.cydeo.com/registration_form");


    }
    @AfterMethod
    public void tearDown(){
        DriverUtility.closeDriver();
    }

    @Test
    public void regTest(){

        registrationPage.firstNameInputBox.sendKeys(faker.name().firstName());
        registrationPage.lastNameInputBox.sendKeys(faker.name().lastName());
        registrationPage.UserNameInputBox.sendKeys(faker.bothify("####???###??"));
        registrationPage.emailInputBox.sendKeys(faker.internet().emailAddress());
        registrationPage.passwordInputBox.sendKeys(faker.bothify("###????##"));
        registrationPage.phoneNumber.sendKeys(faker.numerify("###-###-####"));
//        for (WebElement genderRadioButton : registrationPage.genderRadioButtons) {
//            if(genderRadioButton.getText().equalsIgnoreCase("male")){
//                genderRadioButton.click();
//                break;
//            }
//        }
        registrationPage.genderRadioButtons.get(faker.number().numberBetween(0,3)).click();
        registrationPage.birthdayInputBox.sendKeys("11/03/1997");

        Select select=new Select(registrationPage.departmentDropdown);
        select.selectByIndex(faker.number().numberBetween(1,10));

        Select select1=new Select(registrationPage.jobTitleDropdown);
        select1.selectByIndex(faker.number().numberBetween(1,9));

        registrationPage.cProgrammingLanguage.click();
        registrationPage.javaProgrammingLanguage.click();

        registrationPage.signUpButton.click();

        String expectedMessage="You've successfully completed registration!";
        String actualMessage=successPage.successMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);




    }



}
