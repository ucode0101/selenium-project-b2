package com.ucode_academy.day_12_keyboard_actions_js_singleton;

import com.ucode_academy.base.TestBase2;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsDoubleClick extends TestBase2 {

    @Test
    public void doubleClick(){

        driver.get("https://www.practice-ucodeacademy.com/double_click");

        WebElement box = driver.findElement(By.id("hot-spot"));

        Actions actions = new Actions(driver);

        actions.doubleClick(box).perform();

        Wait.waitForGivenTime(2);

        driver.switchTo().alert().accept();

        Wait.waitForGivenTime(3);

        WebElement button = driver.findElement(By.id("rightClickBtn"));

        actions.doubleClick(button).perform();

        String actualMessage = driver.findElement(By.id("rightClickMessage")).getText();

        System.out.println(actualMessage);

        String expectedMessage = "You have done Double-Click";

        // assertion
        Assert.assertEquals(actualMessage,expectedMessage, "Failed");


        Wait.waitForGivenTime(6);


    }
}
