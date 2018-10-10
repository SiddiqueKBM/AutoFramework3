package footerelements;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class FooterElementsHomePage extends CommonAPI {
    @FindBy(xpath="//a[contains(text(),'Facebook')]")
    WebElement facabookIcon;

    @FindBy(xpath="//a[contains(text(),'Twitter')]")
    WebElement twitterIcon;

    @FindBy(xpath="//a[contains(text(),'Youtube')]")
    WebElement youtubeIcon;

    @FindBy(xpath="//a[contains(text(),'Phone')]")
    WebElement myCvsAppIcon;

    @FindBy(xpath="//a[contains(text(),'My Account')]")
    WebElement myAccountLink;

    @FindBy(xpath="//a[contains(text(),'Help')]")
    WebElement helpLink;

    @FindBy(xpath="//a[contains(text(),'CVS/pharmacy Stores')]")
    WebElement storeLocator;

    @FindBy(xpath="//a[contains(text(),'Privacy Policy')]")
    WebElement privacyPolicyLink;

    @FindBy(xpath="//a[contains(text(),'Terms of Use')]")
    WebElement termsOfUseLink;

    public void navigateFacebookLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        facabookIcon.click();
    }
    public void navigateTwitterLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterIcon.click();
    }
    public void navigateYoutubeLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        youtubeIcon.click();
    }
    public void navigateMyCvsAppLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        myCvsAppIcon.click();
    }
    public void navigateStoreLocatorLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        storeLocator.click();
    }
    public void navigateHelpLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        helpLink.click();
    }
    public void navigateMyAccountLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        myAccountLink.click();
    }
    public void navigatePrivacyPolicyLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        privacyPolicyLink.click();
    }
    public void navigateTermsOfUseLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        termsOfUseLink.click();
    }
}
