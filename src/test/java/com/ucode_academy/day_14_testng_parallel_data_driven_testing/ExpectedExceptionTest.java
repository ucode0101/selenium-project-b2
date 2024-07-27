package com.ucode_academy.day_14_testng_parallel_data_driven_testing;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {

    // we are telling TestNG that we are expecting ArithmeticException
    // so ignore that exception/not fail when it happens
    @Test(expectedExceptions = ArithmeticException.class)
    public void test1(){
        System.out.println(66 / 0);

    }
}
