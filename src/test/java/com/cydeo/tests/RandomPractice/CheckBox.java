package com.cydeo.tests.RandomPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com/checkboxes");
        //form#checkboxes>input   ---#box1-------//input[@type='checkbox']-------//form[@id='checkboxes']/input
        WebElement checkboxes1= driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("before click checkboxes1.isSelected() = " + checkboxes1.isSelected());

        checkboxes1.click();
        System.out.println("after click checkboxes1.isSelected() = " + checkboxes1.isSelected());

        WebElement checkboxes2= driver.findElement(By.xpath("//input[@name='checkbox2']"));
        System.out.println("before click checkboxes2.isSelected() = " + checkboxes2.isSelected());

        checkboxes2.click();
        System.out.println("after click checkboxes2.isSelected() = " + checkboxes2.isSelected());



    }


}
