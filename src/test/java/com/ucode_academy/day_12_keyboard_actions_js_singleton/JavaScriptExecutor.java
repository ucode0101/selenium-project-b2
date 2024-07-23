package com.ucode_academy.day_12_keyboard_actions_js_singleton;

import com.ucode_academy.base.TestBase2;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutor extends TestBase2 {

    @Test
    public void javaScriptExecutor(){

        // Click on web element using JavaScriptExecutor

        driver.get("https://www.practice-ucodeacademy.com/checkboxes");

        WebElement box1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));

        Wait.waitForGivenTime(4);

        // Explicitly casting WebDriver type to JavaScriptExecutor type
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // clicking/selecting checkbox using JavascriptExecutor
        js.executeScript("arguments[0].click();",box1);

        Wait.waitForGivenTime(5);


    }
}
