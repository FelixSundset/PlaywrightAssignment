package test;

import org.junit.jupiter.api.Test;
import pages.StartPage;
import testbase.TestBase;

public class ErbjudandenTest extends TestBase {

    @Test
    public void erbjudandenKlick(){

        StartPage startpage = new StartPage(page);

        startpage.openStartPage();
        startpage.clickMenu();
    }

}
