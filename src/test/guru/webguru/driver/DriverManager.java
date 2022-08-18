package com.guru.webguru.driver;

import io.appium.java_client.AppiumDriver;


public class DriverManager {

    private static AppiumDriver driver;
    // For Appium < 2.0, append /wd/hub to the APPIUM_SERVER_URL
    String APPIUM_SERVER_URL = "http://127.0.0.1:4723";


}