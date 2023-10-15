package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ScrollBarPage {

    Page page;

    Locator hidingButton;

    public ScrollBarPage(Page page) {
        this.page = page;
        this.hidingButton = page.locator("#hidingButton");
    }

    public void openScrollBarPage() {
        String scrollBarPageUrl = "http://uitestingplayground.com/scrollbars";
        page.navigate(scrollBarPageUrl);
    }
    public void scrollBarTest(){

        this.hidingButton.scrollIntoViewIfNeeded();
        this.hidingButton.click();
    }
}

