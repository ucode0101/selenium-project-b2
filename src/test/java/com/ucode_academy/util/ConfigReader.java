package com.ucode_academy.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // create an object from Properties class, and make private and static
    private static Properties properties = new Properties();

   static {

       // create a string object and store the .properties path as a string
       String path = "configuration.properties";


      try {
          FileInputStream file = new FileInputStream(path);
          // load the file into properties object
          properties.load(file);
          // close the file
          file.close();
      } catch (IOException e){
          e.printStackTrace();

          // throw an exception explicitly if the file was not found
          throw new RuntimeException("File path was not found");
      }

   }

   // custom method to get the property
    public static String getProperty(String keyword){
       return properties.getProperty(keyword);
    }



}
