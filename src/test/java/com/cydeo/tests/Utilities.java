package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Utilities {


    public static WebDriver getDriver(String browserType) {
        /*// TASK: NEW METHOD CREATION
       // Method Name: getDriver
       // Static method
       //Accept String arg: browserType
       //  -This arg will determine what type of browser  opened
       //  -if "chrome"  passed -->it will open chrome browser
        // -if "firefox" passed  -->it will open firefox browser
        //Return type : WebDriver*/
        if (browserType.equalsIgnoreCase("chrome")) {
            return new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            return new FirefoxDriver();
        } else {
            return null;

        }

    }

    public static void clickAndVerifyRadioButton(WebDriver driver, String name, String id) {

        //Create a utility method to handle above logic.
        //Method name: clickAndVerifyRadioButton
        //Return type: void or boolean
        //Method args:
        //1. WebDriver
        //2. Name attribute as String (for providing which group of radio buttons)
        //3. Id attribute as String (for providing which radio button to be clicked)
        //
        //Method should loop through the given group of radio buttons. When it finds the
        //matching option, it should click and verify option is Selected.
        //Print out verification: true

        WebDriverManager.chromedriver().setup();

        List<WebElement> groupOfRadioButtons = driver.findElements(By.name(name));


        for (WebElement eachInnerOption : groupOfRadioButtons) {
            if (eachInnerOption.getAttribute("id").equalsIgnoreCase(id)) {
                eachInnerOption.click();
                System.out.println(id + " option  isSelected  = " + eachInnerOption.isSelected());

            }


        }

    }
}
