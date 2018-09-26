package seleniumfeatures;

import base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragnDrop extends BaseUtil {

    @Test
    public void TestDragndrop() throws InterruptedException {
        driver.get("http://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement target = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
    }
}
