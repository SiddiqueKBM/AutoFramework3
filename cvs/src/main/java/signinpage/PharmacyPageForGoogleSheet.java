package signinpage;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static googleAPIs.GoogleSheetReader.getSheetsService;

public class PharmacyPageForGoogleSheet extends CommonAPI{

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


    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values().get(spreadsheetId, range).execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }

    public List<String> signInByInvalidCredentials(String spreadsheetId, String range) throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(usernameBox, row.get(1).toString());
            inputValueInTextBoxByWebElement(passwordBox, row.get(2).toString());
            loginBtn.click();
            sleepFor(2);
            actual.add(getTextByWebElement(invalidLoginMessage));
            clearInputBox(usernameBox);
            clearInputBox(passwordBox);
            sleepFor(1);
        }
        return actual;
    }
}
