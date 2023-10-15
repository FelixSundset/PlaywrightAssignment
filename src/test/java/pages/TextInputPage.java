package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class TextInputPage {

    Page page;

    Locator myButton;
    Locator updatingButton;

    public TextInputPage(Page page) {
        this.page = page;
        this.myButton = page.locator("#newButtonName");
        this.updatingButton = page.locator("#updatingButton");
    }

    public void openTextInput() {
        String textInputUrl = "http://uitestingplayground.com/textinput";
        page.navigate(textInputUrl);

    }

    public void fillNewButton(){

        myButton.fill("Ny knapp");
        updatingButton.click();
    }
}
