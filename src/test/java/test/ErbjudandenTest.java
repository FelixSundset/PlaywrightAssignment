package test;

import com.microsoft.playwright.APIResponse;
import com.microsoft.playwright.Request;
import com.microsoft.playwright.Response;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.StartPage;
import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ErbjudandenTest extends TestBase {

    @Test
    public void erbjudandenKlick(){

        StartPage startpage = new StartPage(page);

        startpage.openStartPage();
        startpage.clickMenu();

        Response response = page.navigate("https://www.willys.se/erbjudanden/ehandel");
        Request request = response.request();

        APIResponse apiResponse = context.request().get("https://www.willys.se/erbjudanden/ehandel");
        Assertions.assertEquals(apiResponse.status(), 200);

        System.out.println(apiResponse.status());


    }

}
