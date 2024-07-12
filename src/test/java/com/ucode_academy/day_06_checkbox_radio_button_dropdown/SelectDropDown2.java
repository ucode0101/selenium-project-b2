package com.ucode_academy.day_06_checkbox_radio_button_dropdown;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown2 extends TestBase {
    public static void main(String[] args) {
        setUp();
        driver.get("https://www.practice-ucodeacademy.com/dropdown");

        // select your date of birth from select drop-downs

        // Year select drop-down
        WebElement year = driver.findElement(By.id("year"));
        Select selectYear = new Select(year);

        WebElement month = driver.findElement(By.id("month"));
        Select selectMonth = new Select(month);


        WebElement day = driver.findElement(By.id("day"));
        Select selectDay = new Select(day);

        // select random year, month, and day
        selectYear.selectByValue("1999");
        Wait.waitForGivenTime(2);

        selectMonth.selectByVisibleText("July");
        Wait.waitForGivenTime(2);

        selectDay.selectByIndex(5);
        Wait.waitForGivenTime(6);

        driver.quit();



    }
}
