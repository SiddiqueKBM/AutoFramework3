package seleniumfeatures;

import base.BaseUtil;
import org.testng.annotations.Test;

public class NavigationRefresh extends BaseUtil {
    @Test
    public void TestDragndrop() throws InterruptedException {
        // driver.get vs driver.nevigate.to: used to go to any external website

        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");
        Thread.sleep(2000);
        //back and forward button simualtion
        driver.navigate().back();       //google page
        Thread.sleep(2000);
        driver.navigate().forward();     //amazon page
        driver.navigate().refresh();    //amazon page refreshed
        Thread.sleep(2000);
    }
}
