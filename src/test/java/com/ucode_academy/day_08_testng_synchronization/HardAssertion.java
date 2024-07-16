package com.ucode_academy.day_08_testng_synchronization;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

    @Test
    public void test1(){
        Assert.assertTrue( 10 == 11, "Any message");
        System.out.println("Hello world");
    }

    @Test
    public void test2(){
        System.out.println("Test 2");
    }

    @Test
    public void test3(){
        Assert.assertFalse(10 == 19);
        System.out.println("Hello test 3");

    }


}
