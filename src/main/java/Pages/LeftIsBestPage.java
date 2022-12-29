package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LeftIsBestPage {
    WebDriver driver;
    By Leftisbest_text = By.id("io.appium.android.apis:id/left_text_edit");
    By ChangeLeft_button = new AppiumBy.ByAccessibilityId("Change Left");
    By Appium =By.xpath("//android.widget.TextView[@content-desc=\"Left is best\"]");
    public LeftIsBestPage(WebDriver driver) {
        this.driver = driver;
    }
    public LeftIsBestPage clearLeftisBest(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(Leftisbest_text).clear();
        return new LeftIsBestPage(driver);
    }
    public LeftIsBestPage EnterAppium(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(Leftisbest_text).sendKeys("Appium");
        return new LeftIsBestPage(driver);
    }
    public LeftIsBestPage clickOnChangeLeft(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(ChangeLeft_button).click();
        return new LeftIsBestPage(driver);
    }
    public String  checkOnTitle(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.findElement(Appium).getText();

    }
}
