package com.ucode_academy.day_10_iframe_windows_js_executor;

import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class MultipleWindows {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void multipleWindowsTabs(){

        driver.get("https://www.practice-ucodeacademy.com/windows");

        String mainWindow = driver.getWindowHandle();
        System.out.println("Main window handle: "+ mainWindow);

        WebElement clickHereButton = driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickHereButton.click();

        Wait.waitForGivenTime(2);
        clickHereButton.click();

        Wait.waitForGivenTime(5);

        // get all window handles

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("All Window Handles: "+allWindowHandles);

        // loop through all window handles and switch to each window one by one
        for (String eachWindow : allWindowHandles){

            driver.switchTo().window(eachWindow);
            System.out.println(driver.getTitle());

        }

        Wait.waitForGivenTime(2);

        // switch back to the main window and print the title
        driver.switchTo().window(mainWindow);
        System.out.println(driver.getTitle());

        Wait.waitForGivenTime(3);




    }
}
