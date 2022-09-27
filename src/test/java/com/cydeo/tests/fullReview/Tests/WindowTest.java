package com.cydeo.tests.fullReview.Tests;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowTest extends TestBase {

    @Test
    public void windowHandle(){

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();



        Set<String> windowHandles = driver.getWindowHandles();
        for(String eachWindow:windowHandles){

            System.out.println(driver.switchTo().window(eachWindow).getTitle());
        }



    }


}
