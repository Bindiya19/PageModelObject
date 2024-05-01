package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils{

    public void loginDetails(){
        //to type Email
        typeText(By.className("email"),email);
        //to type Password
        typeText(By.className("password"),password);
        //to click on submit Login button
        clickOnElement(By.xpath("//div/button[@Class='button-1 login-button']"));
    }
}
