package test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Test;
import pages.ScrollBarPage;
import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ScrollBarTest extends TestBase {

    @Test
    public void ScrollBarTest(){

        ScrollBarPage scrollBarPage = new ScrollBarPage(page);
        scrollBarPage.openScrollBarPage();
        scrollBarPage.scrollBarTest();

        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("HIDING BUTTON"))).isVisible();


    }
}
