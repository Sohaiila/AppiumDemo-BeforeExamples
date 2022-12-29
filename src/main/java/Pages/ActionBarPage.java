package Pages;

import io.appium.java_client.AppiumBy;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionBarPage {
    WebDriver driver;
    By Activity_button = new AppiumBy.ByAccessibilityId("Activity");

    public ActionBarPage(WebDriver driver) {
        this.driver = driver;
        ActionBarPage actionBarPage;

    }
    public AnimationPage clickOnActivity_button(){
        // this.driver.manage().timeouts().implicitlyWait(10);
        driver.findElement(Activity_button).click();
        return new AnimationPage(driver);
    }
}
