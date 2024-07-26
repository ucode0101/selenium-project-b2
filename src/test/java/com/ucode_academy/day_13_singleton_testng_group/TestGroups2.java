package com.ucode_academy.day_13_singleton_testng_group;

import com.ucode_academy.util.ConfigReader;
import com.ucode_academy.util.Driver;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGroups2 {

    @Test(groups = "test1")
    public void testPracticeUcode(){
        String url = ConfigReader.getProperty("url");

        Driver.getDriver().get(url);

        Wait.waitForGivenTime(1);

        Driver.quitDriver();

    }

    @Test(groups = "test1")
    public void testUnexTech(){

        Driver.getDriver().get(ConfigReader.getProperty("unextech.url"));

        Wait.waitForGivenTime(1);

        Driver.quitDriver();

    }

    @Test(groups = "test1")
    public void testFacebook(){

        Driver.getDriver().get(ConfigReader.getProperty("facebook.url"));
        WebElement elm = Driver.getDriver().findElement(By.cssSelector("test"));

        Wait.waitForGivenTime(1);
        Driver.quitDriver();
    }
}
