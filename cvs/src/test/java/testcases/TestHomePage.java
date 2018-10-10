package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import reporting.TestLogger;

public class TestHomePage extends HomePage {
    HomePage homepage;

    //************** Initializing elements of pages ******************************************
    @BeforeMethod
    public void intializePageElements(){
         homepage = PageFactory.initElements(driver, HomePage.class);
    }

    //************** Test-cases for all elements of nav. bar ******************************************
    @Test(priority = 1, enabled = false)
    public void testSearch() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       homepage.searchPage();
       sleepFor(2);
       takeScreenshot(driver,"search_results");         // screen shot implemented
    }

    @Test(priority = 2, enabled = false)
    public void testPharmacyPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         homepage.nevigateToPharmacyPage();
         takeScreenshot(driver,"Pharm_page");           // screen shot implemented
    }

    @Test(priority = 6, enabled = true)
    public void testClinicPage() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.nevigateClinicPage();sleepFor(5);
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "MinuteClinic | CVS Walk In Clinics");
    }

    @Test(priority = 4, enabled = true)
    public void testShopPage() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.nevigateShopPage();sleepFor(5);
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Beauty, Vitamins, Medicine & Everyday Essentials | CVS.com");
    }

    @Test(priority = 5, enabled = true)
    public void testPhotoPage() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.nevigatePhoto();sleepFor(5);
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Photo Printing Services | Print Photos Online | CVS Photo");
    }

    @Test(priority = 7, enabled = true)
    public void testNewAccountPage() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.nevigateToCreateAccount();sleepFor(5);
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Create Your CVS Account");
    }

    @Test(priority = 7, enabled = true)
    public void testExtraCarePage() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.nevigateToExtraCare();sleepFor(5);
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "CVS ExtraCare | ExtraBucks Rewards | Get Manufacturer Coupons");
    }
    //************** Test-cases for searching items with DB data  *****************************************************
    @Test(priority = 8, enabled = false)
    public void testSearchByDBData() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.searchItemsFromDB();
    }
}
