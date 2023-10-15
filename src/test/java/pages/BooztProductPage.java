package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class BooztProductPage {

    Page page;

    Locator booztCookies;
    Locator clickProduct;
    Locator varukorgButton;
    Locator continueShoppingButton;
    Locator goToBasket;
    Locator removeBasket;

    public BooztProductPage(Page page) {
        this.page = page;
        this.booztCookies = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Acceptera alla cookies"));
        this.clickProduct = page.getByAltText("Pacific Fisherman Half Zip, HOLZWEILER");
        this.varukorgButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("LÄGG I VARUKORG"));
        this.continueShoppingButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("FORTSÄTT SHOPPA"));
        this.goToBasket = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("GÅ TILL VARUKORG"));
        this.removeBasket = page.locator(".shopcart-item__actions > .palette-button");

    }

    public void openProductPage() {
        String booztProductPage = "https://www.boozt.com/se/sv/klader-for-man/klader";
        page.navigate(booztProductPage);
        booztCookies.click();
    }
    public void addProductToBasket(){
        clickProduct.click();
        varukorgButton.click();
    }

    public void removeProduct(){
        continueShoppingButton.click();
        varukorgButton.click();
        goToBasket.click();
        removeBasket.click();




    }
}
