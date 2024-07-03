package com.ucode_academy.day_01_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlAndPageSource {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.practice-ucodeacademy.com/");

        String currentUrl = driver.getCurrentUrl();

        String pageSource = driver.getPageSource();
        System.out.println("Current page URL: "+ currentUrl);

        System.out.println("=======================================");

        System.out.println("Page source: "+ pageSource);

    }
}
