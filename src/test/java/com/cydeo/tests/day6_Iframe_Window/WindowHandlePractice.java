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

public class WindowHandlePractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        WebDriverManager.chromedriver().setup();
        driver = Utilities.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");

    }

    @Test
    public void WindowHandle() {

        String currentTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(currentTitle, expectedTitle);
        String currentPageNumber = driver.getWindowHandle();
        System.out.println("currentPageNumber = " + currentPageNumber);

        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        System.out.println("before clicking link, pages current Title is = " + driver.getTitle());
        clickHereLink.click();
        //after clicking clichere link we landed on second window and we have to switch to this page and i recorded second page unique  number

        for (String eachWindow : driver.getWindowHandles()) {

            driver.switchTo().window(eachWindow);
            System.out.println("current driver getTitle is  = " + driver.getTitle());
        }


        System.out.println("after clicking link pages new Title is = " + driver.getTitle());


    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}

/*TC #5: Window Handle practice

1. Create a new class called: T5_WindowsPractice
2. Create new test and make set ups
3. Go to : https://practice.cydeo.com/windows
4. Assert: Title is “Windows”
5. Click to: “Click Here” link
6. Switch to new Window.
7. Assert: Title is “New Window”   */