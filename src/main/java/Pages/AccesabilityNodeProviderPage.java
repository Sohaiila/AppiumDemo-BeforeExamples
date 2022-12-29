package Pages;

import dev.failsafe.internal.util.Assert;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccesabilityNodeProviderPage {
    //assert hna en l page atft7t
    By accesabilityNodeProvider_button = new AppiumBy.ByAccessibilityId("Accessibility Node Provider");
    //click hna
    By accesabilityNodeQuery_button = new AppiumBy.ByAccessibilityId("Accessibility Node Querying");
    WebDriver driver;

    public AccesabilityNodeProviderPage(WebDriver driver) {
        this.driver = driver;
        AccesabilityNodeProviderPage accesabilityNodeProviderPage;
        Accessability_NodeQueryPage accessabilityNodeQueryPage;
    }
    public Accessability_NodeQueryPage clickOnNodeQuery(){
        //this.driver.manage().timeouts().implicitlyWait(10);
        driver.findElement(accesabilityNodeQuery_button).click();
        return new Accessability_NodeQueryPage (driver);
    }
    public String  getAccesabilityNodeProviderText(){
       // this.driver.manage().timeouts().implicitlyWait(10);
        return driver.findElement(accesabilityNodeProvider_button).getText();

    }
}
