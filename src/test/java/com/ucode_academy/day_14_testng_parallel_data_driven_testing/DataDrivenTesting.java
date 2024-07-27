package com.ucode_academy.day_14_testng_parallel_data_driven_testing;

import com.ucode_academy.util.Driver;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataDrivenTesting {


    // in this class, we'll take the data from external file/class/source
    // external file/class/source is the one that is outside of this class

    @Test(dataProvider = "data", dataProviderClass = DataProviderTest2.class )
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
