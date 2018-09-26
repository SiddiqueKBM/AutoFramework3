package seleniumfeatures;

import java.util.List;

import base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class TestDropdown extends BaseUtil {

  @Test //getting the value for all items
    public void TestDropdown(){
      driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_1");
      WebElement wb1 = driver.findElement(By.xpath("//span[@class='multiselect-selected-text']"));
      wb1.click();
      List<WebElement> list = driver.findElements(By.xpath("//ul//li//a//label[contains(@class, 'checkbox')]"));
      System.out.println(list.size());

      for (WebElement e: list){

          if ( e.getText().contains("HTML")){
              System.out.println(e.getText());
              break;
          }
      }
  }

    @Test//all items checkbox test
    public void TestDropdownCkick() throws InterruptedException {
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_1");
        WebElement wb1 = driver.findElement(By.xpath("//span[@class='multiselect-selected-text']"));
        wb1.click();
        Thread.sleep(1000);
        List<WebElement> list = driver.findElements(By.xpath("//ul//li//a//label[contains(@class, 'checkbox')]"));
        for(WebElement we: list){ we.click();Thread.sleep(500);
        }
  }
}
