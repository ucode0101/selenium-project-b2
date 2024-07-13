package com.ucode_academy.day_06_checkbox_radio_dropdown;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkboxes extends TestBase {
    public static void main(String[] args) {

        // Go to checkboxes page and select checkbox 1 and 2
        setUp();

        driver.get("https://www.practice-ucodeacademy.com/checkboxes");

        // locate checkbox 1 and select/check them if they are not already selected

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));

        //checkbox1.click();
        // store the boolean result of isSelected() in a boolean variable
        boolean isSelected = checkbox1.isSelected();
        if (!isSelected){
            checkbox1.click();
        } else {
            System.out.println("Checkbox 1 is already selected");
        }



        Wait.waitForGivenTime(3);

        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
       // checkbox2.click();

        if(!checkbox2.isSelected()){
            checkbox2.click();
        } else {
            System.out.println("Checkbox 2 is already selected");
        }

        Wait.waitForGivenTime(6);
        driver.quit();
    }
}
