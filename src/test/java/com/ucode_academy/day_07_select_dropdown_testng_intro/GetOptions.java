package com.ucode_academy.day_07_select_dropdown_testng_intro;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GetOptions extends TestBase {
    public static void main(String[] args) {
        setUp();
        driver.get("https://www.practice-ucodeacademy.com/dropdown");
        // locate and store all state options in list of web element
        // loop through and print each state name

        WebElement stateDropdown = driver.findElement(By.cssSelector("select#state"));

        Select select = new Select(stateDropdown);
        List<WebElement> allStateOptions = select.getOptions();

        System.out.println("Count of States: "+allStateOptions.size());

        for (WebElement eachOption : allStateOptions){

            // select each option/state and print its name
            select.selectByVisibleText(eachOption.getText());
            System.out.println(eachOption.getText());
            Wait.waitForGivenTime(1);
        }

        Wait.waitForGivenTime(2);
        driver.quit();



    }
}
