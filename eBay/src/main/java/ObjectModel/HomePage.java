package ObjectModel;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy(id="#gh-shop-a")
    WebElement searchByCat;

   @FindBy(id="#gh-ac")
    WebElement searchBox;

   @FindBy(id="#gh-cat")
   WebElement allCategory;


    @FindBy(id="#gh-btn")
    WebElement searchButton;


    @FindBy(id="#gh-as-a")
    WebElement advancedSearch;


    @FindBy(xpath="//span[contains(text(),'Home')]")
    WebElement homeTab;

    @FindBy(xpath="//a[@href='/feed']")
    WebElement savedTab;

    @FindBy(xpath="//body[@class='desktop gh-1199 gh-flex']/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[1]")
    WebElement motorTab;

    @FindBy(xpath="//body[@class='desktop gh-1199 gh-flex']/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[1]")
    WebElement fashionTab;

    @FindBy(xpath="//body[@class='desktop gh-1199 gh-flex']/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[1]")
    WebElement electronicTab;

    @FindBy(xpath="//body[@class='desktop gh-1199 gh-flex']/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[1]")
    WebElement collectionsTab;

    @FindBy(xpath="//body[@class='desktop gh-1199 gh-flex']/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[1]")
    WebElement homeGardenTab;

    @FindBy(xpath="//body[@class='desktop gh-1199 gh-flex']/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[1]")
    WebElement sportinTab;

    @FindBy(xpath="//body[@class='desktop gh-1199 gh-flex']/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[1]")
    WebElement toyTab;

    @FindBy(xpath="//body[@class='desktop gh-1199 gh-flex']/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[1]")
    WebElement businessTab;

    @FindBy(xpath="//body[@class='desktop gh-1199 gh-flex']/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[1]")
    WebElement musicTab;

    @FindBy(xpath="//body[@class='desktop gh-1199 gh-flex']/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[1]")
    WebElement dealTab;

    @FindBy(xpath="//body[@class='desktop gh-1199 gh-flex']/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[1]")
    WebElement under10Tab;


}
