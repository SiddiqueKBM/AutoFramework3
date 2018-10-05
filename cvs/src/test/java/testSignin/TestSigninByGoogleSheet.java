package testSignin;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import reporting.TestLogger;
import signinpage.PharmacyPageForGoogleSheet;
import signinpage.PharmecyPage;

import java.io.IOException;
import java.util.List;

public class TestSigninByGoogleSheet extends PharmacyPageForGoogleSheet {
    HomePage homePage;
    PharmecyPage pharmecyPage;
    PharmacyPageForGoogleSheet pharmacyPageForGoogleSheet;

    //************** Initializing elements of pages******************************************

    @BeforeMethod
    public void intializeElements(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        //pharmecyPage = PageFactory.initElements(driver,PharmecyPage.class);
        pharmacyPageForGoogleSheet = PageFactory.initElements(driver,PharmacyPageForGoogleSheet.class);
    }
    //********** checking invalid login error messages using google sheet*******************************

    @Test
    public void testSignInByInvalidCredentials() throws InterruptedException, IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.nevigateToPharmacyPage();
        sleepFor(2);
        int i = 0;
        String spreadsheetId = "1mYaS9VEd72ZWwr3-oMI6D93hMELUYgbubJi4EpL1D5A";
        String range = "Sheet1!A2:D";
        List<String> actualMessage = pharmacyPageForGoogleSheet.signInByInvalidCredentials(spreadsheetId,range);
        List<List<Object>> expectedMessage = pharmacyPageForGoogleSheet.getSpreadSheetRecords(spreadsheetId,range);
        for (List row : expectedMessage) {
             Assert.assertTrue(actualMessage.get(i).contains(row.get(3).toString()));
            i++;
        }
    }
}
