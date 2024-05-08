package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;



public class NikePage extends Utils{
    public void ProductsContainSpecificWordInTitle(){
                //show list of product title element
                List<WebElement> productcontainWordElementList = driver.findElements(By.xpath("//div[@class='item-box']//h2"));

                String WabElement = loadProp.getProperty("ProductName");
                System.out.println(productcontainWordElementList.size());

                //String[] productName={"Nike Floral Roshe Customized Running Shoes","Nike SB Zoom Stefan Janoski \"Medium Mint\"","Nike Tailwind Loose Short-Sleeve Running Shirt"}
                for (WebElement webelement:productcontainWordElementList){
                    Assert.assertNotNull(webelement.getText(),"One of the product title missing");

                    //verify Url
                    String actualNikeUrl = driver.getCurrentUrl();
                    Assert.assertEquals(actualNikeUrl,loadProp.getProperty("ExpectedNikeUrl"),"Incorrect Url!");
        }
    }
}
