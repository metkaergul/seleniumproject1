package com.cydeo.tests.gas_Mileage;

import com.cydeo.pages.CalculatorPage;
import com.cydeo.tests.Utility.DriverUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GasMileageCalculatorTask {


    @Test
    public void gas_mileage_calculator_task(){


        CalculatorPage gasMileageCalculator=new CalculatorPage();
        //Go to https://www.calculator.net
        DriverUtility.getDriver().get("https://www.calculator.net");

        //Search for “gas mileage” using search box

        gasMileageCalculator.searchButton.sendKeys("gas mileage");

        //Click on the “Gas Mileage Calculator” link
        gasMileageCalculator.gasMileageCalculatorLink.click();

        //On Next page verify:
        //a. Title equals: “Gas Mileage Calculator”
        String expectedTitle="Gas Mileage Calculator";
        String actualTitle=DriverUtility.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        //“Gas Mileage Calculator” label is displayed
        Assert.assertTrue(gasMileageCalculator.gasMileageCalculatorLabel.isDisplayed());

        // Locate, clear and type “7925” into “Current odometer” field
        gasMileageCalculator.clearButton.click();
        gasMileageCalculator.currentOdometerReading.sendKeys("7925");
        // Locate, clear and type “7550” into “Previous odometer” field
        gasMileageCalculator.previousOdometerReading.sendKeys("7550");
        // Locate, clear and type “16” into “Gas added” field
        gasMileageCalculator.gaSAddedToTheTank.sendKeys("16");
        // Locate, clear and type “3.55” into “Gas price” field
        gasMileageCalculator.gasPriceOptional.sendKeys("3.55");

        //Click on Calculate button
        gasMileageCalculator.calculateButton.click();

        //Verify mpg value is as expected:
        //Expected value: “23.44 mpg”
        String expectedMpgValue="23.44 mpg";
        String actualMpgValue=gasMileageCalculator.mpgValue.getText();
        Assert.assertEquals(expectedMpgValue,actualMpgValue);

        DriverUtility.closeDriver();





    }


}
/*Task #: Gas Mileage Calculator Automation Test

1. Add a new class GasMileageCalculatorTest
2. Go to https://www.calculator.net
3. Search for “gas mileage” using search box
4. Click on the “Gas Mileage Calculator” link


5. On Next page verify:
a. Title equals: “Gas Mileage Calculator”
b. “Gas Mileage Calculator” label is displayed






6. Locate, clear and type “7925” into “Current odometer” field
7. Locate, clear and type “7550” into “Previous odometer” field
8. Locate, clear and type “16” into “Gas added” field
9. Locate, clear and type “3.55” into “Gas price” field
10. Click on Calculate button
11. Verify mpg value is as expected:
Expected value: “23.44 mpg”
  */