package com.ucode_academy.day_12_keyboard_actions_js_singleton;

import com.ucode_academy.base.TestBase2;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutorHiddenElement extends TestBase2 {

    @Test
    public void javaScriptExecutor(){
        driver.get("https://www.practice-ucodeacademy.com/dynamic_loading/1");

        WebElement message = driver.findElement(By.xpath("//div[@id='finish']/h4"));

        // System.out.println(message.getText()); // it will print empty string

        // explicitly cast WebDriver type to JavaScriptExecutor type
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // use JavaScriptExecutor to get hidden web element's text

        String txt = js.executeScript("return arguments[0].innerHTML;", message).toString();

        System.out.println(txt);


        Wait.waitForGivenTime(3);
    }
}
