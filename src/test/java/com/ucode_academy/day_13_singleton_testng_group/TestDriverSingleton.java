package com.ucode_academy.day_13_singleton_testng_group;

import com.ucode_academy.util.ConfigReader;
import com.ucode_academy.util.Driver;
import com.ucode_academy.util.Wait;
import org.testng.annotations.Test;

public class TestDriverSingleton {

    @Test
    public void testDriverSingleton(){

        // get the url from configuration.properties file
        String url = ConfigReader.getProperty("url");

        //Driver.getDriver().get(url); // -> driver.get()

        // or you can this way
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        String title = Driver.getDriver().getTitle();
        System.out.println(title);


        Wait.waitForGivenTime(7);

        Driver.quitDriver();

    }
}
