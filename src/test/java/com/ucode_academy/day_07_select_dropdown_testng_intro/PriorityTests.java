package com.ucode_academy.day_07_select_dropdown_testng_intro;

import org.testng.annotations.Test;

public class PriorityTests {

    @Test(priority = 1)
    public void xyz(){
        System.out.println("Login to the application...");
    }

    @Test(priority = 2)
    public void test2(){
        System.out.println("Buying something");
    }

    @Test(priority = 3)
    public void test1(){
        System.out.println("Login out of the application");
    }
}
