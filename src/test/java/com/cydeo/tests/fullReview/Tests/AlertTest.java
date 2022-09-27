package com.cydeo.tests.fullReview.Tests;

import com.cydeo.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertTest extends TestBase {

    @Test
    public void alert_test(){

        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");



        WebElement alert=driver.findElement(By.xpath("//input[@name='alert']"));
        alert.click();
        Alert alert1=driver.switchTo().alert();
        alert1.accept();

        WebElement confirmationAlert=driver.findElement(By.xpath("//input[@name='confirmation']"));

        confirmationAlert.click();
        Alert alert2=driver.switchTo().alert();
        alert2.dismiss();
        WebElement promptAlert=driver.findElement(By.xpath("//input[@name='prompt']"));


        promptAlert.click();
        Alert alert3=driver.switchTo().alert();
        alert3.sendKeys("well done");
        alert3.accept();

    }

}
