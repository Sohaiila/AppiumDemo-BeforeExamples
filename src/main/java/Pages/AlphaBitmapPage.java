package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.*;
import java.time.Duration;

public class AlphaBitmapPage {
    WebDriver driver;
    MobileActions mobileActions;
    By ScaletoFit_button=new AppiumBy.ByAccessibilityId("ScaleToFit");
    By Virtices = new AppiumBy.ByAccessibilityId("Vertices");

    public AlphaBitmapPage(WebDriver driver) {
        this.driver = driver;
    }
    public Graphics_scaletoFitPage clickOnScaleButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(ScaletoFit_button).click();
        return new Graphics_scaletoFitPage(driver);
    }
    public AlphaBitmapPage scrollDownAndClick(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        MobileActions mobileActions=new MobileActions(driver);
        MobileActions.scrollDownToSpecificText("ScaleToFit");
        return new AlphaBitmapPage(driver);

    }
    public AlphaBitmapPage scrollDownAndClickOnVirtices() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        MobileActions mobileActions1 = new MobileActions(driver);
        MobileActions.scrollDownToSpecificText("Vertices");
        return new AlphaBitmapPage(driver);
    }
    public Graphics_verticesPage clickOnVirtiesButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(Virtices).click();
        return new Graphics_verticesPage(driver);
    }


}
