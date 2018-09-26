package Search;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InputSearch extends CommonAPI {
    @Test
    public void search() throws Exception{
        driver.findElement(By.cssSelector("#name")).sendKeys("Riadh");
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(5000);

    }
}
