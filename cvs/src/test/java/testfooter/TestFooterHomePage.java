package testfooter;

import footerelements.FooterElementsHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestFooterHomePage extends FooterElementsHomePage {
    FooterElementsHomePage footerElementsHomePage;

    //************** Initializing elements of pages *********************
    @BeforeMethod
    public void intializePageElements(){
        footerElementsHomePage = PageFactory.initElements(driver, FooterElementsHomePage.class);
    }

    //************** Testing of different Links of homepage footer *********************
    @Test
    public void testFacebookLink() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        footerElementsHomePage.navigateFacebookLink(); sleepFor(5);
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "CVS Pharmacy - Home | Facebook");
    }
    @Test
    public void testTwitterLink() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        footerElementsHomePage.navigateTwitterLink(); sleepFor(5);
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "CVS Pharmacy (@cvspharmacy) | Twitter");
    }
    @Test
    public void testYoutubeLink() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        footerElementsHomePage.navigateYoutubeLink(); sleepFor(5);
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "CVS Health - YouTube");
    }
    @Test
    public void testMyCvsAppLink() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        footerElementsHomePage.navigateMyCvsAppLink(); sleepFor(5);
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "CVS iPad App, Download Free iPad App - CVS.com");
    }
    @Test
    public void testStoreLocatorLink() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        footerElementsHomePage.navigateStoreLocatorLink(); sleepFor(5);
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Pharmacy and Drugstore Locations | CVS Pharmacy Locator");
    }
    @Test
    public void testHelpLink() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        footerElementsHomePage.navigateHelpLink(); sleepFor(5);
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "CVS pharmacy - Frequently Asked Questions");
    }
    @Test
    public void testMyAccountLink() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        footerElementsHomePage.navigateMyAccountLink(); sleepFor(5);
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "CVS pharmacy - Sign-in or Create an Account");
    }
    @Test
    public void testTermsOfUseLink() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        footerElementsHomePage.navigateTermsOfUseLink(); sleepFor(5);
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "CVS pharmacy");
    }
    @Test
    public void testPrivacyPolicyLink() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        footerElementsHomePage.navigatePrivacyPolicyLink(); sleepFor(5);
        switchWindow(driver);String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "CVS pharmacy");
    }
}
