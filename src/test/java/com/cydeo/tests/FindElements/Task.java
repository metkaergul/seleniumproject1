package com.cydeo.tests.FindElements;

import com.cydeo.tests.Utility.DriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Task {


    @BeforeClass
    public void setUpMethod() {

        DriverUtility.getDriver().get("https://www.openxcell.com ");

    }

    @Test
    public void check_Number_Of_Links() {

        List<WebElement> allLinks = DriverUtility.getDriver().findElements(By.xpath("//a"));

        int actualLinkNumber = allLinks.size();
        int expectedLinkNumber = 355;
        Assert.assertEquals(actualLinkNumber, expectedLinkNumber);
//        DriverUtility.closeDriver();
    }

    @Test
    public void print_text_Of_Links() {

        List<WebElement> allLinks = DriverUtility.getDriver().findElements(By.xpath("//a"));
        int countHasNoText = 0;
        for (WebElement eachLink : allLinks) {
            if (!(eachLink.getText().isEmpty())) {

                System.out.println("eachLink.getText() = " + eachLink.getText());
            } else {
                countHasNoText++;
            }

        }

        System.out.println("countHasNoText = " + countHasNoText);
    }

}
