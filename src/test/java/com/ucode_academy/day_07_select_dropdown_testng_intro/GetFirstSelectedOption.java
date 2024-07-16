package com.ucode_academy.day_07_select_dropdown_testng_intro;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption extends TestBase {
    public static void main(String[] args) {
        setUp();

        driver.get("https://www.practice-ucodeacademy.com/dropdown");

        WebElement simpleDropDown = driver.findElement(By.id("dropdown"));

        Select select = new Select(simpleDropDown);

        // get the text of first selected option or the default option
       String str = select.getFirstSelectedOption().getText();
        System.out.println(str);

        Wait.waitForGivenTime(2);

        select.selectByValue("5");

        Wait.waitForGivenTime(3);

        String str2 = select.getFirstSelectedOption().getText();
        System.out.println(str2);

        Wait.waitForGivenTime(2);



        WebElement language = driver.findElement(By.xpath("//select[@name='Languages']"));
        Select select2 = new Select(language);

        // try to getFirstSelectedOption() for none selected option
        //String str3 = select2.getFirstSelectedOption().getText();
        //System.out.println(str3);

        select.selectByValue("1");
        System.out.println(select.getAllSelectedOptions());
        Wait.waitForGivenTime(2);
        driver.quit();


    }
}
