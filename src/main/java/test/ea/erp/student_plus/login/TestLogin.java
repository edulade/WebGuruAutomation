package test.ea.erp.student_plus.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import constant.Target;
import core.driver.DriverManager;
import exceptions.PlatformNotSupportException;
import io.appium.java_client.AppiumDriver;
import test.ea.erp.student_plus.MainLoginActivity;
import test.guru.webguru.base.BaseTest;

public class TestLogin extends BaseTest {

//    private AppiumDriver appiumDriver;

    private String userName = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]";
    private String password = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]";
    private String submitBtn = "//android.widget.Button[@content-desc=\"Submit\"]";

    public TestLogin() {
        this.appiumDriver = createDriver(Target.ANDROID);
    }

    public TestLogin(Target target) {
        this.appiumDriver = createDriver(target);
    }

    public TestLogin(AppiumDriver driver) {
        this.appiumDriver = driver;
    }

    @Test
    public void testInvalidValidLogin() {
        testInvalidUserId();
        testInvalidPassword();
    }
    @Test
    public void testValidLogin() {
        MainLoginActivity mainLoginPge = new MainLoginActivity(appiumDriver);
        PageFactory.initElements(appiumDriver, mainLoginPge);
        mainLoginPge.waitForElementToBePresent(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]"));
        if (mainLoginPge.isScreenDisplayed()) {
            System.out.println("Login page is now displayed");
//            String locator = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]";
            WebElement userEl = mainLoginPge.getElement(By.xpath(userName));
            userEl.click();
            userEl.clear();
            userEl.sendKeys("dw");
            System.out.println("UserId is " + userEl.getText());
            assert mainLoginPge.getElement(By.xpath(userName)).getText().contains("dw");
            mainLoginPge.getElement(By.xpath(password)).click();
            mainLoginPge.getElement(By.xpath(password)).clear();
            mainLoginPge.getElement(By.xpath(password)).sendKeys("dw123");
            System.out.println("Password is " + mainLoginPge.getElement(By.xpath(password)).getText());
//            assert mainLoginPge.getElement(By.xpath(password)).getText().contains("dw123");
            WebElement el4 = (WebElement) mainLoginPge.getElement(By.xpath(submitBtn));
            el4.click();
            System.out.println("Login page is now displayed" + el4.getText());
            mainLoginPge.waitForElementToBePresent(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
            WebElement el5 = (WebElement) mainLoginPge.getElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
            assert el5 != null;
            el5.click();
        }

        }
    @Test
    public void testInvalidUserId() {
        MainLoginActivity mainLoginPge = new MainLoginActivity(appiumDriver);
        PageFactory.initElements(appiumDriver, mainLoginPge);
        mainLoginPge.waitForElementToBePresent(By.xpath(submitBtn));
        if (mainLoginPge.isScreenDisplayed()) {
            System.out.println("Login page is now displayed");
//            String locator = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]";
            WebElement userEl = mainLoginPge.getElement(By.xpath(userName));
            userEl.click();
            userEl.clear();
            userEl.sendKeys("ds");
            System.out.println("UserId is " + mainLoginPge.getElement(By.xpath(userName)).getText());

//            locator = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]";
            mainLoginPge.getElement(By.xpath(password)).click();
            mainLoginPge.getElement(By.xpath(password)).clear();
            mainLoginPge.getElement(By.xpath(password)).sendKeys("dw123");
            System.out.println("Password is " + mainLoginPge.getElement(By.xpath(password)).getText());
            WebElement el4 = (WebElement) mainLoginPge.getElement(By.xpath(submitBtn));
            System.out.println("Invalid login 1" + el4.getText());
            el4.click();
            System.out.println("Invalid login 2" + el4.getText());
            mainLoginPge.waitForElementToBePresent(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
            WebElement el5 = (WebElement) mainLoginPge.getElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
            el5.click();
        }

    }

    @Test
    public void testInvalidPassword() {
        MainLoginActivity mainLoginPge = new MainLoginActivity(appiumDriver);
        PageFactory.initElements(appiumDriver, mainLoginPge);
        mainLoginPge.waitForElementToBePresent(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]"));
        if (mainLoginPge.isScreenDisplayed()) {
            System.out.println("Login page is now displayed");
            WebElement userEl = mainLoginPge.getElement(By.xpath(userName));
            userEl.click();
            userEl.clear();
            userEl.sendKeys("dw");
            System.out.println("UserId is " + mainLoginPge.getElement(By.xpath(userName)).getText());

//            locator = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]/";
            mainLoginPge.getElement(By.xpath(password)).click();
            mainLoginPge.getElement(By.xpath(password)).clear();
            mainLoginPge.getElement(By.xpath(password)).sendKeys("dw1234");
            System.out.println("Password is " + mainLoginPge.getElement(By.xpath(password)).getText());
            WebElement el4 = (WebElement) mainLoginPge.getElement(By.xpath(submitBtn));
            el4.click();
            System.out.println("Invalid login" + el4.getText());
            mainLoginPge.waitForElementToBePresent(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
            WebElement el5 = (WebElement) mainLoginPge.getElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
            el5.click();
        }
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
