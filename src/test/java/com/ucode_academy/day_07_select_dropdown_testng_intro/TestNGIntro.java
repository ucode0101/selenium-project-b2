package com.ucode_academy.day_07_select_dropdown_testng_intro;

import org.testng.annotations.*;

public class TestNGIntro {

    // this will run before each test method
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I run before each test method");
    }

    // this will run after each test method
    @AfterMethod
    public void afterMethod(){
        System.out.println("I run after each test method");
    }

    // this will run before class (before all methods in the class)
    @BeforeClass
    public void beforeClass(){
        System.out.println("I run before the class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("I run after the class");
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
