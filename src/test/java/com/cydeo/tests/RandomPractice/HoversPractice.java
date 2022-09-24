package com.cydeo.tests.RandomPractice;

import com.cydeo.tests.Utility.DriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoversPractice {


@Test
    public void hover(){


    DriverUtility.getDriver().get("https://practice.cydeo.com/hovers");


    Actions action=new Actions(DriverUtility.getDriver());

    WebElement figure1= DriverUtility.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
    WebElement figure2= DriverUtility.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
    WebElement figure3= DriverUtility.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[3]"));

            action.moveToElement(figure1).pause(2000).moveToElement(figure2).pause(2000).moveToElement(figure3).perform();



}


}
