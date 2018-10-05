package signinpage;

import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;

public class LoginKeyword extends CommonAPI {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    PharmecyPage pharmecyPage = PageFactory.initElements(driver, PharmecyPage.class);

    public void navigateToLoginPage(){
        homePage.nevigatePharmacyPage();
    }

    public void login(){
        pharmecyPage.checkLoginFunction();
    }

    public void selectAction(String featureName) throws IOException, InterruptedException {
        switch (featureName) {
            case "ClickLogin":
                navigateToLoginPage();
                break;
            case "Login":
                login();
                break;
            default:
                throw new InvalidArgumentException("Invalid feature choice");
        }
    }
    DataReader reader = new DataReader();
    public String[] getDataFromSignInKeyword(String fileName) throws IOException {
        String path = "../cvs/data/" + fileName;
        String[] output = reader.colReader(path, 2);
        return output;
    }
    public void loginByKeyword() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String[] keyword = getDataFromSignInKeyword("Keywords.xls");
        for (int i = 0; i < keyword.length; i++) {
            selectAction(keyword[i]);
        }
    }
}
