package com.cydeo.tests.FleetProject;

import com.cydeo.pages.FleetHomePage;
import com.cydeo.pages.FleetLoginPage;
import com.cydeo.tests.Utility.ConfigurationReader;
import com.cydeo.tests.Utility.DriverUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FleetLogOutRunner {

    FleetLoginPage fleetLoginPage;
    FleetHomePage fleetHomePage;


//    @AfterClass
//    public void tearDown(){
//        DriverUtility.closeDriver();
//    }



    //1- User can log out by using log out button inside profile info and ends up in login page.
    //2-User should land on "Login" page after logs out

    @Test
    public void login_With_Valid_Credentials(){

        DriverUtility.getDriver().get("https://qa.perfleet.com/user/login");

        fleetLoginPage=new FleetLoginPage();

        fleetLoginPage.usernameInputBox.sendKeys(ConfigurationReader.getProperty("fleetusername"));
        fleetLoginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("fleetpassword"));
        fleetLoginPage.loginButton.click();
    }
    @Test
    public void logout(){

        fleetHomePage=new FleetHomePage();

        fleetHomePage.profileMenuDropdown.click();
        fleetHomePage.logoutOption.click();

        String expectedTitleAfterLogOut="Login";
        String actualTitleAfterLogOut=DriverUtility.getDriver().getTitle();
        Assert.assertEquals(expectedTitleAfterLogOut,actualTitleAfterLogOut);

    }

    //The user can not go to the home page again by clicking the step back button after successfully logged out.
    @Test
    public void step_Back_Button_Test(){

        DriverUtility.getDriver().navigate().back();
        String expectedPageTitle="Login";
        String actualPageTitle=DriverUtility.getDriver().getTitle();
        Assert.assertEquals(expectedPageTitle,actualPageTitle);

    }



}
