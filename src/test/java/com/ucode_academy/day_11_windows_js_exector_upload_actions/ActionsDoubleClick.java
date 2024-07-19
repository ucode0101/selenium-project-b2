package com.ucode_academy.day_11_windows_js_exector_upload_actions;

import com.ucode_academy.base.TestBase2;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsDoubleClick extends TestBase2 {

    @Test
    public void doubleClick(){
        driver.get("https://demoqa.com/buttons");
        Actions actions = new Actions(driver);

        WebElement button = driver.findElement(By.id("doubleClickBtn"));

        actions.doubleClick(button).perform();
        Wait.waitForGivenTime(3);

        // print the message after double-clicking on element (button)
                                         // ID value -> doubleClickMessage
        System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());

        Wait.waitForGivenTime(4);
    }
}
