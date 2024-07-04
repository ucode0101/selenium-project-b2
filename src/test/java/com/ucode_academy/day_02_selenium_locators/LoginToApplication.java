package com.ucode_academy.day_02_selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToApplication {
    public static void main(String[] args) throws Exception{

        // store the url in a string
        String url = "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx";

        // store username and password in String
        String username = "Tester";
        String password = "test";

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        // maximize browser window
        driver.manage().window().maximize();

        Thread.sleep(2000);

        // locate and store web element for username input
        WebElement userNameInput = driver.findElement(By.id("ctl00_MainContent_username"));

        // locate and store web element for password input
        WebElement passwordInput = driver.findElement(By.id("ctl00_MainContent_password"));

        // locate and store web element for login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));

        Thread.sleep(2000);

        // enter username
        userNameInput.sendKeys(username);

        Thread.sleep(3000);

        // enter password
        passwordInput.sendKeys(password);

        Thread.sleep(2000);

        // click on login button
        loginButton.click();

        Thread.sleep(7000);

        // quit the driver
        driver.quit();





    }
}
