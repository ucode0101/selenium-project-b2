package com.ucode_academy.day_11_windows_js_exector_upload_actions;

import com.ucode_academy.base.TestBase2;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsDragAndDrop extends TestBase2 {

    @Test
    public void dragAndDrop(){
        driver.get("https://www.practice-ucodeacademy.com/drag_and_drop");

        WebElement boxA = driver.findElement(By.id("column-a"));

        WebElement boxB = driver.findElement(By.id("column-b"));

        Wait.waitForGivenTime(2);
        Actions actions = new Actions(driver);

        actions.dragAndDrop(boxA, boxB).perform();

        Wait.waitForGivenTime(3);

        WebElement smallCircle = driver.findElement(By.cssSelector("div#draggable"));

        WebElement bigCircle = driver.findElement(By.id("droptarget"));

        actions.dragAndDrop(smallCircle, bigCircle).perform();

        Wait.waitForGivenTime(2);

        // print the success message from big circle
        System.out.println(driver.findElement(By.id("droptarget")).getText());

        // feel free to use Assertion to verify the text from big circle


        Wait.waitForGivenTime(4);



    }
}
