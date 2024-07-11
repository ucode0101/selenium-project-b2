package com.ucode_academy.day_05_xpath_checkbox_radio;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPathBackwardAndForward extends TestBase {
    public static void main(String[] args) {
        setUp();
        driver.get("https://www.practice-ucodeacademy.com/");

        // locate one child element go up to parent and go down to locate another child element
        WebElement element = driver.findElement(By.xpath("//li/a[text()='Context Menu']/../../li/a[@href='/checkboxes']"));

        element.click();
        Wait.waitForGivenTime(3);

        driver.quit();
    }
}
