package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class SampleAppPage {

    Page page;
    Locator userName;
    Locator password;
    Locator loginButton;

    public SampleAppPage(Page page){
        this.page = page;
        this.userName = page.getByPlaceholder("User name");
        this.password = page.getByPlaceholder("********");
        this.loginButton = page.locator("#login");

    }

    public void openSampleAppPage(){
        String sampleAppPageUrl = "http://uitestingplayground.com/sampleapp";
        page.navigate(sampleAppPageUrl);
    }
    public void loginSampleApp(){
        userName.fill("FelixSampleApp");
        password.fill("pwd");
        loginButton.click();

    }

}
