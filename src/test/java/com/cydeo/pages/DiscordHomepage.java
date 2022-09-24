package com.cydeo.pages;

import com.cydeo.tests.Utility.DriverUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscordHomepage {
    public DiscordHomepage() {
        PageFactory.initElements(DriverUtility.getDriver(),this);
    }




    @FindBy(xpath = "//a[@aria-label='Serdar (direct message)']")
    public WebElement serdar;

    @FindBy(xpath = "//a[@aria-label='okansumnulu (direct message)']")
    public WebElement okanSumnulu;


    @FindBy(xpath = "//div[@data-slate-node='element']")
    public WebElement sendMessage;

    @FindBy(xpath = "//span[@data-slate-string='true']")
    public WebElement expectedMessage;

    @FindBy(xpath = "(//div[@class='blobContainer-ikKyFs'])[8]")
    public WebElement CydeoBatch;

    @FindBy(xpath = "//li[@data-dnd-name='part2-group-3']")
    public WebElement part2_group3;

    @FindBy(xpath = "//div[@aria-label='Message #part2-group-3']")
    public WebElement group3MessageBox;

    //(//div[.='part2-group-3'])[4]
}
