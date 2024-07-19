package com.ucode_academy.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    // we will change/update it when we cover TestNG
    // when we start TestNG
    public static WebDriver driver;


    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    public static void tearDown(){
        driver.quit();
    }




}
