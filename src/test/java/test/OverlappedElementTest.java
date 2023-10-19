package test;

import org.junit.jupiter.api.Test;
import pages.OverlappedElementPage;
import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class OverlappedElementTest extends TestBase {


@Test
    public void fillInOverlapped(){
    OverlappedElementPage overlappedElementPage = new OverlappedElementPage(page);
    overlappedElementPage.openOverlappedElementPage();
    overlappedElementPage.fillInBoxes();
    overlappedElementPage.assertion();
}
}
