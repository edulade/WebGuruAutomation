package test.ea.erp.student_plus.about;

import java.io.IOException;

import constant.Target;
import core.driver.DriverManager;
import exceptions.PlatformNotSupportException;
import io.appium.java_client.AppiumDriver;

public class TestAboutMe {

    private AppiumDriver driver;

    public TestAboutMe() {
        this.driver = createDriver(Target.ANDROID);
    }

    public TestAboutMe(Target target) {
        this.driver = createDriver(target);
    }

    public TestAboutMe(AppiumDriver driver) {
        this.driver = driver;
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
