package com.ucode_academy.day_01_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageTitle {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.practice-ucodeacademy.com/");

        String actualTitle = driver.getTitle();

        String expectedTitle = "Practice Automation";

        System.out.println("actual title: "+ actualTitle);

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title was verified");
        } else {
            System.out.println("Title was not verified");
        }





    }
}
