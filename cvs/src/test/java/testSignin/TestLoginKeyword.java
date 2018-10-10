package testSignin;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import signinpage.LoginKeyword;

import java.io.IOException;

public class TestLoginKeyword extends LoginKeyword {
    LoginKeyword loginKeyword;

    //************** Initializing elements of pages *********************
    @BeforeMethod
    public void intializePage(){
        loginKeyword = PageFactory.initElements(driver, LoginKeyword.class);
    }

    //************** Testing of login function (keyword-driven) ***************
    @Test
    public void testLoginByKeyword() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        loginKeyword.loginByKeyword();
    }
}
