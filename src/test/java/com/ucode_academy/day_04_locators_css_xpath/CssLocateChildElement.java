package com.ucode_academy.day_04_locators_css_xpath;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssLocateChildElement extends TestBase {
    public static void main(String[] args) {
        setUp();
        driver.get("https://www.practice-ucodeacademy.com/multiple_buttons");

        Wait.waitForGivenTime(3);

        // Go to child element
        WebElement h3 = driver.findElement(By.cssSelector("div>div>h3"));
        System.out.println(h3.getText());

        // go to any child element

        WebElement p = driver.findElement(By.cssSelector("div p"));
        System.out.println(p.getText());

        Wait.waitForGivenTime(2);

        driver.quit();

    }
}
