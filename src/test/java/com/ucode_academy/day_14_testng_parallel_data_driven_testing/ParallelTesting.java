package com.ucode_academy.day_14_testng_parallel_data_driven_testing;

import com.ucode_academy.util.ConfigReader;
import com.ucode_academy.util.Driver;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ParallelTesting {

    @Test(groups = "dailyTest")
    public void test1(){

        Driver.getDriver().get(ConfigReader.getProperty("amazon.url"));

        Wait.waitForGivenTime(5);

        Driver.quitDriver();
    }

    @Test(groups = "dailyTest")
    public void test2(){
        Driver.getDriver().get(ConfigReader.getProperty("facebook.url"));

        Wait.waitForGivenTime(5);

        Driver.quitDriver();
    }

    @Test(groups = "dailyTest")
    public void test3(){
        Driver.getDriver().get(ConfigReader.getProperty("unextech.url"));

        Wait.waitForGivenTime(5);
        Driver.quitDriver();
    }

    @Test(groups = "dailyTest")
    public void test4(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Wait.waitForGivenTime(5);

        Driver.quitDriver();
    }
}
