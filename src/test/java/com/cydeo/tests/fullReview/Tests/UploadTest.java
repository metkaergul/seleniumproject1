package com.cydeo.tests.fullReview.Tests;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UploadTest extends TestBase {


    @Test
    public void upload_test(){
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

        driver.findElement(By.xpath("//input[@name='upload']")).sendKeys("/Users/etkaergul/Desktop/23.png");
    }

}
