package com.ucode_academy.day_11_windows_js_exector_upload_actions;

import com.ucode_academy.base.TestBase2;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsContextClick extends TestBase2 {


    @Test
    public void rightClick(){
        driver.get("https://www.practice-ucodeacademy.com/context_menu");

        // locate the web element where you want to right-click
        WebElement box = driver.findElement(By.id("hot-spot"));

        // Create an object of Actions class
        Actions actions = new Actions(driver);

        // until Selenium 3
        //actions.contextClick(box).build().perform();

        actions.contextClick(box).perform();


        Wait.waitForGivenTime(2);

        // directly switch to alert and handle it
        driver.switchTo().alert().accept();

        Wait.waitForGivenTime(5);




    }
}
