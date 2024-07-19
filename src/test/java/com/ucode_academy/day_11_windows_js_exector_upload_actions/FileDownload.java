package com.ucode_academy.day_11_windows_js_exector_upload_actions;

import com.ucode_academy.base.TestBase2;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileDownload extends TestBase2 {

    @Test
    public void downloadFile(){
        driver.get("https://www.practice-ucodeacademy.com/download");

        WebElement downloadableLink = driver.findElement(By.xpath("//a[text()='NewSublime.html']"));

        downloadableLink.click();

        Wait.waitForGivenTime(7);
    }
}
