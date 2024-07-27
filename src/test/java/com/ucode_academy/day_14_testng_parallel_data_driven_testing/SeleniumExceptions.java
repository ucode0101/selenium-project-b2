package com.ucode_academy.day_14_testng_parallel_data_driven_testing;

import com.ucode_academy.util.ConfigReader;
import com.ucode_academy.util.Driver;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SeleniumExceptions {

    @Test
    public void testExceptions(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        // org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element:
       // WebElement elm = Driver.getDriver().findElement(By.xpath("//div[@class='some invalid']"));

        // try to switch to window/tab using some invalid windowHandle

        //String invalidWindowHandle ="34556invalJUYYldkjf"; // invalid windowHandle

        // org.openqa.selenium.NoSuchWindowException: no such window
        //Driver.getDriver().switchTo().window(invalidWindowHandle);

        // NoSuchFrameException, try to switch to invalid frame
        //Driver.getDriver().switchTo().frame(8787);

        // try to switch to alert that is not present
        //Driver.getDriver().switchTo().alert().accept();

        //StaleElementReferenceException
        WebElement elm = Driver.getDriver().findElement(By.xpath("//a[text()='A/B Testing']"));

        // Refresh the page
        Driver.getDriver().navigate().refresh();

        // try to click after the page is refreshed
        elm.click();



        Wait.waitForGivenTime(3);
        Driver.quitDriver();




    }
}
