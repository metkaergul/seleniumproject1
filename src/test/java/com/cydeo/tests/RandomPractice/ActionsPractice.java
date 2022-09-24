package com.cydeo.tests.RandomPractice;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractice extends TestBase {



    @Test
    public void ActionsPractice(){

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        Actions action=new Actions(driver);

        WebElement circle= driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement target= driver.findElement(By.xpath("//div[@id='droptarget']"));


        action.dragAndDrop(circle,target).perform();





    }
}
