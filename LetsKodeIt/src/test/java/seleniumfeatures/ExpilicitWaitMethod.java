package seleniumfeatures;

import base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExpilicitWaitMethod extends BaseUtil {


    @Test
    public void TestExplicitwait(){
       driver.get("https://www.facebook.com/");
       WebElement loginBtn = driver.findElement(By.xpath("//*[@value=\"Log In\"]"));
       clickWhenclickable(driver,loginBtn,10);
   }
    //Method for explicit wait:it will wait until the element is clickable:timeout is the maximum wait
    public static void clickWhenclickable(WebDriver driver, WebElement locator, int timeout){
        new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until
                (ExpectedConditions.elementToBeClickable(locator));
        locator.click();

    }

}

