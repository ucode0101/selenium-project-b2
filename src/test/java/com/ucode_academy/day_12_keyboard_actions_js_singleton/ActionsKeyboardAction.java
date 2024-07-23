package com.ucode_academy.day_12_keyboard_actions_js_singleton;

import com.ucode_academy.base.TestBase2;
import com.ucode_academy.util.Wait;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsKeyboardAction extends TestBase2 {


    @Test
    public void keyboardActions(){

        driver.get("https://www.practice-ucodeacademy.com/login");

        WebElement usernameInput = driver.findElement(By.id("username"));

        Actions actions = new Actions(driver);

        // using keyDown() to enter the username in upper case            giving a space
        actions.keyDown(Keys.SHIFT).sendKeys(usernameInput, "test").keyDown(Keys.SPACE).perform();

        // Release the SHIFT Key
        actions.keyUp(Keys.SHIFT).perform();



       usernameInput.sendKeys("test");

        Wait.waitForGivenTime(6);

    }
}
