package test;

import org.junit.jupiter.api.Test;
import pages.StartPage;
import testbase.TestBase;

public class selectDelivery extends TestBase {

    @Test
    public void selectDeliveryTest(){

        StartPage startpage = new StartPage(page);

        startpage.openStartPage();
        startpage.selectDelivery("Kammakargatan 50");

        startpage.assertTimeButton();
    }


}
