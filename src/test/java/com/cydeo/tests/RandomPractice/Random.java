package com.cydeo.tests.RandomPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String CydeoUserName= scan.nextLine();
        String  CydeoPassword=scan.nextLine();


        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        //first go to google homepage
        driver.get("https://www.google.com");


        //then type cydeo in  search box and press enter
       WebElement searchBox=  driver.findElement(By.tagName("input"));
       searchBox.sendKeys("cydeo"+ Keys.ENTER);

        //then find related page link and click the cydeo.com
       WebElement relatedCydeoLink= driver.findElement(By.tagName("h3"));
       relatedCydeoLink.click();
//            By  cydeoLinkLocator= RelativeLocator.withTagName("h2").toLeftOf(By.className("class"));
//        WebElement cydeoLink= (WebElement) cydeoLinkLocator;
//        cydeoLink.click();

        //find the login link on the top right corner right beside the Get Started button and click
        WebElement loginLink= driver.findElement(By.linkText("Log In"));
        loginLink.click();


        //find email INPUTbOX and then type your username and press enter

        WebElement usernameInputBox= driver.findElement(By.tagName("input"));
        usernameInputBox.sendKeys(CydeoUserName+Keys.ENTER);

        //find PASSWORD INPUTBOX and then type your username and press enter
         driver.findElement(By.xpath("//input[@type='password']")).sendKeys(CydeoPassword+ Keys.ENTER);


//        passwordInputBox.sendKeys(CydeoPassword+Keys.ENTER);


        //i want to access cydeo.com with valid credentials




        // then find the canvas module
        //after entering  the credentials press enter to login
        //then click the canvas from the dashboard
        //then click the calendars to see the schedule
        //then quit
    }
}
