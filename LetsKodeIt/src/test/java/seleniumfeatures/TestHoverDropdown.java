package seleniumfeatures;

import base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestHoverDropdown extends BaseUtil {
    @Test//all items checkbox test
    public void TestDropdownCkick() throws InterruptedException {
        driver.get("https://www.spicejet.com/");
        WebElement addon = driver.findElement(By.cssSelector("#highlight-addons"));
        Actions actions = new Actions(driver);
        actions.moveToElement(addon).build().perform();
        Thread.sleep(2000);
        WebElement hotMeal = driver.findElement(By.linkText("Hot Meals"));
        hotMeal.click();
        }
    }

