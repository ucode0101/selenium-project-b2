package com.ucode_academy.day_08_testng_synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ImplicitWait {
    public WebDriver driver;
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
    public void testImplicitWait(){

        // implicit wait set up
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.practice-ucodeacademy.com/dynamic_loading/3");

        WebElement usernameInput = driver.findElement(By.cssSelector("input#username"));
        usernameInput.sendKeys("tomsmith");

        WebElement passwordInput = driver.findElement(By.cssSelector("input#pwd"));

        passwordInput.sendKeys("SuperSecretPassword!");

        WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));

        submitButton.click();
        //submitButton.submit();

        String expectedResult = "You logged into a secure area!";

        String actualResult = driver.findElement(By.cssSelector("div#flash")).getText();


        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
