package com.ucode_academy.day_07_select_dropdown_testng_intro;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FirstTestNGTest extends TestBase {

    @Test
    public void loginToApplication1(){
        driver.get("https://www.practice-ucodeacademy.com/login");

        WebElement usernameInput = driver.findElement(By.cssSelector("input#username"));

        usernameInput.sendKeys("tomsmith");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("SuperSecretPassword!");

        WebElement loginButton = driver.findElement(By.cssSelector("button.radius"));

        //loginButton.click(); // either use click()
        loginButton.submit();  // you can use submit() since it is a form (within form tag)

        Wait.waitForGivenTime(5);
    }

    @Test
    public void loginToApplication2(){
        driver.get("https://www.practice-ucodeacademy.com/login");

        WebElement usernameInput = driver.findElement(By.cssSelector("input#username"));

        usernameInput.sendKeys("tomsmith");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("SuperSecretPassword!");

        WebElement loginButton = driver.findElement(By.cssSelector("button.radius"));

        //loginButton.click(); // either use click()
        loginButton.submit();  // you can use submit() since it is a form (within form tag)

        Wait.waitForGivenTime(5);
    }
}
