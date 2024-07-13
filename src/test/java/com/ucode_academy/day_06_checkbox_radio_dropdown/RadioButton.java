package com.ucode_academy.day_06_checkbox_radio_dropdown;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends TestBase {
    public static void main(String[] args) {
        setUp();
        driver.get("https://www.practice-ucodeacademy.com/radio_buttons");

        Wait.waitForGivenTime(3);

        // locate blue radio button and verify if it is selected or not
        WebElement blue = driver.findElement(By.cssSelector("input#blue"));

        boolean isBlueSelected = blue.isSelected();

        System.out.println("Blue radio button selected: "+ isBlueSelected);

        Wait.waitForGivenTime(3);

        // locate each radio button and selected it if it is not selected already

        WebElement red = driver.findElement(By.id("red"));

        if (!blue.isSelected()){
            blue.click();
        } else {
            System.out.println("Blue radio button is already selected");
        }
        if (!red.isSelected()){
            red.click();
        }else {
            System.out.println("Red radio button is already selected");
        }

        // Let's try to select disabled radio button

        WebElement green = driver.findElement(By.id("green"));

        green.click();

        Wait.waitForGivenTime(5);

        driver.quit();
    }
}
