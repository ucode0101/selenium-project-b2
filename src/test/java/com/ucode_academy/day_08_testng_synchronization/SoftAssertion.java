package com.ucode_academy.day_08_testng_synchronization;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

    @Test
    public void test1(){
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(10 == 200);
        System.out.println("Hello");

        softAssert.fail();
        System.out.println("Hello again");
        softAssert.assertAll(); // -> it will show the result of our assertion
    }
}
