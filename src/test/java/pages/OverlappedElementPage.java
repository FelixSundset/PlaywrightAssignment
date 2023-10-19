package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class OverlappedElementPage {

    Page page;
    Locator idBox;
    Locator nameBox;
    Locator scrollContainer;

    public OverlappedElementPage(Page page) {
        this.page = page;
        this.idBox = page.getByPlaceholder("Id");
        this.nameBox = page.getByPlaceholder("Name");
        this.scrollContainer = page.locator("section div").nth(2);
    }

    public void openOverlappedElementPage() {
        String overlappedPageUrl = "http://uitestingplayground.com/overlapped";
        page.navigate(overlappedPageUrl);
    }

    public void fillInBoxes(){
        idBox.fill("Hejhej");
        scrollContainer.evaluate("node => node.scrollBy(0, 1000)");
        nameBox.fill("Dådå");
    }

    public void assertion(){

        assertThat(nameBox).hasValue("Dådå");

    }
}