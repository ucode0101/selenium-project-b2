package com.ucode_academy.util;

public class Wait {

    public static void waitForGivenTime(int second){

        try {
            Thread.sleep((long) second * 1000);
        } catch (Exception e){
            e.getStackTrace();
        }


    }
}
