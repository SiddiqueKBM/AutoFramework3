package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopPage {
    @FindBy(xpath="//input[@id='searchbox']")
    WebElement searchBox;

    @FindBy(xpath="//button[@aria-label='Submit Search']")
    WebElement searchButton;
}
