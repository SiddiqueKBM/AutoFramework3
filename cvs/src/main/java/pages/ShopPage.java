package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class ShopPage extends CommonAPI {
    @FindBy(xpath="//p[contains(text(),'Vitamins')]")
    WebElement shopVitaminLink;

    @FindBy(xpath="//p[contains(text(),'Beauty')]")
    WebElement shopBeautyLink;

    @FindBy(xpath="//p[contains(text(),'Skin Care')]")
    WebElement shopSkinCareLink;

    @FindBy(xpath="//p[contains(text(),'Hair Care')]")
    WebElement shopHairCareLink;

    @FindBy(xpath="//p[contains(text(),'Personal Care')]")
    WebElement shopPersonalcareLink;

    public void navigateShopVitaminLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopVitaminLink.click();
    }
    public void navigateShopBeautyLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopBeautyLink.click();
    }
    public void navigateShopSkinCareLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopSkinCareLink.click();
    }
    public void navigateShophairCareLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopHairCareLink.click();
    }
    public void navigateShopPersonalCareLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopPersonalcareLink.click();
    }
}
