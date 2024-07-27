package com.ucode_academy.day_14_testng_parallel_data_driven_testing;

import com.ucode_academy.util.Driver;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest2 {

    // login to https://www.practice-ucodeacademy.com/login
    // with different username and password

    @DataProvider(name = "data")
    public Object [][] testData(){
        Object[][] urls = {
                {"https://www.practice-ucodeacademy.com/login", "test33","test12333"},
                {"https://www.practice-ucodeacademy.com/login","test","test123"},
                {"https://www.practice-ucodeacademy.com/login","test","test123"}};


        return urls;
    }

    @Test(dataProvider = "data")
    public void dataDrivenTesting(String url, String username, String password){
      Driver.getDriver().get(url);

        WebElement usernameField = Driver.getDriver().findElement(By.id("username"));

        WebElement passwordField = Driver.getDriver().findElement(By.id("password"));

        WebElement loginButton = Driver.getDriver().findElement(By.cssSelector("button.radius"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);

        loginButton.click();
        String pageUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(pageUrl.endsWith("secure"),"Assertion Failed");

        Wait.waitForGivenTime(3);

        Driver.quitDriver();
    }
}
