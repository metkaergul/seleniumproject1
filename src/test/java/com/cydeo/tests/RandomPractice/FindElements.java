package com.cydeo.tests.RandomPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cydeo.com/radio_buttons");

        List<WebElement> colorElements= driver.findElements(By.name("color"));
        System.out.println("colorElements.size() = " + colorElements.size());
        for (WebElement eachColorElement : colorElements) {
            System.out.println("current radio button is  = " + eachColorElement.getAttribute("id"));
            System.out.println("is it selected = " + eachColorElement.isSelected());
            System.out.println("is it enabled = " + eachColorElement.isEnabled());

        }


    }
}
