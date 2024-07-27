package com.ucode_academy.day_14_testng_parallel_data_driven_testing;

import com.ucode_academy.util.ConfigReader;
import com.ucode_academy.util.Driver;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ExpectedExceptionTest2 {

    @Test(expectedExceptions = NoSuchElementException.class)
    public void expectedExceptionTest(){
        String url = ConfigReader.getProperty("url");
        Driver.getDriver().get(url);

        WebElement elm = Driver.getDriver().findElement(By.xpath("//div[@class='some invalid']"));

        Wait.waitForGivenTime(3);

        Driver.quitDriver();
    }
}
