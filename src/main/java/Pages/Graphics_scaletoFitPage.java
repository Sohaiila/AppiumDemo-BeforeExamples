package Pages;

import Actions.MobileActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Graphics_scaletoFitPage {
    WebDriver driver;
    By Graphics_txt= (By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView"));


    public Graphics_scaletoFitPage(WebDriver driver) {
        this.driver = driver;
    }
    public String checkOnTitle(){
        return driver.findElement(Graphics_txt).getText();
    }


}
