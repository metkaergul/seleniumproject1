package com.cydeo.tests.day6_Iframe_Window;

import com.cydeo.tests.Utility.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1_2_3_Alert {

    WebDriver driver;
    @BeforeClass
    public void setupMethod(){

        WebDriverManager.chromedriver().setup();
        driver = Utilities.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // https://practice.cydeo.com/dropdown
        driver.get(" http://practice.cydeo.com/javascript_alerts");

    }
    @Test
    public void informationAlert() throws InterruptedException {


        WebElement clickforJSAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        clickforJSAlertButton.click();
        Thread.sleep(2000);

        Alert alert= driver.switchTo().alert();
        alert.accept();




    }
    @Test
    public void confirmationAlert() throws InterruptedException {

        WebElement clickforJSConfirmButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        clickforJSConfirmButton.click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();

        alert.dismiss();

    }
    @Test
    public void promptAlert() throws InterruptedException {

        WebElement clickForJsPromptButton= driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        clickForJsPromptButton.click();

        Thread.sleep(2000);

        Alert alert =driver.switchTo().alert();

        alert.sendKeys("Hello");
        alert.accept();

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }



}
/*TC #1: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Alert” button
4. Click to OK button from the alert
5. Verify “You successfully clicked an alert” text is displayed.

TC #2: Confirmation alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Confirm” button
4. Click to OK button from the alert
5. Verify “You clicked: Ok” text is displayed.

TC #3: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Prompt” button
4. Send “hello” text to alert
5. Click to OK button from the alert
6. Verify “You entered:  hello” text is displayed.  */