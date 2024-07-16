package com.ucode_academy.day_08_testng_synchronization;

import org.testng.annotations.Test;

public class InvocationCount {

    @Test(invocationCount = 40)
    public void test1(){
        System.out.println("Hello test 1");
    }
}
