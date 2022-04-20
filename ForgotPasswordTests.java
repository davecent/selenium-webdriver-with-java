package password;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.InternalServerErrorPage;
import pages.RetrievePasswordPage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {

        @Test
        public void testSuccessfulRetrievePassword(){
            RetrievePasswordPage passwordPage = homePage.clickForgotPassword();
            passwordPage.setEmail("test@123.com");
            InternalServerErrorPage internalServerErrorPage = passwordPage.clickLoginButton();
            assertTrue(internalServerErrorPage.getAlertText()
                            .contains("Internal Server Error"),
                    "Text is incorrect");
        }
}
