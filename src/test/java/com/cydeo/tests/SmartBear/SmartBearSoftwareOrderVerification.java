package com.cydeo.tests.SmartBear;

import com.cydeo.tests.Utility.DriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmartBearSoftwareOrderVerification {
    @Test
    public void  software_order_verification(){

        SmartBearUtils.loginToSmartBear(DriverUtility.getDriver());
        WebElement viewAllorders = DriverUtility.getDriver().findElement(By.xpath("//a[.='View all orders']"));

            viewAllorders.click();

        WebElement susanOrderDate = DriverUtility.getDriver().findElement(By.xpath("//tbody//td[.='Susan McLaren']/following-sibling::td[3]"));
        String expectedSusanOrderDate="01/05/2010";
        String actualSusanOrderDate=susanOrderDate.getText();
        Assert.assertEquals(expectedSusanOrderDate,actualSusanOrderDate);

    }
}
/*TC#3: Smartbear software order verification
1. Open browser and login to Smartbear software
2. Click on View all orders
3. Verify Susan McLaren has order on date “01/05/2010”

 */