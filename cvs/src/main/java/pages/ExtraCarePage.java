package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class ExtraCarePage extends CommonAPI {

    @FindBy(partialLinkText="CVS Pharmacy email")
    WebElement signUpForEmailLink;

    @FindBy(partialLinkText="Download our app")
    WebElement appDownloadLink;

    @FindBy(partialLinkText="Shop my Weekly Ad")
    WebElement weeklyAddLink;

    @FindBy(partialLinkText="ExtraCare Pharmacy & Health Rewards")
    WebElement rewardsLink;

    @FindBy(partialLinkText="BeautyClub")
    WebElement beautyClubLink;

    @FindBy(partialLinkText="digital receipts")
    WebElement digitalReceiptslLink;

    public void navigateSignUpForEmailLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signUpForEmailLink.click();
    }
    public void navigateAppDownloadLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appDownloadLink.click();
    }
    public void navigateWeeklyAddLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        weeklyAddLink.click();
    }
    public void navigateRewardsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        rewardsLink.click();
    }
    public void navigateBeautyClubLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        beautyClubLink.click();
    }
    public void navigateDigitalReceiptLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        digitalReceiptslLink.click();
    }
}


