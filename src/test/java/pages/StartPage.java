package pages;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Assertions;
import pagebase.PageBase;

import java.util.concurrent.Flow;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StartPage {
    Page page;

    Locator menuButton;
    Locator erbjudandenLink;
    Locator searchBar;
    Locator selectDeliveryButton;
    Locator homeDeliveryButton;
    Locator submitAdress;
    Locator klickAdress;
    Locator okButton;
    Locator cookieAccept;
    Locator imgAssert;
    Locator clickCheez;



    public StartPage(Page page) {
        this.page = page;
        this.menuButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Meny"));
        this.erbjudandenLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Erbjudanden")).first();
        this.searchBar = page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Sök i e-handeln"));
        this.clickCheez = page.locator("(//img[@data-nimg='1'])[1]");
        this.selectDeliveryButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Välj leveranssätt"));
        this.submitAdress = page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Ange adress"));
        this.homeDeliveryButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Hemleverans"));
        this.klickAdress = page.getByTestId("full-address-list-item");
        this.okButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK"));
        this.cookieAccept = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Acceptera alla cookies"));
        this.imgAssert = page.getByTestId("main-image");
    }

    public void openStartPage() {
        String startPageUrl = "https://www.willys.se/";
        page.navigate(startPageUrl);
        cookieAccept.click();
    }

    public void clickMenu() {
        menuButton.click();
        erbjudandenLink.click();
    }

    public void searchFor(String searchingFor) {
        searchBar.fill(searchingFor);
        searchBar.press("Enter");
        clickCheez.click();
    }

    public void selectDelivery(String deliveryAdress) {
        selectDeliveryButton.click();
        homeDeliveryButton.click();
        submitAdress.fill(deliveryAdress);
        klickAdress.click();
        okButton.click();
    }

    public void assertionSearchbar(){

        assertNotNull(imgAssert);

        String altText = imgAssert.getAttribute("alt");

        assertEquals("Cheez Doodles 285g Olw", altText);
    }

    public void assertTimeButton(){

        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("16:00 - 18:00"))).isVisible();
    }



}