package com.ucode_academy.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    // Create private constructor to prevent creating an object form this class
    // This what makes it singleton

    private Driver(){

    }

    private static WebDriver driver;

    // getDriver -> public getter method
   public static WebDriver getDriver(){
       if (driver == null){

           // getting the browser from configuration.properties
           String browserName = ConfigReader.getProperty("browser");
           // convert the browser name to lower case
           browserName = browserName.toLowerCase();

           switch (browserName){
               case "chrome":
                   driver = new ChromeDriver();
                   break;
               case "firefox":
                   driver = new FirefoxDriver();
                   break;
               case "safari":
                   driver = new SafariDriver();
                   break;
               case "chrome-headless": // to run tests in headless mode in chrome
                   ChromeOptions options = new ChromeOptions();
                   options.addArguments("--headless");
                   driver = new ChromeDriver(options);
                   break;
               default:
                   throw new RuntimeException("Invalid browser name");

           }

           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


       }

       return driver;

   }

   public static void quitDriver(){

       if (driver != null){
           driver.quit();
           driver = null;
       }

   }


}
