package test.guru.webguru;

import com.testsigma.flutter.FlutterElement;
import com.testsigma.flutter.FlutterFinder;
import constant.Target;
import constant.TestGroups;
import core.driver.DriverManager;
import exceptions.PlatformNotSupportException;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.guru.webguru.base.BaseTest;

import java.io.IOException;
import java.util.List;

public class FirstTest extends BaseTest {

//    private static FlutterFinder finder.byValueKey(el5.).findElementByAccessibilityId("Assignments");

    public static void main(String args[]) throws PlatformNotSupportException, IOException, InterruptedException {
//        String logText = new APIDemosHomePage(this.driver)
//                .openText()
//                .tapOnLogTextBox()
//                .tapOnAddButton()
//                .getLogText();

//        Assert.assertEquals(logText, "This is a test");

        AppiumDriver driver = (new DriverManager()).getInstance(Target.ANDROID);

//        FlutterFinder finder = new FlutterFinder(driver);

//        WebElement  el5 = (WebElement) driver.findElementByAccessibilityId(" Login ");
//        el5.click();

//        List<WebElement> lst = driver.findElementsByClassName("android.widget.EditText");
//
//        System.out.println(" Elements found " +lst.size());
//
//        lst.forEach(webElement ->
//                System.out.println("Got Elements >>>" + webElement.getText())
//        );

//        WebElement fl6 = finder.byValueKey("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
//        System.out.println("Finding using FlutterFinder " + fl6);

//        WebElement el6 = (WebElement) driver.findElementByXPath("/android.widget.EditText[1]");///android.widget.EditText[1]
//         el6 = (WebElement) driver.findElementById("00000000-0000-001e-0000-001100000003");///android.widget.EditText[1]
//        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");

//        el6.sendKeys("8291239184");
//
//el6.sendKeys("8291239184");
//        WebElement fl7 = finder.byValueKey("Code");
////        WebElement el7 = (WebElement) driver.findElementById("00000000-0000-001e-0000-001200000003");
//
//           // (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
////        MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("Password/Code");
//        fl7.sendKeys("9012");
//    MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("Okay");
//el8.click();

//        MobileElement element = new FlutterElement(finder.byValueKey("Assignments"));
        WebElement el3 = driver.findElement(By.name("Assignments"));
//        WebElement el3 = driver.findElement(By.id("Assignments"));
//        WebElement el3 =  finder.byValueKey(driver.getContext()).findElementByAccessibilityId("Assignments");
        el3.click();
        driver.navigate().back();
        driver.navigate();
//        WebElement el4 = (WebElement) driver.findElementByAccessibilityId("Assignments");
//        el4.click();
//        driver.navigate().back();
//        WebElement el6 = (WebElement) driver.findElementByAccessibilityId("Class Schedule");
//        el6.click();
//        driver.navigate().back();
//        WebElement el7 = (WebElement) driver.findElementByAccessibilityId("Back");
//        el7.click();
        driver.navigate().back();
    }


}
