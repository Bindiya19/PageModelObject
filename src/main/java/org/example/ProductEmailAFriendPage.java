package org.example;

import org.openqa.selenium.By;

public class ProductEmailAFriendPage extends Utils {
    public void toReferAFriend() {

        //to entre Friend's email
        typeText(By.xpath("//input[@id='FriendEmail']"),loadProp.getProperty("FriendEmailId"));

        //to enter Your email address
        typeText(By.id("YourEmailAddress"), "bp"+randomDate()+"@gmail.com");

        //to enter Personal message
        typeText(By.id("PersonalMessage"), "Hi I Found this camera on very good price.");


        //to click on SEND EMAIl button
        clickOnElement(By.xpath("//button[normalize-space()='Send email']"));

    }
}