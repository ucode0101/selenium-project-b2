package com.ucode_academy.day_03_locators_css_selector;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelectorPractice extends TestBase {
    public static void main(String[] args) {

        setUp();
        driver.get("https://www.practice-ucodeacademy.com/multiple_buttons");

        Wait.waitForGivenTime(2);

        // locate button 1
        WebElement btn1 = driver.findElement(By.cssSelector("button[onclick='button1()']"));

        btn1.click();
        Wait.waitForGivenTime(2);

        // locate result message
        //WebElement result = driver.findElement(By.id("result")); // by ID
        //WebElement result = driver.findElement(By.cssSelector("p#result")); // css selector by id
        WebElement result = driver.findElement(By.cssSelector("p[id='result']")); // css selector by tagName & Attribute

        System.out.println(result.getText());
        Wait.waitForGivenTime(3);

        // we will locate web element and interact/perform some action without storing it

        // locate button 2 and click on
         driver.findElement(By.cssSelector("button[onclick='button2()']")).click();

         // locate result message and get its text & store in String
        String s = driver.findElement(By.id("result")).getText();
        System.out.println(s);

        // locate result message and print its text directly
        System.out.println(driver.findElement(By.id("result")).getText());

        Wait.waitForGivenTime(2);
        driver.quit();

    }
}
