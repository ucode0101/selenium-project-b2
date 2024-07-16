package com.ucode_academy.day_08_testng_synchronization;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion2 {

    String s1 = "java";
    String s2 = "test";


    @Test
    public void test1(){

        Assert.assertEquals(5, 15, "Test failed");
        Assert.assertEquals(s1, s2);
        System.out.println("Hello World");

    }

    @Test
    public void test2(){
        Assert.fail("Failing this test on purpose");
    }

}
