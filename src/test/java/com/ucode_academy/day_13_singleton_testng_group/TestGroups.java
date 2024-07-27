package com.ucode_academy.day_13_singleton_testng_group;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGroups {

    @Test(groups = "smokeTest")
    public void test1(){
        System.out.println("Test 1");
    }

    @Test(groups = "smokeTest")
    public void test2(){
        System.out.println("Test 2");
    }

    @Test(groups = "smokeTest")
    public void test3(){
        System.out.println("Test 3");
    }

    @Test(groups = "smokeTest")
    public void test4(){
        System.out.println("Test 4");
    }

    @Test(groups = "smokeTest2")
    public void test5(){
        System.out.println("Test 5");
    }

    @Test(groups = "smokeTest2")
    public void test6(){
        System.out.println("Test 6");
    }

}
