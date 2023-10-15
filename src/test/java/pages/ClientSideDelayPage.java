package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertNotNull;

public class ClientSideDelayPage {

    Page page;

    Locator button;
    Locator clientAssert;

    public ClientSideDelayPage(Page page) {
        this.page = page;
        this.button = page.locator("#ajaxButton");
        this.clientAssert = page.locator(("//p[@class='bg-success'])[1]"));
    }

    public void openClientSideDelayPage() {
        String clientSideDelayPageUrl = "http://uitestingplayground.com/clientdelay";
        page.navigate(clientSideDelayPageUrl);
    }
    public void ClickButtonAndWait(){
        button.click();
        page.waitForTimeout(15000);
        button.click();
    }
    public void assertClient(){

        assertNotNull(clientAssert);
        String actualText = page.innerText("p.bg-success");
        String expectedText = "Data calculated on the client side.";
        Assertions.assertEquals(expectedText, actualText);


    }
}