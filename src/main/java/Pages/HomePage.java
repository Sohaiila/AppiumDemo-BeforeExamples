package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HomePage {
   private By Access_ibility_button = new AppiumBy.ByAccessibilityId("Access'ibility");
   private By APP_button=new AppiumBy.ByAccessibilityId("App");
   private By VIEWS_button=new AppiumBy.ByAccessibilityId("Views");
   private By GRAFICS_button =new AppiumBy.ByAccessibilityId("Graphics");
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        HomePage homePage;
        ActionBarPage actionBarPage;
        AlphaBitmapPage alphaBitmapPage;

    }
    public AccesabilityNodeProviderPage clickOnAccessability_button(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(Access_ibility_button).click();
        return new AccesabilityNodeProviderPage(driver);
    }

    public ActionBarPage clickOnApp_button(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(APP_button).click();
        return new ActionBarPage(driver);
    }
    public AlphaBitmapPage clickOnGraphics(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(GRAFICS_button).click();
        return new AlphaBitmapPage(driver);
    }
    public AnimationPage clickOnViews(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(VIEWS_button).click();
        return new AnimationPage(driver);
    }
}
