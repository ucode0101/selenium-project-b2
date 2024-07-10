package com.ucode_academy.day_04_locators_css_xpath;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssLocateByIndex extends TestBase {

    public static void main(String[] args) {
        setUp();
        driver.get("https://www.practice-ucodeacademy.com/multiple_buttons");

        // locate and click on button 2

        WebElement button2 = driver.findElement(By.cssSelector("button[class='btn btn-primary']:nth-of-type(2)"));

        // click on button 2
        button2.click();

        // locate result message
        WebElement result = driver.findElement(By.cssSelector("p#result"));
        System.out.println(result.getText());

        // locate web element by css selector using multiple values

        // button 3
        WebElement button3 = driver.findElement(By.cssSelector("button[class='btn btn-primary'][onclick='button3()']"));

        button3.click();

        Wait.waitForGivenTime(2);

        driver.quit();
    }
}
