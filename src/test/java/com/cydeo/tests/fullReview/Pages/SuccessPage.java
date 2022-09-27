package com.cydeo.tests.fullReview.Pages;

import com.cydeo.tests.Utility.DriverUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessPage {

    public SuccessPage() {

        PageFactory.initElements(DriverUtility.getDriver(),this);
    }

    @FindBy(xpath = "//p")
    public WebElement successMessage;
}
