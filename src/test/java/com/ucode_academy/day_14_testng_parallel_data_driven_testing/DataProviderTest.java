package com.ucode_academy.day_14_testng_parallel_data_driven_testing;

import com.ucode_academy.util.Driver;
import com.ucode_academy.util.Wait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    // To run the same test in different env/url
    // taking the data from @DataProvider (data source)
    // Ever @DataProvider method must return 2-dimensional Object Array

    @DataProvider(name = "testData1")
    public Object[][] testData(){

        Object[][] data = {
                {"https://www.practice-ucodeacademy.com/"},
                {"https://www.amazon.com/"},
                {"https://www.facebook.com/"}};

        return data;

//        return new Object[][]{
//
//                {"https://www.practice-ucodeacademy.com/"},
//                {"https://www.amazon.com/"},
//                {"https://www.facebook.com/"}}
//
//        }

    }

    @Test (dataProvider = "testData1", groups = "test1")
    public void testInMultiEnv(String url){
        Driver.getDriver().get(url);

        Wait.waitForGivenTime(5);
        Driver.quitDriver();
    }


}
