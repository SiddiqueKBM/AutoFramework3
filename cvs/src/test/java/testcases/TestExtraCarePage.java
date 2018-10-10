package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ExtraCarePage;
import pages.HomePage;
import reporting.TestLogger;

public class TestExtraCarePage extends ExtraCarePage {
    ExtraCarePage extraCarePage;
    HomePage homePage;

    //************** Initializing elements of pages *********************
    @BeforeMethod
    public  void initializePages(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        extraCarePage = PageFactory.initElements(driver, ExtraCarePage.class);
    }
    //************** Testing of different Links of Extra-Care page************
    @Test
    public void testSignUpEmailLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.nevigateToExtraCare();
        extraCarePage.navigateSignUpForEmailLink();
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "CVS Pharmacy Email");
    }
    @Test
    public void testAppDownloadLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.nevigateToExtraCare();
        extraCarePage.navigateAppDownloadLink();
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "CVS Mobile APP: Pharmacy, Shop, Photo, ExtraCare");
    }
    @Test
    public void testWeeklyAddLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.nevigateToExtraCare();
        extraCarePage.navigateWeeklyAddLink();
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "CVS Weekly Ad | Online Circular");
    }
    @Test
    public void testHealthRewardsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.nevigateToExtraCare();
        extraCarePage.navigateRewardsLink();
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "ExtraCare Pharmacy & Health Rewards - CVS pharmacy");
    }
    @Test
    public void testBeautyClubLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.nevigateToExtraCare();
        extraCarePage.navigateBeautyClubLink();
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Join ExtraCare Beauty Club | ExtraCare Beauty Club | Join Beauty Club");
    }
    @Test
    public void testDigitalReceiptLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.nevigateToExtraCare();
        extraCarePage.navigateDigitalReceiptLink();
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Digital Receipts | Paperless Receipts | CVS");
    }
}
