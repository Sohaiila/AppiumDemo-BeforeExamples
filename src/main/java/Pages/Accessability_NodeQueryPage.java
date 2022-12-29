package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Accessability_NodeQueryPage {
    WebDriver driver;
    By check_Button =By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.CheckBox");


    public Accessability_NodeQueryPage(WebDriver driver) {
        this.driver = driver;
    }


    public Accessability_NodeQueryPage clickOncheckButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(check_Button).click();
        return new Accessability_NodeQueryPage(driver);
    }
    public String checkOnButton(){
      return   driver.findElement(check_Button).getAttribute("checked");
    }
}
