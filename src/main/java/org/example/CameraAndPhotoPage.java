package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;

public class CameraAndPhotoPage extends Utils {

    public void clickOnT_MirrorDigitalCamera() {

        //click on Leica T Mirrorless Digital Camera
        clickOnElement(By.xpath("//*[text()='Leica T Mirrorless Digital Camera']"));

    }
    public void eachProductShouldHaveAAddToCartButton()
    {

        //show list of product title element
        List<WebElement>displayedAddToCartButtons = driver.findElements(By.xpath("//button[@class='button-2 product-box-add-to-cart-button']"));
        //to print number of add to cart button
        System.out.println(displayedAddToCartButtons.size()+" Products have 'ADD TO CART' button.");

        for (WebElement webelement:displayedAddToCartButtons)
            //Assert.assertNotNull(webElement,"One of the product missing ADD TO CART");
            Assert.assertNotNull(webelement.getText(), "One of the product missing ADD TO CART: "+webelement.getText());

    }

}

//+element.getText()

