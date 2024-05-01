package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class BuildYourOwnComputerPage extends Utils {

    public void selectYourProductOptions(){

            //to select from drop down Processor
            selectTextByVisibleText(By.id("product_attribute_1"),"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]");

            //to select from drop down RAM
            selectTextByVisibleText(By.id("product_attribute_2"),"8GB [+$60.00]");

            //to select 2nd  opp HDD
            clickOnElement(By.id("product_attribute_3_7"));

            //to select 2nd opp OS
            clickOnElement(By.id("product_attribute_4_9"));

            //to select 2nd opp software
            clickOnElement(By.id("product_attribute_5_11"));

            //to click on Add to Cart button
            clickOnElement(By.id("add-to-cart-button-1"));

    }
}

