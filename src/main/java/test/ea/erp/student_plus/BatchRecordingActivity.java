package test.ea.erp.student_plus;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import pages.base.BasePage;

public class BatchRecordingActivity extends BasePage {


    public BatchRecordingActivity(AppiumDriver driver) {
        super(driver);
    }
    public boolean isScreenDisplayed() {
        try {
            return getHeaderElement().isDisplayed() ;
        } catch (Exception e) {
            return false;
        }
    }

    public WebElement getHeaderElement() {
        return getElement(By.xpath("//android.view.View[@content-desc=\"Tap to view Class Recordings\"]"));
    }

}
