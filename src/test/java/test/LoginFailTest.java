package test;

import org.junit.jupiter.api.Test;
import pages.LoginPage;
import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LoginFailTest extends TestBase {

    @Test
    public void testLogin(){
        LoginPage loginPage = new LoginPage(page);
        loginPage.openLoginPage();
        loginPage.loginTest("felmailadress@fel.com", "felPassword");

        assertThat(page.getByText("Det verkar som att din e-postadress eller lösenord inte är rätt. Vänligen försök igen.")).isVisible();

}
}
