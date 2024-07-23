package com.ucode_academy.day_12_keyboard_actions_js_singleton;

import com.ucode_academy.base.TestBase2;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BasicAuthentication extends TestBase2 {


    // To handle basic authentication by providing username & password withing the URL
    @Test
    public void basicAuthentication(){
        driver.get("https://admin:admin@www.practice-ucodeacademy.com/basic_auth");

        Wait.waitForGivenTime(9);
    }






}
