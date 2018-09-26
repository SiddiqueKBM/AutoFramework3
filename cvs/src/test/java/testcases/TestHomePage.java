package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import signinpage.PharmecyPage;

public class TestHomePage extends HomePage {
    HomePage homepage;
    PharmecyPage pharmecyPage;

     @BeforeMethod
    public void intializePageElements(){
         homepage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1, enabled = true)
    public void testSearch() throws InterruptedException {
       homepage.searchPage();
       sleepFor(2);
       takeScreenshot(driver,"search_results");         // screen shot implemented
    }

    @Test(priority = 2, enabled = true)
    public void testPharmacyPage() {
         homepage.nevigateToPharmacyPage();
         takeScreenshot(driver,"Pharm_page");           // screen shot implemented
    }

    @Test(priority = 6, enabled = false)
    public void testClinicPage(){
        homepage.nevigateClinicPage();
    }

    @Test(priority = 4, enabled = false)
    public void testShopPage(){
        homepage.nevigateShopPage();
    }

    @Test(priority = 5, enabled = false)
    public void testPhotoPage(){
        homepage.nevigatePhoto();
    }

    @Test(priority = 7, enabled = false)
    public void testNewAccountPage(){
        homepage.nevigateToCreateAccount();
    }
}
