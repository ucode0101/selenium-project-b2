package com.ucode_academy.day_05_xpath_checkbox_radio;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsMethod extends TestBase {
    public static void main(String[] args) {
        setUp();

        driver.get("https://www.practice-ucodeacademy.com/");

        // locate all links/web element from the home page and print their texts

        List<WebElement>  allLinks = driver.findElements(By.xpath("//div/ul/li/a"));

        // loop through each link/element and print its text

        for(WebElement eachElement : allLinks){
            System.out.println(eachElement.getText());

            // click on link if you find Form Authentication link
            if (eachElement.getText().equals("Checkboxes")){
                eachElement.click();
                Wait.waitForGivenTime(2);
                System.out.println(driver.findElement(By.xpath("//div/h3[text()='Checkboxes']")).getText());
                System.out.println("=============================");
                driver.navigate().back();

            }
        }

        Wait.waitForGivenTime(3);
        driver.quit();
    }
}
