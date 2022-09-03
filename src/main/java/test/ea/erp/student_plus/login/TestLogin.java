package test.ea.erp.student_plus.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import constant.Target;
import core.driver.DriverManager;
import exceptions.PlatformNotSupportException;
import io.appium.java_client.AppiumDriver;
import test.ea.erp.student_plus.MainLoginActivity;

public class TestLogin {

    private AppiumDriver driver;

    public TestLogin() {
        this.driver = createDriver(Target.ANDROID);
    }

    public TestLogin(Target target) {
        this.driver = createDriver(target);
    }

    public TestLogin(AppiumDriver driver) {
        this.driver = driver;
    }

    public void testInvalidValidLogin() {
        testInvalidUserId();
        testInvalidPassword();
    }

    public void testValidLogin() {
        MainLoginActivity mainLoginPge = new MainLoginActivity(driver);
        PageFactory.initElements(driver, mainLoginPge);
        mainLoginPge.waitForElementToBePresent(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]"));
        if (mainLoginPge.isScreenDisplayed()) {
            System.out.println("Login page is now displayed");
            String locator = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]";
            mainLoginPge.getElement(By.xpath(locator)).click();
            mainLoginPge.getElement(By.xpath(locator)).clear();
            mainLoginPge.getElement(By.xpath(locator)).sendKeys("dw");
            System.out.println("UserId is " + mainLoginPge.getElement(By.xpath(locator)).getText());

            locator = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]";
            mainLoginPge.getElement(By.xpath(locator)).click();
            mainLoginPge.getElement(By.xpath(locator)).clear();
            mainLoginPge.getElement(By.xpath(locator)).sendKeys("dw123");
            System.out.println("Password is " + mainLoginPge.getElement(By.xpath(locator)).getText());
            WebElement el4 = (WebElement) mainLoginPge.getElement(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]"));
            el4.click();
            System.out.println("Login page is now displayed" + el4.getText());
            mainLoginPge.waitForElementToBePresent(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
            WebElement el5 = (WebElement) mainLoginPge.getElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
            el5.click();
        }

        }

    public void testInvalidUserId() {
        MainLoginActivity mainLoginPge = new MainLoginActivity(driver);
        PageFactory.initElements(driver, mainLoginPge);
        mainLoginPge.waitForElementToBePresent(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]"));
        if (mainLoginPge.isScreenDisplayed()) {
            System.out.println("Login page is now displayed");
            String locator = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]";
            mainLoginPge.getElement(By.xpath(locator)).click();
            mainLoginPge.getElement(By.xpath(locator)).clear();
            mainLoginPge.getElement(By.xpath(locator)).sendKeys("ds");
            System.out.println("UserId is " + mainLoginPge.getElement(By.xpath(locator)).getText());

            locator = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]";
            mainLoginPge.getElement(By.xpath(locator)).click();
            mainLoginPge.getElement(By.xpath(locator)).clear();
            mainLoginPge.getElement(By.xpath(locator)).sendKeys("dw123");
            System.out.println("Password is " + mainLoginPge.getElement(By.xpath(locator)).getText());
            WebElement el4 = (WebElement) mainLoginPge.getElement(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]"));
            el4.click();
            System.out.println("Invalid login" + el4.getText());
            mainLoginPge.waitForElementToBePresent(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
            WebElement el5 = (WebElement) mainLoginPge.getElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
            el5.click();
        }

    }
    public void testInvalidPassword() {

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
