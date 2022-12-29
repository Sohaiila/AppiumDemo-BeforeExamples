import Actions.MobileActions;
import Pages.AccesabilityNodeProviderPage;
import Pages.ActionBarPage;
import Pages.HomePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Tests {
    WebDriver driver;
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
    public void testClickAction(){
       String text = new HomePage(driver)
               .clickOnAccessability_button()
               .getAccesabilityNodeProviderText();
       Assert.assertEquals(text,"Accessibility Node Provider");

    }
    @Test
    public void testTyping() {
        // Navigate to APP ,activity , custom title , type "Appium" and check If the text written or not
        String txt= new HomePage(driver)
                .clickOnApp_button()
                .clickOnActivity_button()
                .clickOnCustomButton()
                .clearLeftisBest().EnterAppium().clickOnChangeLeft().checkOnTitle();
        Assert.assertEquals(txt,"Appium");

    }
    @Test
    public void testCheckBox() {
        // Navigate to Access'ibility , Accessibility Node Querying , click on any checkbox and validate that the checkbox is checked
       String txt = new HomePage(driver)
                 .clickOnAccessability_button()
                 .clickOnNodeQuery()
                 .clickOncheckButton().checkOnButton();
        Assert.assertEquals(txt,"false");

    }

    @Test
    public void testScrolling() {
        // Navigate to Graphics , scaleToFit and click on it and check If it's scrolled and clicked or not
        String txt= new HomePage(driver)
                .clickOnGraphics()
                .scrollDownAndClick().
                clickOnScaleButton().
                checkOnTitle();
        Assert.assertEquals(txt,"Graphics/ScaleToFit");
    }
    @Test
    public void testSwiping() {
        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left
       new HomePage(driver)
               .clickOnGraphics()
               .scrollDownAndClickOnVirtices()
               .clickOnVirtiesButton()
               .moveToRight()
               .moveToleft();
    }
    @Test
    public void testRadioButton() {
        // Navigate to Views , Radio Group , click on any radio button and check If it's selected or not
        String txt =new HomePage(driver)
                .clickOnViews()
                .clickOnRadioGroup()
                .clickOnDinner().getTitle();
        Assert.assertEquals(txt,"true");

    }
}
