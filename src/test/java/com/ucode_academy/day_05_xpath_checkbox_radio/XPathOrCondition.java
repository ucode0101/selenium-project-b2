package com.ucode_academy.day_05_xpath_checkbox_radio;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPathOrCondition extends TestBase {

    public static void main(String[] args) {

        setUp();
        driver.get("https://www.practice-ucodeacademy.com/");

        // locate web element using OR condition
        WebElement form = driver.findElement(By.xpath("//a[text()='Form Authentication' or @href='/login']"));

        form.click();

        WebElement input1 = driver.findElement(By.xpath("//input[@id='username' or @name='username']"));
        input1.sendKeys("tomsmith");

        WebElement input2 = driver.findElement(By.xpath("//input[@id='password' or @name='password']"));
        input2.sendKeys("SuperSecretPassword!");

        driver.findElement(By.xpath("//button[@class='radius' or @type='submit']")).click();

        Wait.waitForGivenTime(3);

        driver.quit();

    }
}
