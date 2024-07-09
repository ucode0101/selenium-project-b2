package com.ucode_academy.day_03_locators_and_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCssClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.practice-ucodeacademy.com/login");

        Thread.sleep(3000);

        // button.radius

        // locate login button using css select with class name
        WebElement loginBtn = driver.findElement(By.cssSelector("button.radius"));

        loginBtn.click();

        Thread.sleep(2000);

        WebElement footer = driver.findElement(By.cssSelector("div.large-4.large-centered.columns"));

        System.out.println(footer.getText());

        Thread.sleep(2000);
        driver.quit();
    }
}
