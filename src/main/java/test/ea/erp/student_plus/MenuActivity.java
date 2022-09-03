package test.ea.erp.student_plus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.page.BasePage;
import io.appium.java_client.AppiumDriver;

public class MenuActivity extends BasePage {

    public MenuActivity(AppiumDriver driver) {
        super(driver);
    }

    public boolean isScreenDisplayed() {
        try {
            return getAboutMe().isDisplayed() ||  getHolidaysElement().isDisplayed() || getBatchRecordingsElement().isDisplayed()|| Logout().isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public WebElement getAboutMe() {
        return getElement(By.xpath("//android.view.View[@content-desc=\"About Me\"]"));
    }

    public WebElement getHolidaysElement() {
        return getElement(By.xpath("//android.view.View[@content-desc=\"Holiday's\"]"));    }

    public WebElement getBatchRecordingsElement() {
        return getElement(By.xpath("//android.view.View[@content-desc=\"Batch Recordings\"]"));

    }
    public WebElement Logout() {
        return getElement(By.xpath("//android.widget.Button[@content-desc=\"Log Out\"]"));

    }
}
