package com.cydeo.tests.RandomPractice;

import com.cydeo.tests.Utility.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IronSpiderDropDowns {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){

        WebDriverManager.chromedriver().setup();
        driver= Utilities.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        // Step1 ---> Go to "https://www.ironspider.ca/index.htm"
        driver.get("https://www.ironspider.ca/index.htm");
    }
    @Test
    public void dropdowns() throws InterruptedException {
        //    Step2 ---> Click Web Pages Forms button
        WebElement webPagesFormsButton = driver.findElement(By.xpath("//div[.='Web Page Forms']"));
        webPagesFormsButton.click();
        //    Step3 ---> Click Dropdown Menus button

        WebElement dropdowns = driver.findElement(By.xpath("//div[@id='subMenuID_09']/a[8]/following-sibling::a[1]"));
        dropdowns.click();

        //    Step4 ---> Verify default selected dropdown
        //        Expected = "With cream"

        //we need to create Select object to locate dropdowns options
        WebElement coffeeDropdown = driver.findElement(By.xpath("//select[@name='coffee']"));
        Select select = new Select(coffeeDropdown);

        WebElement firstSelectedOption = select.getFirstSelectedOption();
        String actualDefaultValue= firstSelectedOption.getText();
        String expectedDefaultValue= "With cream";
        Assert.assertEquals(expectedDefaultValue,actualDefaultValue);//verifying expected default value and actual default value matches

        //    Step5 ---> Select all dropdowns without "With cream"
        List<WebElement> allOptions = select.getOptions();
        System.out.println(allOptions.size());
        for(WebElement each:allOptions){

            if(  !(  each.getText().equalsIgnoreCase("With cream") )){
                Thread.sleep(2000);
                each.click();
                //    Step6 ---> Verify all dropdown is selected
               Assert.assertTrue( each.isSelected());
            }

        }

        WebElement lastSelectedOption = select.getFirstSelectedOption();
        String expectedLastSelectedOption="Crisp (har har...)";
        String actualLastSelectedOption=lastSelectedOption.getText();

        Assert.assertEquals(expectedLastSelectedOption,actualLastSelectedOption);

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }







    //    Step7 ---> Verify last selected is "Crisp (har har...)"
}
