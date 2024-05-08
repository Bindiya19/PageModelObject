package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class NopcommerceNewRelease extends Utils {
    public void enterYourTitleAndComment() {
        //type title in Title box
        typeText(By.id("AddNewComment_CommentTitle"), "john");
        //type comment in Comment box
        typeText(By.id("AddNewComment_CommentText"), "HELLO");
        //click on NEW COMMENT
        clickOnElement(By.name("add-comment"));
        //actual test msg after click on NEW COMMENT
        String actualMsg = getTextFromElement(By.className("result"));
        //text msg as requirement
        String expectedMsg = loadProp.getProperty("ExpectedMsg");
        //comparing actual and expected
        Assert.assertEquals(actualMsg, expectedMsg, "Wrong massage display");
        // Locate the container or element that holds all the comments
        WebElement commentsContainer = driver.findElement(By.className("comment-list"));
        // Find the last comment element within the container
        WebElement lastComment = commentsContainer.findElement(By.xpath("//div[@class='comment-list']/div[2]/div[4]"));
        //to Store last Comment
        String lastCommentText = lastComment.getText();
        // Add a new comment (code to add a new comment goes here)
        //locate the last comment after adding the new comment
        WebElement newLastComment = commentsContainer.findElement(By.xpath("//div[@class='comment-list']/div[2]/div[4]"));
        //Storing new last comment
        String newLastCommentText = newLastComment.getText();
        // Compare the text or content of the last comment before and after adding the new comment
        if (lastCommentText.equals(newLastCommentText)) {
            System.out.println("New comment is shown at the last position.");
        } else {
            System.out.println("New comment is not shown at the last position.");
        }
    }
}
