package com.cydeo.tests.RandomPractice;

import com.cydeo.tests.Utility.DriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TablePractices {



    @Test
    public void TablePractices(){


        DriverUtility.getDriver().get("https://practice.cydeo.com/tables");

        //print out jason from row and cell number
        WebElement jason = DriverUtility.getDriver().findElement(By.xpath("//table[@id='table1']/tbody/tr[3]/td[2]"));

        System.out.println("jason.getText() = " + jason.getText());

      //print out all cells in row3

        List<WebElement> all = DriverUtility.getDriver().findElements(By.xpath("//table[@id='table1']//tbody//tr[3]/td"));

        for (WebElement each : all) {
            System.out.println(each.getText());
        }

    }
}
