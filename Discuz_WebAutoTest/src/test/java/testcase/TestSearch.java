package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperSeach;
import pageHelper.HelperUserLogin;
import pageHelper.HelperUserLogout;

/**
 * Created by rh on 2018/5/8.
 */
public class TestSearch extends BasicTestCase{
    @Test
    public void testSearch() throws InterruptedException {
        HelperUserLogin.login(seleniumUtil,"admin","password");
        HelperSeach.search(seleniumUtil,"selenium+java");
        HelperUserLogout.clickLogout(seleniumUtil);

    }
}
