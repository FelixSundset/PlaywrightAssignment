package test;

import org.junit.jupiter.api.Test;
import pages.LoginPage;
import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LoginTest extends TestBase {

    @Test
    public void testLogin(){
        LoginPage loginPage = new LoginPage(page);
        loginPage.openLoginPage();
        loginPage.loginTest("felix.sundset@yh.nackademin.se", "Felix1362!");

        assertThat(page).hasURL("https://www.boozt.com/se/sv/customer");

    }
}
