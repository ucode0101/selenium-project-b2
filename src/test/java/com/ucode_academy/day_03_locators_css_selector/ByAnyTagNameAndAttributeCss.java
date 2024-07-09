package com.ucode_academy.day_03_locators_css_selector;

import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByAnyTagNameAndAttributeCss {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.cssSelector("textarea[title='Search']"));

        searchBox.sendKeys("java");

        Wait.waitForGivenTime(4);
        driver.quit();
    }
}
