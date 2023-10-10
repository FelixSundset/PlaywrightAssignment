package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import pagebase.PageBase;

public class StartPage {
     Page page;

    Locator menuButton;
    Locator erbjudandenLink;
    Locator searchBar;
    Locator selectDeliveryButton;
    Locator homeDeliveryButton;
    Locator submitAdress;


    public StartPage(Page page) {
        this.page = page;
        this.menuButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Meny"));
        this.erbjudandenLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Erbjudanden")).first();
        this.searchBar = page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Sök i e-handeln"));
        this.selectDeliveryButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Välj leveranssätt"));
        this.submitAdress = page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Ange adress"));
        this.homeDeliveryButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Hemleverans"));
    }

    public void openStartPage() {
        String startPageUrl = "https://www.willys.se/";
        page.navigate(startPageUrl);
    }

    public void clickMenu(){
        menuButton.click();
        erbjudandenLink.click();
    }
    public void searchFor(String searchingFor){
        searchBar.fill(searchingFor);
        searchBar.press("Enter");
    }
    public void selectDelivery(String deliveryAdress){
        selectDeliveryButton.click();
        homeDeliveryButton.click();
        submitAdress.fill(deliveryAdress);


    }
}