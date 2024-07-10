package com.ucode_academy.day_04_locators_css_xpath;

import com.ucode_academy.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocateByXPath extends TestBase {
    public static void main(String[] args) {
        setUp();
        driver.get("https://www.practice-ucodeacademy.com/");

        WebElement multiBtn = driver.findElement(By.xpath("//a[@href='/multiple_buttons']"));

        multiBtn.click();

        // locate Button 1 by XPath
        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));

        button1.click();

        // locate result message by XPath

        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));

        System.out.println(result.getText());

        driver.quit();

    }
}
