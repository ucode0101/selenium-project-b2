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

public class IframeIntro {

    WebDriver driver;

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
    public void testIframe(){
        driver.get("https://www.practice-ucodeacademy.com/iframe");

        // 1. locate the iframe as Web element and switch the driver to iframe
        //WebElement iframe = driver.findElement(By.cssSelector("iframe#mce_0_ifr"));
        //driver.switchTo().frame(iframe);

        // 2. Switch to iframe by frame index
        //driver.switchTo().frame(0);

        // 3. Switch to iframe by ID
        driver.switchTo().frame("mce_0_ifr");




        WebElement inputBox = driver.findElement(By.id("tinymce"));

        inputBox.clear(); // -> deleting/clearing any input/text from the input box

        Wait.waitForGivenTime(2);

        inputBox.sendKeys("testing iframe");



        Wait.waitForGivenTime(2);

        // We need to switch back to parent frame
        driver.switchTo().parentFrame();

        WebElement pageFooter = driver.findElement(By.id("page-footer"));
        System.out.println(pageFooter.getText());

    }




}
