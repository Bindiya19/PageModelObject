package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils
{
    //click on register button from header bar
    public void clickOnRegisterButton() {
        clickOnElement(By.className("ico-register"));
    }
    //click on login button from header bar
    public void clickOnLoginButton(){
        clickOnElement(By.className("ico-login"));
    }

    //click on electronics button from bar
    public void clickOnElectronicsButton() {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']"));
    }
    //click on Build your own computer
    public void featuredProducts(){
        clickOnElement(By.linkText("Build your own computer"));
    }


}

