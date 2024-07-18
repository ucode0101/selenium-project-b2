package com.ucode_academy.day_10_iframe_windows_js_executor;

import com.ucode_academy.util.Wait;
import org.openqa.selenium.Alert;
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

public class WaitForAlertPresent {

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
    public void waitForAlertPresence(){
        driver.get("https://www.practice-ucodeacademy.com/javascript_alerts");

        WebElement alertButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        alertButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // one way
//        wait.until(ExpectedConditions.alertIsPresent());
//
//        Alert alert = driver.switchTo().alert();
//        alert.accept();

        // another way, wait for alert to be present and directly accept() or dismiss it.
        wait.until(ExpectedConditions.alertIsPresent()).accept();


        Wait.waitForGivenTime(5);

    }



}
