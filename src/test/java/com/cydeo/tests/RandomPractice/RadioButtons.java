package com.cydeo.tests.RandomPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com/radio_buttons");

        WebElement blueRadioButton=driver.findElement(By.id("blue"));
        System.out.println("blueRadioButton.isSelected() = " + blueRadioButton.isSelected());
        blueRadioButton.isEnabled();

        WebElement yellowRadioButton= driver.findElement(By.id("yellow"));
        System.out.println("yellowRadioButton.isSelected() = " + yellowRadioButton.isSelected());
        yellowRadioButton.click();
        System.out.println("after click yellowRadioButton.isSelected() = " + yellowRadioButton.isSelected());

        System.out.println("after yellow button is clicked blueRadioButton.isSelected() = " + blueRadioButton.isSelected());

        WebElement greenButton= driver.findElement(By.id("green"));
        System.out.println("greenButton.isEnabled() = " + greenButton.isEnabled());
       String disabled=  greenButton.getAttribute("disabled");
        System.out.println("green button disabled= " + disabled);
    }
}
