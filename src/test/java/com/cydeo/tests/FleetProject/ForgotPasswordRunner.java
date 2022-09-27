package com.cydeo.tests.FleetProject;

import com.cydeo.pages.FleetForgotPasswordPage;
import com.cydeo.pages.FleetLoginPage;
import com.cydeo.tests.Utility.ConfigurationReader;
import com.cydeo.tests.Utility.DriverUtility;
import org.testng.annotations.Test;

public class ForgotPasswordRunner {



    FleetLoginPage fleetLoginPage;
    FleetForgotPasswordPage fleetForgotPasswordPage;

        //"Forgot Password" menu
        //       a) User lands on the ‘Forgot Password’ page after clicking on the "Forgot your password?" link
        //       b) User can change his/her password with their username after clicking on "Request" link
    @Test
    public void ForgotPassword_test(){
        DriverUtility.getDriver().get("https://qa.perfleet.com/user/login");
        fleetLoginPage=new FleetLoginPage();
            fleetForgotPasswordPage=new FleetForgotPasswordPage();
        fleetLoginPage.forgotYourPasswordLink.click();
        fleetForgotPasswordPage.forgotPasswordInputBox.sendKeys(ConfigurationReader.getProperty("fleetusername"));
        fleetForgotPasswordPage.requestButton.click();









    }

}
