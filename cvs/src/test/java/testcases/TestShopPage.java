package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ShopPage;
import reporting.TestLogger;

public class TestShopPage extends ShopPage {
    HomePage homePage;
    ShopPage shopPage;

    //************** Initializing elements of pages *********************
    @BeforeMethod
    public  void initializePages(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        shopPage = PageFactory.initElements(driver, ShopPage.class);
    }

    //************** Testing of different Links of Shop page**************
    @Test
    public void testShopVitaminLink() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.nevigateShopPage();
        shopPage.navigateShopVitaminLink();  sleepFor(10);
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Vitamins & Supplements | Multivitamins, Minerals & Herbal Supplements | CVS.com");
    }
    @Test
    public void testShopBeautyLink() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.nevigateShopPage();
        shopPage.navigateShopBeautyLink();  sleepFor(10);
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Best Beauty Products | Beauty Supply Store Online | CVS.com");
    }
    @Test
    public void testShopSkinCareLink() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.nevigateShopPage();
        shopPage.navigateShopSkinCareLink();  sleepFor(10);
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Skin Care | Face Wash, Moisturizer, Anti Aging | CVS.com");
    }
    @Test
    public void testShopHairCareLink() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.nevigateShopPage();
        shopPage.navigateShophairCareLink();  sleepFor(10);
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Hair Care Products | Shampoo & Conditioner | Hair Dye | CVS.com");
    }
    @Test
    public void testShopPersonalCareLink() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.nevigateShopPage();
        shopPage.navigateShopPersonalCareLink();  sleepFor(10);
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Personal Care | Products & Health Resources | CVS.com");
    }
}
