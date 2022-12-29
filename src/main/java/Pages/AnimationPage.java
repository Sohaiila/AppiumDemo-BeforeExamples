package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class AnimationPage {
    WebDriver driver;
    By Custom_button = new AppiumBy.ByAccessibilityId("Custom Title");
    By RadioGroup_Button=new AppiumBy.ByAccessibilityId("Radio Group");

    public AnimationPage(WebDriver driver) {
        this.driver = driver;
    }

    public LeftIsBestPage clickOnCustomButton() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(Custom_button).click();
        return new LeftIsBestPage(driver);
    }
    public Views_RadioPages clickOnRadioGroup(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(RadioGroup_Button).click();
        return new Views_RadioPages(driver);

    }
}