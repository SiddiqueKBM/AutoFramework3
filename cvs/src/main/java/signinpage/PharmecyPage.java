package signinpage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

import java.util.List;

public class PharmecyPage extends CommonAPI {

    @FindBy(css="#userEmail")
    WebElement userEmail;

    @FindBy(css="password")
    WebElement password;

    @FindBy(className="ice-btn-default-red")
    WebElement login;

    @FindBy(className="ng-star-inserted")
    WebElement errorMessage;

    @FindBy(xpath="//a[contains(text(), 'My Prescriptions')]")
    WebElement myPrescriptionsLink;

    @FindBy(xpath="//*[@id=\"userEmail\"]")
    WebElement usernameBox;

    @FindBy(xpath="//*[@id=\"password\"]")
    WebElement passwordBox;

    @FindBy(xpath="//button[@class = 'ice-btn-default-red']")
    WebElement loginBtn;

    @FindBy(xpath="//strong[contains(text(), 'The Password and/or')]")
     public static WebElement invalidLoginMessage;

    public void clickonMyPresciption(){
        myPrescriptionsLink.click();
    }

    public void mouseHoverOnMyPresciptionLink(){

       mouseHoverByxpath("//a[contains(text(), 'My Prescriptions')]");
    }

    public void mouseHoverOnMyPresciptionLinkTest(){
        mouseHoverByElement(myPrescriptionsLink);
    }

    public List<String> getTextOfMyPrescription(){
        List<String> items = getTextFromWebElements(myPrescriptionsLink);
        return items;
    }

    public void checkLoginFunction(){
        waitUntilClickAble(usernameBox);
        usernameBox.sendKeys("riadhul");
        passwordBox.sendKeys("fakefake");
        loginBtn.click();
    }

    public void logInUsingDataProvider(String email, String passCode) throws InterruptedException {
        SendKeys(usernameBox,email,"usernameBox");
        passwordBox.sendKeys(passCode);
        Thread.sleep(3000);
        loginBtn.click();
        String actualMessage = invalidLoginMessage.getText();
        TestLogger.log("Actual Message: "+actualMessage);
    }

}
