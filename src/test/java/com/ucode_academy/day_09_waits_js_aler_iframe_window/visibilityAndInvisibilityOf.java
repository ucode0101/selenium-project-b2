package com.ucode_academy.day_09_waits_js_aler_iframe_window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class visibilityAndInvisibilityOf {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // implicit wait does not apply/work with Explicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void visibilityInvisibilityOf(){
        driver.get("https://www.practice-ucodeacademy.com/dynamic_loading/1");

        driver.findElement(By.xpath("//button[text()='Start']")).click();

        WebElement finish = driver.findElement(By.cssSelector("div#finish>h4"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // it waits until the finish Web element is visible/displayed on the page
       // wait.until(ExpectedConditions.visibilityOf(finish));

        WebElement loading = driver.findElement(By.cssSelector("div#loading"));

        // it waits until the loading is invisible/not displayed on the page
        wait.until(ExpectedConditions.invisibilityOf(loading));

        System.out.println(finish.getText());
    }


}
