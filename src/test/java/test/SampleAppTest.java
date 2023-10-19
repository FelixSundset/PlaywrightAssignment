package test;

import org.junit.jupiter.api.Test;
import pages.SampleAppPage;
import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class SampleAppTest extends TestBase {

    @Test
    public void LoginSampleApp(){
        SampleAppPage sampleAppPage = new SampleAppPage(page);
        sampleAppPage.openSampleAppPage();
        sampleAppPage.loginSampleApp();

        assertThat(page.locator("#loginstatus")).hasText("Welcome, FelixSampleApp!");
    }
}
