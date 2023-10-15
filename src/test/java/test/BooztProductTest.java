package test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Test;
import pages.BooztProductPage;
import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class BooztProductTest extends TestBase {

    @Test
    public void ProductTest(){
        BooztProductPage booztProductPage = new BooztProductPage(page);

        booztProductPage.openProductPage();
        booztProductPage.addProductToBasket();

        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("GÅ TILL VARUKORG"))).isVisible();


    }
}
