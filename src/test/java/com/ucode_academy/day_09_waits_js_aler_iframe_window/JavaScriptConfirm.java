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

public class JavaScriptConfirm {
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
    public void jsConfirm(){
        driver.get("https://www.practice-ucodeacademy.com/javascript_alerts");

        WebElement jsConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jsConfirm.click();

        Wait.waitForGivenTime(3);

        Alert alert = driver.switchTo().alert();

        // get the alert text
        String text = alert.getText();
        System.out.println(text);
        alert.accept(); // accepting the alert/click on Ok
        //alert.dismiss(); // dismissing the alert/click on Cancel

        // or we can switch to Alert directly and Accept/dismiss
        //String s = driver.switchTo().alert().getText();
        //System.out.println(s);
        //driver.switchTo().alert().accept();
        //driver.switchTo().alert().dismiss();


    }
}
