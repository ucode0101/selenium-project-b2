package com.ucode_academy.day_08_testng_synchronization;

import org.testng.annotations.*;

public class TestNGAnnotations {


    @BeforeMethod
    public void before(){
        System.out.println("Before method");
    }
    @AfterMethod
    public void after(){
        System.out.println("After method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @Test
    public void test1(){
        System.out.println("Test 1");
    }

    @Test
    public void test2(){
        System.out.println("Test 2");
    }

    @Test
    public void test3(){
        System.out.println("Test 3");
    }


}
