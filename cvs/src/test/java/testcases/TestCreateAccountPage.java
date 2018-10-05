package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.HomePage;
import reporting.TestLogger;

public class TestCreateAccountPage extends CreateAccountPage {
    HomePage homePage;
    CreateAccountPage createAccountPage;

    //************** Initializing elements of pages ******************************************
    @BeforeMethod
    public void intializePageElements(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        createAccountPage = PageFactory.initElements(driver, CreateAccountPage.class);
    }

    //************** Test-cases for all elements for sign up ******************************************
    @Test(priority = 1, enabled = true)
    public void testInputsForSignUp() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.nevigateToCreateAccount();
        Thread.sleep(5000);
        createAccountPage.putFirstName();
        createAccountPage.putLastName();
        createAccountPage.putEmail();
    }
}
