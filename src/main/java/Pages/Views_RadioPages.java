package Pages;

import dev.failsafe.internal.util.Assert;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Views_RadioPages {
    WebDriver driver;
    By Dinner_button= new AppiumBy.ByAccessibilityId("Dinner");
    By Choosen_Button = By.xpath("//android.widget.RadioButton[@content-desc=\"Dinner\"]");
    public Views_RadioPages(WebDriver driver) {
        this.driver = driver;
    }
    public Views_RadioPages clickOnDinner(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(Dinner_button).click();
        return new Views_RadioPages(driver);
    }
    public String getTitle(){
        return
       driver.findElement(Choosen_Button).getAttribute("checked");

    }

}
