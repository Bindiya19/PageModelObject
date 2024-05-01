package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils {



    public void userShouldBeAbleTOGetRegisterMsg() {
        //verify correct registration msg display
        String actualMsg = getTextFromElement(By.className("result"));
        // expected msg as requirement.
        String expectedRegisterMsg =loadProp.getProperty("ExpectedRegisterMsg");//"Your registration completed";

        Assert.assertEquals(actualMsg,expectedRegisterMsg,"your test case is fail.");
    }
}
