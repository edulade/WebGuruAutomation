package test.ea.erp.student_plus;

import com.testsigma.flutter.FlutterFinder;
import constant.Target;
import core.driver.DriverManager;
import exceptions.PlatformNotSupportException;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import test.ea.erp.student_plus.about.TestAboutMe;
import test.ea.erp.student_plus.login.TestLogin;
import test.guru.webguru.base.BaseTest;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
@Parameters({"target"})
@Test() //attributes = {"target:Android"}
public class TestStudenPlus extends BaseTest {

    @Test
    public void verifyLoginPage() {
        System.out.println("Starting to Test");
        TestLogin loginTest = new TestLogin(appiumDriver);
//        loginTest.testValidLogin();
        loginTest.testInvalidValidLogin();


    }


//    private static FlutterFinder finder.byValueKey(el5.).findElementByAccessibilityId("Assignments");

//    public static void main(String args[]) {
//        ;
//
//        AppiumDriver driver = null;
//        try {
//            driver = (new DriverManager()).getInstance(Target.ANDROID);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (PlatformNotSupportException e) {
//            e.printStackTrace();
//        }
//
//        TestLogin loginTest = new TestLogin(driver);
//        TestAboutMe abutMeTest = new TestAboutMe(driver);
//
////        FlutterFinder finder = new FlutterFinder(driver);
//
//
//        try {
////            verifyLoginPage(driver);
////            loginTest.testValidLogin();
//            loginTest.testInvalidValidLogin();
////            verifyRecordingPage(driver);
////            verifyMenuActivityPage(driver);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            driver.quit();
//        }
//
//    }
//
//
//    private static void verifyLoginPage(AppiumDriver driver) throws InterruptedException {
//        MainLoginActivity mainLoginPge = new MainLoginActivity(driver);
//        PageFactory.initElements(driver, mainLoginPge);
//        mainLoginPge.waitForElementToBePresent(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]"));
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
////        wait.wait();
//        if (mainLoginPge.isScreenDisplayed()) {
//            System.out.println("Login page is now displayed");
////            WebElement userName = mainLoginPge.getElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
//////            userName.clear();
//////            System.out.println("Login page is now displayed 1 " + userName.getText());
////            userName.click();
////            System.out.println("Login page is now displayed 2 " + userName.getText());
//////            userName.sendKeys("dw");
////            Actions action = new Actions(driver);
////            action.sendKeys("dw");
//////            userName.sendKeys(Keys.TAB);
////            System.out.println("Login page is now displayed 3 " + userName.getText());
//////            userName.submit();
////            System.out.println("Login page is now displayed 2 " + userName.getText());
//            String locator = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]";
//            mainLoginPge.getElement(By.xpath(locator)).click();
//            mainLoginPge.getElement(By.xpath(locator)).clear();
//            mainLoginPge.getElement(By.xpath(locator)).sendKeys("dw");
//            System.out.println("UserId is " + mainLoginPge.getElement(By.xpath(locator)).getText());
//
//            locator = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]";
//            mainLoginPge.getElement(By.xpath(locator)).click();
//            mainLoginPge.getElement(By.xpath(locator)).clear();
//            mainLoginPge.getElement(By.xpath(locator)).sendKeys("dw123");
//            System.out.println("Password is " + mainLoginPge.getElement(By.xpath(locator)).getText());
//
////            WebElement password = mainLoginPge.getElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]"));
////            password.click();
////            password.clear();
////            password.sendKeys("dw123");
////            userName.sendKeys(Keys.TAB);
////            System.out.println("Login page is now displayed" + password.getText());
//            WebElement el4 = (WebElement) mainLoginPge.getElement(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]"));
////            WebElement el4 = (WebElement) mainLoginPge.getElement(By.id("Submit"));
//            el4.click();
//            System.out.println("Login page is now displayed" + el4.getText());
//            mainLoginPge.waitForElementToBePresent(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
//            WebElement el5 = (WebElement) mainLoginPge.getElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
//            el5.click();
//
////            driver.navigate().back();
//
//        } else {
//            System.out.println("Login page is not displayed");
//        }
//
//    }
//
//    private static void verifyRecordingPage(AppiumDriver driver) throws InterruptedException {
//        BatchRecordingActivity batchActivityPge = getBatchRecordingActivity(driver);
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
////        wait.wait()34;
//        if (batchActivityPge.isScreenDisplayed()) {
//            System.out.println("Batch Activity Page is Display");
//            // Get All elements of the Batch Recording Screen
//            List<WebElement> lstAllViewElements = batchActivityPge.getElements(By.className("android.view.View"));
////            lstAllViewElements.forEach(element -> {
////                if("Python".contains(element.getAttribute("content-desc")) || "React".contains(element.getAttribute("content-desc"))) {
////                    System.out.println("Batch Activity Page View is " + element.getText());
////                } else {
////                    System.out.println("Batch Activity Other View is " + element.getAttribute("content-desc"));
////                }
////            });
////            int lambdaCout = lstAllViewElements.forEach(element -> (element.getAttribute("content-desc") != null && (element.getAttribute("content-desc").contains("Python") || element.getAttribute("content-desc").contains("React")));
//
//            int count = 0;
//            for (Iterator<WebElement> elementItr = lstAllViewElements.iterator(); elementItr.hasNext(); ) {
//                WebElement element = elementItr.next();
//                System.out.println("Batch Activity Other View is " + element.getAttribute("content-desc"));
//                if (element.getAttribute("content-desc") != null
//                        && (element.getAttribute("content-desc").contains("Python")
//                        || element.getAttribute("content-desc").contains("React"))) {
//
//                    count++;
//                }
//            }
//            assert 3 == count;
//            System.out.println(" Check Results " + count);
//            System.out.println("Batch Activity Page Views : " + lstAllViewElements.size());
//            List<WebElement> lstAllButtons = batchActivityPge.getElements(By.className("android.widget.Button"));
//            assert 2 == lstAllButtons.size();
//            System.out.println("Batch Activity Page Buttons : " + lstAllButtons.size());
////            driver.wait(5000);
//        }
//    }
//
//
//    private static void verifyMenuActivityPage(AppiumDriver driver) throws InterruptedException {
//
//        MenuActivity menuPge = getMenuActivity(driver);
//
//        if (menuPge.isScreenDisplayed()) {
//            System.out.println("Menu page is now displayed");
//
//            menuPge.getHolidaysElement().click();
//
//
//
//            System.out.println("Holiday Page is Display Now");
//
//        } else {
//            System.out.println("Holiday page is not displayed");
//        }
//
//    }
//
//    private static MenuActivity getMenuActivity(AppiumDriver driver) {
//        BatchRecordingActivity batchActivityPge = getBatchRecordingActivity(driver);
//        WebElement menuElement = batchActivityPge.getElement(By.xpath("//android.widget.Button[@content-desc=\"Open navigation menu\"]"));
//        menuElement.click();
//        MenuActivity menuPge = new MenuActivity(driver);
//        PageFactory.initElements(driver, menuPge);
//        menuPge.waitForElementToBePresent(By.xpath("//android.widget.Button[@content-desc=\"Log Out\"]"));
//        return menuPge;
//    }
//
//    private static BatchRecordingActivity getBatchRecordingActivity(AppiumDriver driver) {
//        BatchRecordingActivity batchActivityPge = new BatchRecordingActivity(driver);
//        PageFactory.initElements(driver, batchActivityPge);
//        batchActivityPge.waitForElementToBePresent(By.xpath("//android.view.View[@content-desc=\"Tap to view Class Recordings\"]"));
//        return batchActivityPge;
//    }
}
