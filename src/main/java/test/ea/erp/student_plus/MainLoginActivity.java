package test.ea.erp.student_plus;

import core.page.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class MainLoginActivity extends BasePage {


//    public MainLoginActivity(AppiumDriver driver) {
//        super(driver);
//    }


//
//    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Submit\"]")
//    private WebElement submit;
//
//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]")
//    private WebElement password;
//
//    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]")
//    private WebElement loginId;

//    @AndroidFindBy(id = "android:id/content")
//    private MobileElement element2;

    public MainLoginActivity(AppiumDriver driver) {
        super(driver);
    }

    public boolean isScreenDisplayed() {
        try {
            return getSubmit().isDisplayed() ||  getLoginId().isDisplayed() || getPassword().isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public WebElement getSubmit() {
        return getElement(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]"));
    }

    public WebElement getPassword() {
        return getElement(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]"));    }

    public WebElement getLoginId() {
        return getElement(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]"));    }
}
