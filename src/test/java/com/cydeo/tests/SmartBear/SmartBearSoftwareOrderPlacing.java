package com.cydeo.tests.SmartBear;

import com.cydeo.tests.Utility.DriverUtility;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmartBearSoftwareOrderPlacing {

    @Test
    public static void smart_bear_Order_Placing(){

        SmartBearUtils.loginToSmartBear(DriverUtility.getDriver());

        WebElement orderLink = DriverUtility.getDriver().findElement(By.xpath("(//a)[3]"));
        orderLink.click();

        Select productDropdown=new Select(  DriverUtility.getDriver().findElement(By.xpath("//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']"))
        );
        productDropdown.selectByVisibleText("FamilyAlbum");

        WebElement quantity = DriverUtility.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']"));

        quantity.sendKeys("2");
        //Click to “Calculate” button
        WebElement calculateButton=DriverUtility.getDriver().findElement(By.xpath("//input[@value='Calculate']"));

        calculateButton.click();

        //Fill address Info with JavaFaker
        //• Generate: name, street, city, state, zip code

        Faker faker=new Faker();
        WebElement customerName = DriverUtility.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtName']"));
        String name=faker.name().fullName();
        customerName.sendKeys(name);

        WebElement street = DriverUtility.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox2']"));
        street.sendKeys(faker.address().streetName());

        WebElement city = DriverUtility.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox3']"));
        city.sendKeys(faker.address().cityName());

        WebElement state = DriverUtility.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox4']"));
        state.sendKeys(faker.address().state());

        WebElement zip = DriverUtility.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox5']"));
        zip.sendKeys(faker.number().digit());

        WebElement visaRadioButton=DriverUtility.getDriver().findElement(By.xpath("//input[@value='Visa']"));
        visaRadioButton.click();

        WebElement cardNumber = DriverUtility.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox6']"));

            cardNumber.sendKeys(faker.bothify("################"));

        WebElement expiryDate= DriverUtility.getDriver().findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox1']"));
        expiryDate.sendKeys(faker.numerify("##/##"));

        WebElement processButton = DriverUtility.getDriver().findElement(By.xpath("//a[.='Process']"));
        processButton.click();

        WebElement message= DriverUtility.getDriver().findElement(By.xpath("//strong"));
        Assert.assertTrue(message.isDisplayed());


    }


}
/*TC#2: Smartbear software order placing
1. Open browser
2. Go to website:
http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
3. Enter username: “Tester”
4. Enter password: “test”
5. Click on Login button
6. Click on Order
7. Select familyAlbum from product, set quantity to 2
8. Click to “Calculate” button
9. Fill address Info with JavaFaker
• Generate: name, street, city, state, zip code
10. Click on “visa” radio button
11. Generate card number using JavaFaker
12. Click on “Process”
13. Verify success message “New order has been successfully added.”
 */