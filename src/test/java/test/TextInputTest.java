package test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Test;
import pages.TextInputPage;
import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class TextInputTest extends TestBase {

    @Test
    public void TextInputTextTest(){

        TextInputPage textinputpage = new TextInputPage(page);
        textinputpage.openTextInput();
        textinputpage.fillNewButton();

        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Ny knapp"))).isVisible();


    }
}
