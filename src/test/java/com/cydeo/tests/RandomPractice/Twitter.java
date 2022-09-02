package com.cydeo.tests.RandomPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {
    public static void main(String[] args) throws InterruptedException {

//        Scanner scan =new Scanner(System.in);
//        String email= scan.nextLine();


        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        //go to twitter.com
        driver.get("https://www.twitter.com");

        //find the sign in button  click
        Thread.sleep(3000);

        WebElement signInButton=  driver.findElement(By.cssSelector("a[href='/login']"));
        Thread.sleep(3000);
        signInButton.click();
        Thread.sleep(3000);

        WebElement phoneEmailUsername= driver.findElement(By.cssSelector("div[class=\"css-1dbjc4n r-mk0yit r-1f1sjgu r-13qz1uu\"]>label"));
        phoneEmailUsername.sendKeys("metkaergul@gmail.com");

        WebElement nextButton=driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[6]/div"));
        nextButton.click();






    }
}
