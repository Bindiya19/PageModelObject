package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Currency;
import java.util.List;
import java.util.Scanner;

import static java.awt.SystemColor.text;

public class HomePage extends Utils {
    //click on register button from header bar
    public void clickOnRegisterButton() {
        clickOnElement(By.className("ico-register"));
    }

    //click on login button from header bar
    public void clickOnLoginButton() {
        clickOnElement(By.className("ico-login"));
    }

    //click on electronics button from bar
    public void clickOnElectronicsButton() {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']"));
    }

    //click on Build your own computer
    public void featuredProducts() {
        clickOnElement(By.linkText("Build your own computer"));
    }

    //click on computer from header bar
    public void clickOnComputer() {
        clickOnElement(By.linkText("Computers"));
    }

    //click on vote button
    public void clickOnVote() {
        clickOnElement(By.id("vote-poll-1"));
    }

    //method to get text and accept popup alert msg after click on vote
    public void handleAlertMsg() {
        //capture msg from alert
        String actualAlertMessage = getTextFromAlertMsg();
        //msg from requirement
        String expectedMsg = "Please select an answer";
        //to compare the actual and expected msg
        Assert.assertEquals(actualAlertMessage, expectedMsg, "Your test case is fail.");
        //to close the popup alert
        acceptAlert();
    }

    //method to click on search button on home page
    public void clickSearchButton() {
        clickOnElement(By.xpath("//*[@id='small-search-box-form']/button"));
    }

    //method to get text and accept popup alert after click on search
    public void getAlertMsg() {
        //capture msg from alert
        String actualAlertMessage = getTextFromAlertMsg();
        //msg from requirement
        String expectedMsg = "Please enter some search keyword";
        //to compare the actual and expected msg
        Assert.assertEquals(actualAlertMessage, expectedMsg, "Your test case is fail.");
        //to close the popup alert
        acceptAlert();
    }

    //
    public void clickOnFaceBook() {
        clickOnElement(By.linkText("Facebook"));
    }

    public void verifyWelcomeMsg() {

        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='topic-block-title']/h2")), loadProp.getProperty("ExpectedWelcomeMsg"), "Msg does not match");
    }

    public void clickOnDetailButton() {
        clickOnElement(By.xpath("//div[@class='news-items']/div[2]/div[3]/a"));

    }

    //method to search any product
    public void typeProductName() {
        typeText(By.id("small-searchterms"), loadProp.getProperty("ProductName"));

    }

    public void clickOnEuroCurrency() {
        selectTextByVisibleText(By.id("customerCurrency"), "Euro");
        //show list of product currency element
        List<WebElement> productListContainEuroCurrency = driver.findElements(By.xpath("//div[@class='product-grid home-page-product-grid']//div[@class='prices']"));

        System.out.println(productListContainEuroCurrency.size());

        for (WebElement webelement : productListContainEuroCurrency) {
            Assert.assertNotNull(webelement.getText(), "Product's currency does not match. ");
        }
    }
        public void clickOnUSDollarCurrency () {
            selectTextByVisibleText(By.id("customerCurrency"), "US Dollar");
            //show list of product currency element
            List<WebElement> productListContainUSDollarCurrency = driver.findElements(By.xpath("//div[@class='product-grid home-page-product-grid']//div[@class='prices']"));

            System.out.println(productListContainUSDollarCurrency.size());

            for (WebElement webelement : productListContainUSDollarCurrency) {
                Assert.assertNotNull(webelement.getText(), "Product's currency does not match. ");
            }
        }

}


