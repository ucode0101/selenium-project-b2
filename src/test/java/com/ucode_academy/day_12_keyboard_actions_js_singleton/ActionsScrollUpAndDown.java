package com.ucode_academy.day_12_keyboard_actions_js_singleton;

import com.ucode_academy.base.TestBase2;
import com.ucode_academy.util.Wait;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.security.Key;

public class ActionsScrollUpAndDown extends TestBase2 {

    @Test
    public void scrollUpAndDown(){

        driver.get("https://www.amazon.com/");

        Actions actions = new Actions(driver);

        Wait.waitForGivenTime(3);
        // scroll down the page
       actions.sendKeys(Keys.PAGE_DOWN).perform();

       Wait.waitForGivenTime(2);
        // scroll up the page
        actions.sendKeys(Keys.PAGE_UP).perform();


        // scroll down the page method chaining
       // actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        // scroll down the page all the way to the end
        //actions.sendKeys(Keys.END).perform();

        Wait.waitForGivenTime(5);
    }
}
