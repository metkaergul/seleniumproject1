package com.cydeo.tests.RandomPractice;

import com.cydeo.tests.Utility.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IronSpider {

    public WebDriver driver;

    // Step1 ---> Go to "https://www.ironspider.ca/index.htm"
    @BeforeMethod
    public void setUpMethod() {
        WebDriverManager.chromedriver().setup();
        driver = Utilities.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Step1 ---> Go to "https://www.ironspider.ca/index.htm"
        driver.get("https://www.ironspider.ca/index.htm");
    }

    @Test
    public void buttonAndCheckboxes() {

        // Step2 ---> Click "Web Pages Forms" button
        WebElement webPagesFormsButton = driver.findElement(By.xpath("//div[.='Web Page Forms']"));
        webPagesFormsButton.click();
        // Step3 ---> Click Checkboxes & Radio Buttons button
        WebElement checkBoxesAndRadioButtonsButton = driver.findElement(By.xpath("//div[@id='subMenuID_09']/a[8]"));
        checkBoxesAndRadioButtonsButton.click();
        // Step4 ---> Select all checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(checkboxes.size());

        for (WebElement each : checkboxes) {
            Assert.assertTrue(each.isEnabled()); //this is for checking each check box web element is clickable or not which means is enabled or not
            each.click();
        }


    }
    @AfterMethod
    public void tearDown(){

        driver.close();
    }


}







