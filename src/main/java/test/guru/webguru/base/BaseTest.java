package test.guru.webguru.base;

import constant.Target;
import core.driver.DriverManager;
import core.utils.PropertiesReader;
import exceptions.PlatformNotSupportException;
import io.appium.java_client.AppiumDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class BaseTest {
    protected AppiumDriver appiumDriver;
    protected PropertiesReader reader = new PropertiesReader();

    @BeforeTest(alwaysRun = true)
    public void setup( org.testng.ITestContext context) {
        System.out.println("Starting to setup"  );
//        context.setAttribute("target", reader.getTarget());

        try {
            Target target = Target.ANDROID;//(Target) context.getAttribute("target");
            this.appiumDriver = new DriverManager().getInstance(target);
        } catch (IOException | PlatformNotSupportException e) {
            e.printStackTrace();
        }
    }

    @AfterTest(alwaysRun = true)
    public void teardown() {
        appiumDriver.quit();
    }
}