package com.cydeo.tests.Discord;

import com.cydeo.pages.BBC_HomePage;
import com.cydeo.pages.DiscordHomepage;
import com.cydeo.pages.DiscordLoginPage;
import com.cydeo.tests.Utility.ConfigurationReader;
import com.cydeo.tests.Utility.DriverUtility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DiscordBot {

    public String headlinesText;
    public String paragraphInHeadlineText;





    @Test
    public void BBC_News() {
        BBC_HomePage bbc_homePage=new BBC_HomePage();
        //get the bbc cnn and sputnik big headlines and its first paragraphs respectively
        DriverUtility.getDriver().get("https://www.bbc.com/");

        bbc_homePage.News_Link.click();
        headlinesText = bbc_homePage.HeadLines.getText();
        paragraphInHeadlineText = bbc_homePage.paragraphInHeadlines.getText();
      DriverUtility.closeDriver();

    }

    @Test
    public void discord_First_Login() {

        DriverUtility.getDriver().get("https://discord.com/login");

        DiscordLoginPage discordLoginPage=new DiscordLoginPage();

        //fill out inputboxes with valid username
        discordLoginPage.userNameInputBox.sendKeys(ConfigurationReader.getProperty("username"));
        //fill out password inputboxes with valid password
        discordLoginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));

        //click the login button
        discordLoginPage.loginButton.click();
    }

//-------------------------------------------------------------------

        @Test
        public void discord_Second_HomePage(){

            DiscordHomepage discordHomepage=new DiscordHomepage();

            //click OKAN link under the direct messages

           WebDriverWait wait=new WebDriverWait(DriverUtility.getDriver(),30);
            wait.until(ExpectedConditions.visibilityOf(discordHomepage.okanSumnulu));
            discordHomepage.okanSumnulu.click();


            //send message to okanSumnulu

                discordHomepage.sendMessage.sendKeys("following messages comes from giant news corporations \npick up one of the options \n 1-)BBC \n 2-)Sputnik "+ Keys.ENTER);
                wait.until(ExpectedConditions.visibilityOf(discordHomepage.expectedMessage));


                if(discordHomepage.expectedMessage.getText().equalsIgnoreCase("bbc")){

                   discordHomepage.sendMessage.sendKeys( headlinesText+paragraphInHeadlineText);
                }


        }

//
//        @Test
//        public void group2_3_attack(){
//            DiscordHomepage discordHomepage=new DiscordHomepage();
//        discordHomepage.CydeoBatch.click();
//        discordHomepage.part2_group3.click();
//
//            for (int i = 0; i <10 ; i++) {
//
//                discordHomepage.group3MessageBox.sendKeys("Hi this is group 3 alien bot winter is coming go and get find a shelter yourself"+ Keys.ENTER);
//            }
//
//        }

    }




