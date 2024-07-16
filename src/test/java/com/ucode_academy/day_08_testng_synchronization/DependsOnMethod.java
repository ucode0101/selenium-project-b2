package com.ucode_academy.day_08_testng_synchronization;

import org.testng.annotations.Test;

public class DependsOnMethod {

    @Test
    public void login(){
       System.out.println( 7 / 0);
        System.out.println("Hello");
    }

    // this test method run if only the login passes
    @Test(dependsOnMethods = "login")
    public void testing(){
        System.out.println("Testing 1");
    }

}
