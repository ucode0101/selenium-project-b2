package com.ucode_academy.day_06_checkbox_radio_dropdown;
import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class IsEnabled extends TestBase {
    public static void main(String[] args) {
        setUp();
        driver.get("https://www.practice-ucodeacademy.com/checkboxes");

        WebElement box1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));

        WebElement box2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));

        WebElement box3 = driver.findElement(By.xpath("//input[@type='checkbox'][3]"));

        // if the checkbox is enabled select/check
        System.out.println(box1.isEnabled()); // true
        System.out.println(box2.isEnabled()); // true
        System.out.println(box3.isEnabled()); // false


        if(box1.isEnabled()){
            box1.click();
        } else {
            System.out.println("Checkbox 1 is not enabled");
        }
        if (box3.isEnabled()){
            box3.click();
        } else {
            System.out.println("checkbox 3 is Not enabled, it is disabled");
        }

        Wait.waitForGivenTime(2);

        driver.navigate().to("https://www.practice-ucodeacademy.com/radio_buttons");
        //driver.get("https://www.practice-ucodeacademy.com/radio_buttons");

        Wait.waitForGivenTime(2);

        // locate all radio button and store them in List of Web elements
        // loop through and check if radio button is enabled or not
        List<WebElement> radioButtons = driver.findElements(By.cssSelector("div.radio>input"));

        System.out.println("Total radio buttons: "+ radioButtons.size());

        for(WebElement each : radioButtons){
            System.out.println(each.isEnabled());
        }

        Wait.waitForGivenTime(4);

        // lets locate a disabled radio button

        driver.quit();
    }
}
