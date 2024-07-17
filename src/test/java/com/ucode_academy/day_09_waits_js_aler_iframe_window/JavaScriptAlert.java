package com.ucode_academy.day_09_waits_js_aler_iframe_window;

import com.ucode_academy.util.Wait;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptAlert {

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
    public void jsAlert(){
        driver.get("https://www.practice-ucodeacademy.com/javascript_alerts");

        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));

        jsAlert.click();
        Wait.waitForGivenTime(3);
        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.dismiss();
        //alert.accept();

    }
}
