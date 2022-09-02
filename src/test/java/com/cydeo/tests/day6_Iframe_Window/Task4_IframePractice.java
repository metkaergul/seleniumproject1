package com.cydeo.tests.day6_Iframe_Window;

import com.cydeo.tests.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task4_IframePractice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        WebDriverManager.chromedriver().setup();
        driver = Utilities.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe  ");

    }
    @Test
    public void iframeTest(){

        WebElement iframeElement = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframeElement);

        WebElement innerComment = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(innerComment.isDisplayed());

        //you have to switch back to the main html page in order to be able to locate element outside the iframe
        driver.switchTo().parentFrame();
        WebElement iframeHeader = driver.findElement(By.xpath("//h3"));
        Assert.assertEquals(iframeHeader.getText(),"An iFrame containing the TinyMCE WYSIWYG Editor");

    }

@AfterMethod
    public void tearDown(){

        driver.close();
}


}
/*
TC #4: Iframe practice

1. Create a new class called: T4_Iframes
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor” */