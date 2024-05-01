package org.example;

import org.openqa.selenium.By;

public class LeicaT_MirrorlessDigital_CameraPage extends Utils {

    public void emailAFriend() {
        //click on email a friend
        clickOnElement(By.xpath("//button[normalize-space()='Email a friend']"));
    }
}