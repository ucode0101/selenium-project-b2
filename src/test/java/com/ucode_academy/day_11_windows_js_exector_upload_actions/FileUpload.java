package com.ucode_academy.day_11_windows_js_exector_upload_actions;

import com.ucode_academy.base.TestBase2;
import com.ucode_academy.util.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUpload extends TestBase2 {

    @Test
    public void uploadFile(){
        driver.get("https://www.practice-ucodeacademy.com/upload");

        WebElement chooseFile = driver.findElement(By.id("file-upload"));

        chooseFile.sendKeys("/Users/kudratullonegmatov/Documents/testFile");

        Wait.waitForGivenTime(3);
        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();

        WebElement uploadedFile = driver.findElement(By.id("uploaded-files"));
        // verify the file was uploaded

        Assert.assertTrue(uploadedFile.isDisplayed(),"The file was not uploaded");

        // verify the uploaded file name match the file we uploaded
        String expectedFileName = "testFile";

        String actualFileName = uploadedFile.getText();

        Assert.assertEquals(actualFileName, expectedFileName, "File names do not match");

        Wait.waitForGivenTime(5);



    }
}
