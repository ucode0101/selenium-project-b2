package com.ucode_academy.day_06_checkbox_radio_dropdown;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class isDisplayed extends TestBase {
    public static void main(String[] args) {
        setUp();
        driver.get("https://www.practice-ucodeacademy.com/");

        // verify if the 'powered by' is displayed in the footer

        WebElement footer = driver.findElement(By.xpath("//div[@id='page-footer']"));

        if (footer.isDisplayed()){
            System.out.println("Footer is displayed");
            System.out.println(footer.getText());
        }

        WebElement formAuth = driver.findElement(By.xpath("//a[text()='Form Authentication']"));
        if (formAuth.isDisplayed()){
           formAuth.click();
            //formAuth.submit(); // submit() does Not work here
        }else {
            System.out.println("The link is not there");
        }

        WebElement username = driver.findElement(By.id("username"));

        WebElement password = driver.findElement(By.id("password"));

        WebElement loginBtn = driver.findElement(By.cssSelector("button.radius"));

        if (username.isDisplayed()){
            System.out.println("User name field is displayed");
            username.sendKeys("tomsmith");
        } else {
            System.out.println("User name field is Not displayed");
        }

        if (password.isDisplayed()){
            System.out.println("Password field is Displayed");
            password.sendKeys("SuperSecretPassword!");
        } else {
            System.out.println("Password field is Not displayed");
        }

        if (loginBtn.isDisplayed() && loginBtn.isEnabled()){
            System.out.println("Login button is displayed and enabled");
            //loginBtn.click();
            loginBtn.submit(); // submit() method works here too
        } else {
            System.out.println("Login button is not displayed or not enabled");
        }



        Wait.waitForGivenTime(4);
        driver.quit();
    }
}
