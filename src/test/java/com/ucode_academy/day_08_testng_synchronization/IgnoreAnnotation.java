package com.ucode_academy.day_08_testng_synchronization;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreAnnotation {


    //@AfterMethod if you want to run this method after each test method
    public void afterMethod(){
        System.out.println("After method");
    }

    @Test(priority = 3)
    public void test1(){
        System.out.println("Test 1");
    }

    //@Ignore this annotation is used to ignore a test from running/executing
    @Test(priority = 2)
    public void test2(){
        System.out.println("Test 2 ");
    }
    @Test(priority = 1)
    public void test3(){
        System.out.println("Test 3");
    }

}
