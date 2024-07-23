package com.ucode_academy.day_12_keyboard_actions_js_singleton;

import com.ucode_academy.base.TestBase2;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutorScrollUpDown extends TestBase2 {

    @Test
    public void javaScriptExecutorScrollUpDown(){

        driver.get("https://www.amazon.com/");

        WebElement button = driver.findElement(By.cssSelector("span.navFooterBackToTopText"));

        Wait.waitForGivenTime(3);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // to scroll down to specific web element
        // in this example scroll all the down to that web element
        js.executeScript("arguments[0].scrollIntoView(true);", button);

        Wait.waitForGivenTime(3);

        WebElement dropdownOnTop = driver.findElement(By.xpath("//select[@title='Search in']"));

        js.executeScript("arguments[0].scrollIntoView(true);", dropdownOnTop);


        Wait.waitForGivenTime(3);




    }
}
