package org.example;

import org.openqa.selenium.By;
//this page is only for register page
public class RegisterPage extends Utils {
     // this method for registration
    public void enterRegistrationDetails(){
        //to click on Female radio button
        clickOnElement(By.id("gender-female"));

        //type firstname
        typeText(By.id("FirstName"),email);

        //type lastname
        typeText(By.id("LastName"),loadProp.getProperty("LastName"));

        //to select Date of birth
        selectTextByVisibleText(By.name("DateOfBirthDay"),"19");

        //to select Date of birth Month
        selectTextByVisibleText(By.name("DateOfBirthMonth"),"May");

        //to select Date of birth Year
        selectTextByVisibleText(By.name("DateOfBirthYear"),"1985");

        //enter your email
        typeText(By.id("Email"),email);

        //enter your password
        typeText(By.id("Password"),password);

        //enter your Conform password
        typeText(By.id("ConfirmPassword"),loadProp.getProperty("ConfirmPassword"));

       //click on submit register button
        clickOnElement(By.name("register-button"));


    }
}