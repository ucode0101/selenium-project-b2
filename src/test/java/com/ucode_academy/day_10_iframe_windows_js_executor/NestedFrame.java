package com.ucode_academy.day_10_iframe_windows_js_executor;

import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class NestedFrame {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void nestedFrames(){
        driver.get("https://www.practice-ucodeacademy.com/nested_frames");
        // we need to locate the top/parent frame and switch to it
        WebElement topFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));

        // switch to top/parent frame
        driver.switchTo().frame(topFrame);

        // locate child frame (left frame)
        WebElement leftFrame = driver.findElement(By.xpath("//frame[@name='frame-left']"));

        // switch to left frame
        driver.switchTo().frame(leftFrame);

        // get the text from left frame body
        String s = driver.findElement(By.tagName("body")).getText();
        System.out.println(s);

        Wait.waitForGivenTime(2);

        // switch back to parent frame (top frame), so we can switch to other child frames from there
        driver.switchTo().parentFrame();


        // locate child frame (middle frame)
        WebElement middleFrame = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
        driver.switchTo().frame(middleFrame);

        // print the text from middle frame body
        System.out.println(driver.findElement(By.xpath("//body")).getText());

        Wait.waitForGivenTime(2);


        // switch back to parent frame (top frame), so we can switch to other child frames from there
        driver.switchTo().parentFrame();

        // locate child frame (right frame)
        WebElement rightFrame  = driver.findElement(By.xpath("//frame[@name='frame-right']"));

        // switch to child frame (right frame)
        driver.switchTo().frame(rightFrame);

        // print the text from right frame body
        System.out.println(driver.findElement(By.xpath("//body")).getText());

        Wait.waitForGivenTime(3);

        // switch to parent frame
        //driver.switchTo().parentFrame();

        // switch to main frame/main page
        driver.switchTo().defaultContent();

        WebElement bottomFrame = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
        driver.switchTo().frame(bottomFrame);

        // print the text from bottom frame body
        System.out.println(driver.findElement(By.xpath("//body")).getText());

        Wait.waitForGivenTime(3);


    }
}
