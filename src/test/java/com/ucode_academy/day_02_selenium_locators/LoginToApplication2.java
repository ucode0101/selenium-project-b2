package com.ucode_academy.day_02_selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToApplication2 {
    public static void main(String[] args) throws Exception {
        String url = "https://www.practice-ucodeacademy.com/";


        WebDriver driver = new ChromeDriver();

        driver.get(url);

        driver.manage().window().maximize();
        Thread.sleep(2000);

        // locate web element by link text
        WebElement formAuth = driver.findElement(By.linkText("Form Authentication"));

        // click on form authentication link
        formAuth.click();
        Thread.sleep(2000);

        //get current url
        String currentUrl = driver.getCurrentUrl();

        // verify that you are on login page or not
        if (currentUrl.endsWith("login")){
            System.out.println("You are on login page");
        } else {
            System.out.println("You are Not on login page");
        }

        // locate username input box
        WebElement usernameInput = driver.findElement(By.name("username"));

        // locate password input box
        WebElement pwdInput = driver.findElement(By.id("password"));

        // locate login button
        WebElement loginBtn = driver.findElement(By.className("radius"));

        // enter username
        usernameInput.sendKeys("tomsmith");

        Thread.sleep(2000);

        // enter password
        pwdInput.sendKeys("SuperSecretPassword!");

        Thread.sleep(2000);

        // click on login button
        loginBtn.click();

        Thread.sleep(3000);

        // verify that you are logged in

        // locate success message after login
        WebElement message = driver.findElement(By.id("flash"));

        // get the text of success message
        String txt = message.getText();

        // verify that success message contain expected message
        if (txt.contains("You logged")){
            System.out.println("You logged in successfully");
        } else {
            System.out.println("Login failed");
        }

        Thread.sleep(4000);

        // locate log out button
        WebElement logoutBtn = driver.findElement(By.cssSelector(".button.secondary.radius"));
        // we are using cssSelector to locate, because class has space in its values, it would
        // throw an exception using by class name.


        // click on log out button to log out
        logoutBtn.click();

        Thread.sleep(7000);

        driver.quit();



    }
}
