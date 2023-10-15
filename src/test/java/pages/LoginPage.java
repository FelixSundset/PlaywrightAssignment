package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LoginPage {
    Page page;
    Locator booztCookies;
    Locator emailInput;
    Locator passwordInput;
    Locator loginButton;
    Locator logoutButton;



    public LoginPage(Page page) {
        this.page = page;
        this.booztCookies = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Acceptera alla cookies"));
        this.emailInput = page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("E-post"));
        this.passwordInput = page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Lösenord"));
        this.loginButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("LOGGA IN"));
        this.logoutButton = page.getByText("Logga ut");

    }
    public void openLoginPage () {
        String loginPageUrl = "https://www.boozt.com/se/sv/login";
        page.navigate(loginPageUrl);
        booztCookies.click();
    }
    public void loginTest(String email, String password){
        emailInput.fill(email);
        passwordInput.fill(password);
        loginButton.click();

    }
}
