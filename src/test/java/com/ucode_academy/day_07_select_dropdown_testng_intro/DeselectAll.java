package com.ucode_academy.day_07_select_dropdown_testng_intro;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DeselectAll extends TestBase {
    public static void main(String[] args) {
        setUp();
        driver.get("https://www.practice-ucodeacademy.com/dropdown");

        WebElement language = driver.findElement(By.xpath("//select[@name='Languages']"));

        Select select = new Select(language);

        select.selectByValue("java");
        Wait.waitForGivenTime(1);

        select.selectByValue("js");

        Wait.waitForGivenTime(2);
        select.deselectAll();

        Wait.waitForGivenTime(1);

        List<WebElement> lang = select.getOptions();

        for (WebElement each : lang){
            select.selectByVisibleText(each.getText());
            System.out.println(each.getText());
            Wait.waitForGivenTime(1);

        }
        Wait.waitForGivenTime(2);
        select.deselectAll();

        driver.quit();


    }
}
