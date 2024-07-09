package com.ucode_academy.day_03_locators_and_methods;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;

public class CssSelectorPractice2 extends TestBase {

    public static void main(String[] args) {
        setUp();
        driver.get("https://www.practice-ucodeacademy.com/");
        //Wait.waitForGivenTime(2);

        // click on Form authentication
        driver.findElement(By.cssSelector("a[href='/login']")).click();

        // enter username
        driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith");

        // enter password
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("SuperSecretPassword!");


        // click on login button
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        Wait.waitForGivenTime(3);

        // click on log out button
        // a.button.secondary.radius -> css class and its value

        //driver.findElement(By.cssSelector(".button.secondary.radius")).click();
        driver.findElement(By.cssSelector("a[class='button secondary radius']")).click();

        Wait.waitForGivenTime(4);

        driver.quit();
    }

}
