package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
import signinpage.PharmecyPage;
import utility.ConnectToSqlDB2;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI {

    @FindBy(xpath="//input[@id='searchbox']")
    WebElement searchBox;

    @FindBy(xpath="//button[@aria-label='Submit Search']")
    WebElement searchButton;

    @FindBy(xpath="//*[@id=\"headCVS\"]/div[3]/div/div[1]/ul/li[1]/a")
    WebElement pharmacyButton;

    @FindBy(xpath="//a[@href='/minuteclinic?icid=CVSHeader:MinuteClinic']")
    WebElement clinicButton;

    @FindBy(xpath="//a[@href=\"http://www.cvs.com/shop/?icid=CVSHeader:Shop\"]")
    WebElement shopButton;

    @FindBy(xpath="//li[@class='navPhoto']")
    WebElement photoButton;

    @FindBy(xpath="//a[contains(text(),'Create an Account')]")
    WebElement createAccountLink;

    public void searchPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBox.click();
        searchBox.sendKeys("nyquil");
        searchButton.click();
    }
    public PharmecyPage nevigatePharmacyPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        pharmacyButton.click();
        return new PharmecyPage();
    }
    public void nevigateToPharmacyPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        pharmacyButton.click();
    }
    public void nevigateClinicPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clinicButton.click();
    }
    public void nevigateShopPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopButton.click();
    }
    public void nevigatePhoto(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        photoButton.click();
    }
    public void nevigateToCreateAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        createAccountLink.click();
    }
    //************** Methods for searching items with DB data  ************************************
    List<String> listOfUsername(){
        List<String> list = new ArrayList<>();
        list.add("nyquil");
        list.add("vitamin");
        list.add("flu-shot");
        list.add("diabetics");
        list.add("kids");
        return list;
    }

    public void searchItemsFromDB() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ConnectToSqlDB2.insertDataFromArrayListToMySql(listOfUsername(), "testSearch", "items");
        List<String> itemsToSearch = ConnectToSqlDB2.readDataBase("testSearch", "items");
        for (String e: itemsToSearch){
           typeByXpath("//input[@id='searchbox']",e);
           clearInputBox(searchBox);
        }
    }
}

