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

public class ExplicitWaitVisibilityOf {

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
    public void visibilityOf(){
        driver.get("https://www.practice-ucodeacademy.com/dynamic_loading/2");

        WebElement start = driver.findElement(By.xpath("//button[text()='Start']"));

        start.click();

        //WebElement result = driver.findElement(By.cssSelector("div#finish>h4"));
        //System.out.println(result.getText());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // it will throw NoSuchElementException because the element will be present after clicking on Start button
        // it works for web element that is present/available but not visible/displayed on the page
       // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div#finish>h4"))));


       wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#finish>h4")));

        String result = driver.findElement(By.cssSelector("div#finish>h4")).getText();
        System.out.println(result);

    }
}
