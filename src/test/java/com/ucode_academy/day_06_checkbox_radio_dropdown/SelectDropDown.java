package com.ucode_academy.day_06_checkbox_radio_dropdown;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown extends TestBase {
    public static void main(String[] args) {
        setUp();

        driver.get("https://www.practice-ucodeacademy.com/dropdown");

        // locate select drop and store
        WebElement simpleDropDown = driver.findElement(By.id("dropdown"));
        Select select = new Select(simpleDropDown); // pass located dropdown in the constructor

        // select by visible text
        select.selectByVisibleText("Option 1"); // selects Option 1

        Wait.waitForGivenTime(4);

        // select Option 2 by index
        select.selectByIndex(2); // selects Option 2

        Wait.waitForGivenTime(4);

        // select Option 1 by value
        select.selectByValue("1"); // select Option 1

        Wait.waitForGivenTime(5);

        driver.quit();





    }
}
