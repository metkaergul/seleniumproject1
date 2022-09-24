package com.cydeo.pages;

import com.cydeo.tests.Utility.DriverUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BBC_HomePage {


    public BBC_HomePage() {

        PageFactory.initElements(DriverUtility.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='https://www.bbc.com/news']")
    public WebElement News_Link;


    @FindBy(xpath = "//h3")
    public WebElement HeadLines;

    @FindBy(xpath = "//p[@class='gs-c-promo-summary gel-long-primer gs-u-mt nw-c-promo-summary']")
    public WebElement paragraphInHeadlines;









}
