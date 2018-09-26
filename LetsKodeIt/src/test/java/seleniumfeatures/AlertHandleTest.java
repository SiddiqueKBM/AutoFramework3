package seleniumfeatures;

import base.BaseUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AlertHandleTest extends BaseUtil {

    @Test
    public void testAlertHandle() throws InterruptedException {
        driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),\"Try it\")]")).click();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(text);
        alert.accept();

        driver.findElement(By.xpath("//*[contains(text(),\"Try it\")]")).click();
        Thread.sleep(2000);
        alert.dismiss();
    }
}
//Here we use Alert interface methods to handle alerts