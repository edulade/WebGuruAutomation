package test.ea.erp.student_plus.about;

import org.testng.annotations.Test;

import java.io.IOException;

import constant.Target;
import core.driver.DriverManager;
import exceptions.PlatformNotSupportException;
import io.appium.java_client.AppiumDriver;
import test.guru.webguru.base.BaseTest;

public class TestAboutMe extends BaseTest {

//    private AppiumDriver driver;

    public TestAboutMe() {
        this.appiumDriver = createDriver(Target.ANDROID);
    }

    public TestAboutMe(Target target) {
        this.appiumDriver = createDriver(target);
    }

    public TestAboutMe(AppiumDriver driver) {
        this.appiumDriver = driver;
    }

    @Test
    public void testAboutMe(){
        assert true;
    }

    private AppiumDriver createDriver(Target target) {
        try {
            return (new DriverManager()).getInstance(target);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (PlatformNotSupportException e) {
            e.printStackTrace();
        }
        return null;
    }
}
