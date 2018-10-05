package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import reporting.TestLogger;
import signinpage.PharmecyPage;

public class TestHomePage extends HomePage {
    HomePage homepage;
    PharmecyPage pharmecyPage;

    //************** Initializing elements of pages ******************************************
    @BeforeMethod
    public void intializePageElements(){
         homepage = PageFactory.initElements(driver, HomePage.class);
    }

    //************** Test-cases for all elements of nav. bar ******************************************
    @Test(priority = 1, enabled = true)
    public void testSearch() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       homepage.searchPage();
       sleepFor(2);
       takeScreenshot(driver,"search_results");         // screen shot implemented
    }

    @Test(priority = 2, enabled = true)
    public void testPharmacyPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         homepage.nevigateToPharmacyPage();
         takeScreenshot(driver,"Pharm_page");           // screen shot implemented
    }

    @Test(priority = 6, enabled = true)
    public void testClinicPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.nevigateClinicPage();
    }

    @Test(priority = 4, enabled = true)
    public void testShopPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         homepage.nevigateShopPage();
    }

    @Test(priority = 5, enabled = true)
    public void testPhotoPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.nevigatePhoto();
    }

    @Test(priority = 7, enabled = true)
    public void testNewAccountPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.nevigateToCreateAccount();
    }
    //************** Test-cases for searching items with DB data  *****************************************************
    @Test(priority = 8, enabled = true)
    public void testSearchByDBData() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.searchItemsFromDB();
    }
}
