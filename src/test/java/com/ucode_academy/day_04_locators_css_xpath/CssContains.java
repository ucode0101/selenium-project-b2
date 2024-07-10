package com.ucode_academy.day_04_locators_css_xpath;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssContains extends TestBase {
    public static void main(String[] args) {

        setUp();
        driver.get("https://www.practice-ucodeacademy.com/dynamic_content");

        Wait.waitForGivenTime(3);

        WebElement image = driver.findElement(By.cssSelector("img[src*='jpg']"));

        image.click();
        driver.quit();

    }
}
