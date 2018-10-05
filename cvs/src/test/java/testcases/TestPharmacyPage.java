package testcases;

import dataProviderXls.XlsDataReaderUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import signinpage.PharmecyPage;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestPharmacyPage extends PharmecyPage {

    HomePage homePage;
    PharmecyPage pharmecyPage;

    //************** Initializing elements of pages******************************************
    @BeforeMethod
    public void intializeElements(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage = PageFactory.initElements(driver, HomePage.class);
        pharmecyPage = PageFactory.initElements(driver,PharmecyPage.class);
    }

    //************** Testing of mouse hover functionality ************************************
    @Test(priority = 1)
    public void myPharmacyLinkTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.nevigateToPharmacyPage();
        pharmecyPage.mouseHoverOnMyPresciptionLink();
    }

    @Test(priority = 2)
    public void myPharmacyLinkTest2(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.nevigateToPharmacyPage();
        pharmecyPage.mouseHoverOnMyPresciptionLinkTest();
    }

    //************** Testing of drop-down menu-items  **************************************
    @Test(priority = 3)
    public void myPharmacyLinkTextCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.nevigateToPharmacyPage();
        pharmecyPage.mouseHoverOnMyPresciptionLinkTest();
        List<String> itemOfDropdown = getTextOfMyPrescription();
        for(String e: itemOfDropdown) {
            System.out.println(e);
        }
        List<String>actual = new ArrayList<>();
        actual.add("All Prescriptions"); actual.add("Recent Orders"); actual.add("Transfer Rx to CVS");
        actual.add("Financial Summary"); actual.add("New Prescription"); actual.add("Print Current Prescriptions");
        actual.add("Refill as Guest");
        Assert.assertEquals(actual, itemOfDropdown);
    }

    //************** Testing login function with Excel data provided in script ********************
    @Test(priority = 4)
    public void loginTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.nevigateToPharmacyPage();
        pharmecyPage.checkLoginFunction();
        String actual = invalidLoginMessage.getText();
        String expected = "The Password and/or Username you entered are not valid. " +
                "Please try again.";
        Assert.assertEquals(actual,expected);
    }

    //************** Testing login function with "Excel" data provider *******************************
    @DataProvider
    public Iterator<Object[]> supplyDataExcel(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ArrayList<Object[]> testDataExcel = XlsDataReaderUtil.getDataFromExcel();
        return testDataExcel.iterator();
    }

    @Test(priority = 5, dataProvider = "supplyDataExcel")
    public void loginTestWithDataProvider(String email, String passCode, String message) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.nevigateToPharmacyPage();
        pharmecyPage.logInUsingDataProvider(email, passCode);
        String actual = invalidLoginMessage.getText();
        Assert.assertEquals(actual,message);
        TestLogger.log("Test passed!");
    }
}
