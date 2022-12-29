package Pages;

import Actions.MobileActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Graphics_verticesPage {
    WebDriver driver;
    MobileActions mobileActions;
    By Pointer= By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.View");


    public Graphics_verticesPage(WebDriver driver) {
        this.driver = driver;
    }
    public void moveToleft(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        MobileActions mobileActions1 = new MobileActions(driver);
        MobileActions.swipeLeftOnElement(Pointer);

    }
    public Graphics_verticesPage moveToRight(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        MobileActions mobileActions1 = new MobileActions(driver);
        MobileActions.swipeRightOnElement(Pointer,driver);
        return new Graphics_verticesPage(driver);
    }
}
