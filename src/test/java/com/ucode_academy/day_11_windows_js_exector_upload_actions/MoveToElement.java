package com.ucode_academy.day_11_windows_js_exector_upload_actions;

import com.beust.ah.A;
import com.ucode_academy.base.TestBase2;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoveToElement extends TestBase2 {

    @Test
    public void moveToElement(){
        driver.get("https://www.practice-ucodeacademy.com/hovers");

        WebElement image1 = driver.findElement(By.xpath("//div[@class='figure'][1]"));
        WebElement name1 = driver.findElement(By.xpath("//h5[text()='name: user1']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(image1).perform();

        // verify the user1 is displayed
        Assert.assertTrue(name1.isDisplayed(), "Failed! name is not displayed");
        System.out.println(name1.getText());

        Wait.waitForGivenTime(2);

        WebElement image2 = driver.findElement(By.xpath("//div[@class='figure'][2]"));
        WebElement name2 = driver.findElement(By.xpath("//h5[text()='name: user2']"));

        actions.moveToElement(image2).perform();

        // verify name 2 is displayed
        Assert.assertTrue(name2.isDisplayed(), "Failed, name 2 is not displayed");

        System.out.println(name2.getText());

        Wait.waitForGivenTime(2);


        WebElement image3 = driver.findElement(By.xpath("//div[@class='figure'][3]"));
        WebElement name3 = driver.findElement(By.xpath("//h5[text()='name: user3']"));

        actions.moveToElement(image3).perform();

        // verify
        Assert.assertTrue(name3.isDisplayed(), "Failed name 3 is not displayed");
        System.out.println(name3.getText());

        Wait.waitForGivenTime(5);


    }
}
