package com.ucode_academy.day_11_windows_js_exector_upload_actions;

import com.ucode_academy.base.TestBase2;
import com.ucode_academy.util.Wait;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SendKeysAndEnter extends TestBase2 {

    @Test
    public void googleSearch(){
        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.xpath("//textarea[@name='q']"));
        searchBox.sendKeys("java" + Keys.BACK_SPACE);

        Wait.waitForGivenTime(3);

        searchBox.sendKeys("testing" + Keys.CLEAR);

        Wait.waitForGivenTime(2);

        searchBox.click(); // this method clears the input

        searchBox.sendKeys("java"+ Keys.ENTER);



        Wait.waitForGivenTime(4);



    }
}
