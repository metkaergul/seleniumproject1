package com.cydeo.tests.RandomPractice;

import com.cydeo.tests.Utility.ConfigurationReader;
import com.cydeo.tests.Utility.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Twitter2 {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        WebDriverManager.chromedriver().setup();
        String browser= ConfigurationReader.getProperty("browser");
        driver= Utilities.getDriver(browser);


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Step2 ---> Go to "https://twitter.com/"


       String url=  ConfigurationReader.getProperty("env");
       driver.get(url);




    }
    @Test
    public void TwitterTest(){
        // Step3 ---> Click Sign in button
        WebElement signInButton = driver.findElement(By.xpath("//a[@href=\"/login\"]"));

        signInButton.click();


        //tep4 ---> Enter username and password, using the keys in the config.properties file

        WebElement usernameInput = driver.findElement(By.xpath("//input[@autocomplete='username']"));
        String userName= ConfigurationReader.getProperty("username");
        usernameInput.sendKeys(userName+ Keys.ENTER);

        String password= ConfigurationReader.getProperty("password");
        WebElement passwordInput= driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
        passwordInput.sendKeys(password+Keys.ENTER);




    }


}


//Step1 ---> Create config.properties file
//---it's include browser, env, username, password
// Step2 ---> Go to "https://twitter.com/"
// Step3 ---> Click Sign in button
// Step4 ---> Enter username and password, using the keys in the config.properties file
// Step5 ---> list trending topics
// Step6 ---> Add all trending topics at a List<WebElement>
// Step7 ---> print each trend topic
// Step8 ---> List accounts that have made last comments on each topic --> use method outside test method