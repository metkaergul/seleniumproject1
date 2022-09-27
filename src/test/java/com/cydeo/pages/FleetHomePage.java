package com.cydeo.pages;

import com.cydeo.tests.Utility.DriverUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetHomePage {
    public FleetHomePage() {

        PageFactory.initElements(DriverUtility.getDriver(),this);

    }
    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement profileMenuDropdown;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logoutOption;

    @FindBy(xpath = "//h1[.='Quick Launchpad']")
    public WebElement quickLaunchpadText;




}
