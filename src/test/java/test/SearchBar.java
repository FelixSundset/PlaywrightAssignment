package test;

import org.junit.jupiter.api.Test;
import pages.StartPage;
import testbase.TestBase;

public class SearchBar extends TestBase {

    @Test
    public void searchbarTest(){

        StartPage startpage = new StartPage(page);

        startpage.openStartPage();
        startpage.searchFor("ostbågar");

        startpage.assertionSearchbar();

    }

}
