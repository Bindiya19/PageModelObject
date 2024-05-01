package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;



//All reusable method will be in this class
public class Utils extends BasePage {

    //create obj to call loadProp
    static LoadProp loadProp = new LoadProp();

    //save emailId for reuse
    static String email = loadProp.getProperty("EmailPart1")+randomDate()+loadProp.getProperty("EmailPart2");//"bp"+randomDate()+"@gmail.com";

    //Method to generate Random date String data type
    public static String randomDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    //save password for reuse
    static String password = loadProp.getProperty("Password");

    //method for hover on element
    public static void hoverOnElement(By by){driver.findElement(by).getLocation();}

    //method for to click on element
    public static void clickOnElement(By by) {driver.findElement(by).click();}

    //method for to click on group or selection of Elements(more then one)
    //public static void clickOnElements(By by){driver.findElements(by).size();}

    //method for type text as string in text box
    public static void typeText(By by, String text) {driver.findElement(by).sendKeys(text);}

    //method for capture text of the element
    public static String getTextFromElement(By by) {return driver.findElement(by).getText();}


    //to tell the WebDriver to wait for a certain amount of time when trying to find an element if it is not immediately available
    public static void waitForWebElement() {driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}

    //to tell the WebDriver to wait for an Element To Be Visible, extra 10 Seconds.
    public static void waitForElementToBeVisible() {WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));}

    //to tell the WebDriver to wait for an Element To Be Clickable, extra 10 Seconds.
    public static void waitForWebElementToBeClickable(){WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));}

    //to tell the WebDriver to wait until an Element To Be Selected, extra 10 Seconds.
    public static void waitUntilWebElementToBeSelected(){WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));}

    //to tell the WebDriver to wait until Located an Element invisible, extra 10 Seconds.
    public static void waitInvisibilityOfTheElementLocated(){WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));}

    //to tell the WebDriver to wait until an Element Visible With Text, extra 10 Seconds
    public static void waitForVisibilityOfElementWithText(){WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));}

    //To tell the webDriver to wait until Text To BePresent In Element, extra 10 Second
    public static void waitForTextToBePresentInElement(){WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));}


    public static void sleepDriver()
    {
        try {Thread.sleep(2000);}
        catch (InterruptedException e)
        {throw new RuntimeException(e);}
    }
    //to select text by visible text
    public static void selectTextByVisibleText (By by, String text)
    {
            //to select date of birth
            Select dateOfBirth = new Select(driver.findElement(by));
            dateOfBirth.selectByVisibleText(text);

            //to Select month of birth
            Select dateOfBirthMonth = new Select(driver.findElement(by));
            dateOfBirthMonth.selectByVisibleText(text);

            //to Select year of birth
            Select dateOfBirthYear = new Select(driver.findElement(by));
            dateOfBirthYear.selectByVisibleText(text);

    }
    //to select text by value
    public static void selectTextByValue(By by,String text)
    {
        //to select date of birth
        Select dateOfBirth = new Select(driver.findElement(by));
        dateOfBirth.selectByValue(text);

        //to select month of birth
        Select dateOfBirthMonth = new Select(driver.findElement(by));
        dateOfBirthMonth.selectByValue(text);

        //to select year of birth
        Select dateOfBirthYear = new Select(driver.findElement(by));
        dateOfBirthYear.selectByValue(text);
    }
    //to select text by index
    public static void selectTextByIndex(By by,int i)
    {
        //to select date of birth
        Select dateOfBirth = new Select(driver.findElement(by));
        dateOfBirth.selectByIndex(i);

        //to select month of birth
        Select dateOfBirthMonth = new Select(driver.findElement(by));
        dateOfBirthMonth.selectByIndex(i);

        //to select year of birth
        Select dateOfBirthYear = new Select(driver.findElement(by));
        dateOfBirthYear.selectByIndex(i);
    }
    public static void takeScreenShot(String text)
    {
        //convert web driver object to takeScreenshot
        TakesScreenshot screenshot = ((TakesScreenshot) driver);

        //call getScreenshot as method to create image file
        File SrcFile = screenshot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination   //copy file at destination
        try {FileUtils.copyFile(SrcFile, new File("src/test/Screenshots"+text+randomDate()+".png"));}
        catch (IOException e)
        {throw new  RuntimeException(e);}
    }

}

