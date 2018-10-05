package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class CreateAccountPage extends CommonAPI {
    @FindBy(xpath="//input[@name='firstName']")
    WebElement firstNameBox;

    @FindBy(xpath="//input[@name='lastName']")
    WebElement lastNameBox;

    @FindBy(xpath="//input[@id='email']")
    WebElement emailBox;

    public void putFirstName(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        firstNameBox.click();
        firstNameBox.sendKeys("Harry");
    }
    public void putLastName(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        lastNameBox.click();
        lastNameBox.sendKeys("Parker");
    }
    public void putEmail(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        emailBox.click();
        emailBox.sendKeys("Parker@gmail.com");
    }
}
