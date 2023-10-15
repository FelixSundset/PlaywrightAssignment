package test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Test;
import pages.BooztProductPage;
import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class RemoveItemsBasket extends TestBase {

    @Test
    public void RemoveProductBasket(){
        BooztProductPage booztProductPage = new BooztProductPage(page);

        booztProductPage.openProductPage();
        booztProductPage.addProductToBasket();
        booztProductPage.removeProduct();

        assertThat(page).hasURL("https://www.boozt.com/se/sv/shopcart");
    }
}


