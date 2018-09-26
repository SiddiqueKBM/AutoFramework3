package seleniumfeatures;

import base.BaseUtil;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class PopupWindowHandle extends BaseUtil {

   @Test
    public void popupWindowTest(){
        driver.get("http://www.popuptest.com/goodpopups.html");
        driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();
        Set<String> handlers = driver.getWindowHandles();
       Iterator<String> it = handlers.iterator();

       String parent = it.next();
       String child = it.next();
       System.out.println("Parent window:"+ parent);
       System.out.println("Child window:"+ child);

       driver.switchTo().window(child);
       System.out.println(driver.getTitle());
       driver.close();  // not quit() coz it will close both parent and child.
       driver.switchTo().window(parent);      // after closing the pop up need to come back to parent
       String expected = "PopupTest - test your popup killer software";
       Assert.assertEquals(driver.getTitle(), expected);
   }

}
