package com.ucode_academy.day_09_explicit_wait_js_alert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaitTitleIs {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void waitForTitle(){
        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.cssSelector("textarea[name='q']"));

        searchBox.sendKeys("java" + Keys.ENTER);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // it will wait max up to 10 seconds for the title
        //wait.until(ExpectedConditions.titleIs("java - Google Search"));

        // it will wait max up to 10 seconds for the title to contain given string
        wait.until(ExpectedConditions.titleContains("java"));



        String title = driver.getTitle();
        System.out.println(title);

    }
}
