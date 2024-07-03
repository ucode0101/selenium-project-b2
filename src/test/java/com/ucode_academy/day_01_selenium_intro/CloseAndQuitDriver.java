package com.ucode_academy.day_01_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuitDriver {
    public static void main(String[] args) throws Exception {

        // create driver instance
        WebDriver driver = new ChromeDriver();

        // load/open/navigate url in chrome-browser
        driver.get("https://www.practice-ucodeacademy.com/");

        // maximize the browser window
        driver.manage().window().maximize();

        Thread.sleep(5000);

        // close the current browser/tab - doesn't end the WebDriver session
        //driver.close();

        // wait 2 seconds
        //Thread.sleep(2000);

        // let's try to navigate to some url to see what happens after using close();
        //driver.navigate().to("https://www.practice-ucodeacademy.com/");


        // quit all browser/tabs that was opened and end the WebDriver session
        // We will be using driver.quit() mostly whenever we are done with our testing

        driver.quit();



    }
}
