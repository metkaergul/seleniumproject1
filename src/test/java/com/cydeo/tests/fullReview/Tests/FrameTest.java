package com.cydeo.tests.fullReview.Tests;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTest extends TestBase {


    @Test
    public void iframe_test(){

        driver.get("https://www.w3schools.com/html/html_iframe.asp");
        WebElement iframe=driver.findElement(By.xpath("//iframe[@title='W3Schools HTML Tutorial']"));
        driver.switchTo().frame(iframe);

        WebElement headerInIframe = driver.findElement(By.xpath("//span[@class='color_h1']"));
        Assert.assertTrue(headerInIframe.isDisplayed());
        driver.switchTo().parentFrame();



    }
}
