package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils{

    public void clickOnCameraAndPhoto() {
        //click on camera & photo option
        clickOnElement(By.xpath("//a[@title='Show products in category Camera & photo'][normalize-space()='Camera & photo']"));
    }

}
