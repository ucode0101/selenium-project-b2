package com.ucode_academy.day_11_windows_js_exector_upload_actions;

import com.ucode_academy.base.TestBase2;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows extends TestBase2 {

    @Test
    public void multipleWindow(){
        driver.get("https://www.practice-ucodeacademy.com/windows");

        String mainWindowHandle = driver.getWindowHandle();

        WebElement clickHereButton = driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickHereButton.click();

        // Open following website in new tabs using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("window.open('https://www.google.com/','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://www.facebook.com/','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://www.amazon.com/','_blank');");

        Set<String> allWindowHandles = driver.getWindowHandles();

        System.out.println(allWindowHandles);

        Wait.waitForGivenTime(2);

        // Loop through tabs and print the title of each page

        for (String eachTab : allWindowHandles){
            driver.switchTo().window(eachTab);
            Wait.waitForGivenTime(2);
            System.out.println(driver.getTitle());

            // switch to google
            if (driver.getTitle().contains("Google")){
                break;
            }

        }


        // search something in google

        WebElement searchBox = driver.findElement(By.xpath("//textarea[@name='q']"));

        searchBox.sendKeys("SDET"+ Keys.ENTER);

        System.out.println(driver.getTitle());

        Wait.waitForGivenTime(3);

        // switch back to the mainPage/mainWindow
        driver.switchTo().window(mainWindowHandle);

        System.out.println(driver.getTitle());

        Wait.waitForGivenTime(4);

    }
}
