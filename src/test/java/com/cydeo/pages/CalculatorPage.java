package com.cydeo.pages;

import com.cydeo.tests.Utility.DriverUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {


    public CalculatorPage() {

        PageFactory.initElements(DriverUtility.getDriver(),this);
    }



    @FindBy(xpath = "//input[@name='calcSearchTerm']")
    public WebElement searchButton;


    @FindBy(xpath = "//a[.='Gas Mileage Calculator']")
    public WebElement gasMileageCalculatorLink;


    @FindBy(xpath = "//h1[.='Gas Mileage Calculator']")
    public WebElement gasMileageCalculatorLabel;



    @FindBy(xpath = "(//img[@class='clearbtn'])[2]")
    public WebElement clearButton;

    @FindBy(xpath = "//input[@name='mucodreading']")
    public WebElement currentOdometerReading;


    @FindBy(xpath = "//input[@name='mupodreading']")
    public WebElement previousOdometerReading;

    @FindBy(xpath = "//input[@name='mugasputin']")
    public WebElement gaSAddedToTheTank;

    @FindBy(xpath = "//input[@name='mugasprice']")
    public WebElement gasPriceOptional;


    @FindBy(xpath = "(//input[@value='Calculate'])[2]")
    public WebElement calculateButton;


    @FindBy(xpath = "//span[@class='bigtext']")
    public WebElement mpgValue;

}
