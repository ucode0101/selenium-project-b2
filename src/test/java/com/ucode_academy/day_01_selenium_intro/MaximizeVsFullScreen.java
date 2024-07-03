package com.ucode_academy.day_01_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeVsFullScreen {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.practice-ucodeacademy.com/");

        Thread.sleep(5000);

        // full-screen mode window
        //driver.manage().window().fullscreen();

        // maximize the window
        driver.manage().window().maximize();

        Thread.sleep(7000);
        driver.quit();
    }
}
