package com.ucode_academy.day_03_locators_and_methods;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByTagName extends TestBase {

    public static void main(String[] args) {

        setUp(); // this is a custom method that comes from TestBase class
       driver.get("https://www.practice-ucodeacademy.com/");


        Wait.waitForGivenTime(3); // using custom wait method

        // locate web element by tag name
        WebElement tagName = driver.findElement(By.tagName("li"));

        System.out.println(tagName.getText());

        Wait.waitForGivenTime(3); // using custom wait method
       driver.quit();


    }

}
