package test;

import org.junit.jupiter.api.Test;
import pages.ClientSideDelayPage;
import testbase.TestBase;


public class ClientSideDelayTest extends TestBase {

    @Test
    public void DelayTest(){

        ClientSideDelayPage clientSideDelayPage = new ClientSideDelayPage(page);
        clientSideDelayPage.openClientSideDelayPage();
        clientSideDelayPage.ClickButtonAndWait();
        clientSideDelayPage.assertClient();


    }


}
