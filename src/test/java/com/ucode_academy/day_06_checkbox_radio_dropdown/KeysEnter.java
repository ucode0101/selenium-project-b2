package com.ucode_academy.day_06_checkbox_radio_dropdown;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class KeysEnter extends TestBase {
    public static void main(String[] args) {
        setUp();
        driver.get("https://www.google.com/");


        // enter something in the search box and hit enter to search

        WebElement searchBox = driver.findElement(By.xpath("//textarea[@name='q']"));

        searchBox.sendKeys("java"+ Keys.ENTER); // like hitting enter key on keyboard

        Wait.waitForGivenTime(7);
        driver.quit();


    }
}
