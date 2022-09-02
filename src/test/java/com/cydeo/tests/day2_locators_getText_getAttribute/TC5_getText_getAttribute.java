package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_getText_getAttribute {
    public static void main(String[] args) {

        //
        //  TC #5: getText() and getAttribute() method practice
        //   1- Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //   2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //   3- Verify header text is as expected:
        //  Expected: Registration form

        String actualHeader =driver.findElement(By.tagName("h2")).getText();
        String expectedHeader="Registration form";

        if(expectedHeader.equals(actualHeader)){
            System.out.println("header verification passed");
        }else{
            System.out.println("Header verification failed");
        }
        //   4- Locate “First name” input box
        //   5- Verify placeholder attribute’s value is as expected:
        //   Expected: first name
       String expectedPlaceHolder=  "first name";
        String actualPlaceHolder= driver.findElement(By.name("firstname")).getAttribute("placeholder");

        if(expectedPlaceHolder.equals(actualPlaceHolder)){
            System.out.println("placeholder attribute value verification passed");
        }else{
            System.out.println("placeholder attribute value verification failed");
        }

    }
}
