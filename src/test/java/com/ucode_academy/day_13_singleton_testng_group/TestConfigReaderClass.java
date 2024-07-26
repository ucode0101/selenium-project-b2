package com.ucode_academy.day_13_singleton_testng_group;

import com.ucode_academy.util.ConfigReader;
import org.testng.annotations.Test;

public class TestConfigReaderClass {

    @Test
    public void testConfigReaderClass(){

        String str = ConfigReader.getProperty("browser");
        System.out.println("==========================");

        System.out.println(str);
    }
}
