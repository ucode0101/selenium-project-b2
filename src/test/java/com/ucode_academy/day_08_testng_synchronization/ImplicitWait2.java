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

public class ImplicitWait2 {

    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testImplicitWait(){
        driver.get("https://www.practice-ucodeacademy.com/dynamic_loading/2");

        // locate and click on Start button
        WebElement start = driver.findElement(By.xpath("//button[text()='Start']"));
        start.click();

        WebElement msg = driver.findElement(By.cssSelector("div#finish>h4"));
        String actualMessage = msg.getText();
        String expectedMessage = "Hello World!";

        Assert.assertEquals(actualMessage, expectedMessage, "Test failed! did not match");

        System.out.println(actualMessage);


    }
}
