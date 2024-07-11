package com.ucode_academy.day_05_xpath_checkbox_radio;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPathContains2 extends TestBase {
    public static void main(String[] args) {
        setUp();
        driver.get("https://www.practice-ucodeacademy.com/");

        driver.findElement(By.xpath("//a[contains(text(),'UI')]")).click();

        WebElement txt = driver.findElement(By.xpath("//h3[contains(text(),'JQueryUI')]"));
        System.out.println(txt.getText());

        Wait.waitForGivenTime(3);

        driver.quit();
    }
}
