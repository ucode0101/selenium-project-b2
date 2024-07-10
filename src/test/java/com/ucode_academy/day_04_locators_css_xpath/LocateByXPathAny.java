package com.ucode_academy.day_04_locators_css_xpath;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocateByXPathAny extends TestBase {
    public static void main(String[] args) {
        setUp();
        driver.get("https://www.practice-ucodeacademy.com/");

        // locate web element by XPath any Attribute with matching value
        //WebElement multiButton = driver.findElement(By.xpath("//a[@*='/multiple_buttons']"));
        //multiButton.click();

        // locate by any tag name
        WebElement multiButton = driver.findElement(By.xpath("//*[@href='/multiple_buttons']"));
        multiButton.click();

        // locate button 3 using XPath any Attribute with matching value
        //WebElement button3 = driver.findElement(By.xpath("//button[@*='button3()']"));
        //button3.click();

        // locate button 3 by any Tag name

        WebElement button3 = driver.findElement(By.xpath("//*[@onclick='button3()']"));
        button3.click();

        // locate result message By XPath with any Attribute with matching value
        //WebElement result = driver.findElement(By.xpath("//p[@*='result']"));

        //System.out.println(result.getText());

        // locate result message by any tag name
        WebElement result = driver.findElement(By.xpath("//*[@id='result']"));
        System.out.println(result.getText());

        Wait.waitForGivenTime(3);
        driver.quit();
    }
}
