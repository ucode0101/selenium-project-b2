package com.ucode_academy.day_04_locators_css_xpath;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocateByXPathVisibleTest extends TestBase {
    public static void main(String[] args) {

        setUp();
        driver.get("https://www.practice-ucodeacademy.com/");

        // locate multiple button link
        WebElement multiButton = driver.findElement(By.xpath("//a[text()='Multiple Buttons']"));
        multiButton.click();

        // You can replace text() with dot (.)
        //WebElement multiButton = driver.findElement(By.xpath("//a[.='Multiple Buttons']"));

        WebElement button4 = driver.findElement(By.xpath("//button[text()='Button 4']"));
        button4.click();

        // locate result message for button 4

        WebElement result = driver.findElement(By.xpath("//p[text()='Clicked on button four!']"));
        System.out.println(result.getText());

        Wait.waitForGivenTime(3);
        driver.quit();
    }
}
