package com.ucode_academy.day_03_locators_css_selector;

import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCssID {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.practice-ucodeacademy.com/radio_buttons");

        Wait.waitForGivenTime(2);

                                                           // # is for ID attribute
        WebElement blue = driver.findElement(By.cssSelector("input#blue"));

        System.out.println(blue.getAttribute("id"));

        Wait.waitForGivenTime(3);

        driver.quit();
    }
}
