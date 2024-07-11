package com.ucode_academy.day_05_xpath_checkbox_radio;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPathContains extends TestBase {
    public static void main(String[] args) {


        setUp();

        driver.get("https://www.practice-ucodeacademy.com/");

        // locate web element using xpath contains and click on it
        driver.findElement(By.xpath("//a[contains(text(),'Challenging' )]")).click();

        // locate dynamic web element using xpath contains
        WebElement button1 = driver.findElement(By.xpath("//a[contains(@id,'4ef972c32d1b' )][1]"));

        button1.click();
        Wait.waitForGivenTime(2);

        // locate dynamic web element using xpath ends-with
        WebElement button2 = driver.findElement(By.xpath("//a[contains(@id,'4ef972c32d1b')][2]"));
        button2.click();
        Wait.waitForGivenTime(2);

        WebElement button3 = driver.findElement(By.xpath("//a[contains(@id,'4ef972c32d1b')][3]"));

        button3.click();
        Wait.waitForGivenTime(4);

        driver.quit();



    }
}
