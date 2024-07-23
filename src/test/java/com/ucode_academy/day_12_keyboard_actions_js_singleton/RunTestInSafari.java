package com.ucode_academy.day_12_keyboard_actions_js_singleton;

import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RunTestInSafari {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void loginTest(){
        driver.get("https://www.practice-ucodeacademy.com/login");

        WebElement usernameInput = driver.findElement(By.id("username"));

        WebElement passwordInput = driver.findElement(By.id("password"));

        WebElement loginButton = driver.findElement(By.cssSelector("button.radius"));

        usernameInput.sendKeys("test");

        Wait.waitForGivenTime(3);

        passwordInput.sendKeys("test123");

        Wait.waitForGivenTime(3);

        loginButton.click();

        Wait.waitForGivenTime(7);

    }
}
