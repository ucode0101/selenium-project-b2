package com.ucode_academy.day_09_explicit_wait_js_alert;

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

public class ExplicitWaitToBeClickable {
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
    public void testToBeClickable() throws InterruptedException {
        driver.get("https://only-testing-blog.blogspot.com/2013/11/new-test.html?");

        WebElement submit = driver.findElement(By.cssSelector("input#submitButton"));

        System.out.println(submit.isEnabled());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
        wait.until(ExpectedConditions.elementToBeClickable(submit));
        submit.click();




        // locate the same element again
        WebElement submit2 = driver.findElement(By.cssSelector("input#submitButton"));

        wait.until(ExpectedConditions.elementToBeClickable(submit2)).click();


        Thread.sleep(5000);


    }
}
