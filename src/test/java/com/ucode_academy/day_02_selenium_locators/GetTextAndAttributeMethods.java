package com.ucode_academy.day_02_selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndAttributeMethods {
    public static void main(String[] args) throws Exception {
        String url = "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx";

        WebDriver driver = new ChromeDriver();

        driver.get(url);
        Thread.sleep(2000);

        // locate web element by class name
        WebElement infoElement = driver.findElement(By.className("info"));

        // get the text/retrieve the text using getText()
        String texOfElement = infoElement.getText();

        System.out.println("Text of Web Element: "+texOfElement);


        // locate login button with class name
        WebElement loginBtn = driver.findElement(By.className("button"));

        // get id attribute values as String
        String idValue = loginBtn.getAttribute("id");

        System.out.println("ID Value: "+idValue);

        // get name attribute as String
        String nameValue = loginBtn.getAttribute("name");
        System.out.println("name value: "+nameValue);

        Thread.sleep(4000);

        driver.quit();





    }
}
