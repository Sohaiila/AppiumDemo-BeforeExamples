import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import Actions.MobileActions;

public class Test_MobileActions {
    WebDriver driver;
    MobileActions mobileActions;

    @BeforeMethod
    public void setupDevice() throws MalformedURLException {
        String AppName = System.getProperty("user.dir") + "\\src\\test\\resources\\TestDataFiles\\ApiDemos-debug.apk";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:deviceName", "Demo");
        caps.setCapability("appium:app", AppName);
        caps.setCapability("appium:platformVersion", "8.1");
        caps.setCapability("appium:automationName", "UiAutomator2");
        driver = new AndroidDriver(new URL("http://localhost:4723/"), caps);
    }

    @Test
    public void testClickAction() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(new AppiumBy.ByAccessibilityId("Access'ibility")).click();
        Assert.assertEquals(driver.findElement(new AppiumBy.ByAccessibilityId("Accessibility Node Provider")).getText(), "Accessibility Node Provider");
    }

    @Test
    public void testTyping() {
        // Navigate to APP ,activity , custom title , type "Appium" and check If the text written or not
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(new AppiumBy.ByAccessibilityId("App")).click();
        driver.findElement(new AppiumBy.ByAccessibilityId("Activity")).click();
        driver.findElement(new AppiumBy.ByAccessibilityId("Custom Title")).click();
        driver.findElement(By.id("io.appium.android.apis:id/left_text_edit")).clear();
        driver.findElement(By.id("io.appium.android.apis:id/left_text_edit")).sendKeys("Appium");
        driver.findElement(new AppiumBy.ByAccessibilityId("Change Left")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Left is best\"]")).getText(),
                "Appium");



    }

    @Test
    public void testCheckBox() {
        // Navigate to Access'ibility , Accessibility Node Querying , click on any checkbox and validate that the checkbox is checked
        driver.findElement(new AppiumBy.ByAccessibilityId("Access'ibility")).click();
        driver.findElement(new AppiumBy.ByAccessibilityId("Accessibility Node Querying")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.CheckBox"))
                .click();
        Assert.assertEquals(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.CheckBox")).
                getAttribute("checked"),"false");


    }

    @Test
    public void testScrolling() {
        // Navigate to Graphics , scaleToFit and click on it and check If it's scrolled and clicked or not
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(new AppiumBy.ByAccessibilityId("Graphics")).click();
        MobileActions mobileActions=new MobileActions(driver);
        mobileActions.scrollDownToSpecificText("ScaleToFit");
        driver.findElement(new AppiumBy.ByAccessibilityId("ScaleToFit")).click();
        Assert.assertEquals(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView"))
                        .getText(),"Graphics/ScaleToFit");

    }

    @Test
    public void testSwiping() {
        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(new AppiumBy.ByAccessibilityId("Graphics")).click();
        ////"android.widget.TextView[@text='Graphics/ScaleToFit']"
        MobileActions mobileActions=new MobileActions(driver);
        mobileActions.scrollDownToSpecificText("Vertices");
        driver.findElement(new AppiumBy.ByAccessibilityId("Vertices")).click();
        mobileActions.swipeRightOnElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.View"),driver);
        mobileActions.swipeLeftOnElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.View"));

    }

    @Test
    public void testRadioButton() {
        // Navigate to Views , Radio Group , click on any radio button and check If it's selected or not
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(new AppiumBy.ByAccessibilityId("Views")).click();
        driver.findElement(new AppiumBy.ByAccessibilityId("Radio Group")).click();
        driver.findElement(new AppiumBy.ByAccessibilityId("Dinner")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.RadioButton[@content-desc=\"Dinner\"]")).
                getAttribute("checked"),"true");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
