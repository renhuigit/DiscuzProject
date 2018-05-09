package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperPublish;
import pageHelper.HelperReply;
import pageHelper.HelperUserLogin;
import pageHelper.HelperUserLogout;

/**
 * Created by rh on 2018/5/7.
 */
public class TestLogin extends BasicTestCase {
    @Test
    public void testLogin() throws InterruptedException {
        HelperUserLogin.login(seleniumUtil,"admin","password");
        HelperPublish.publishByButton(seleniumUtil,2,"string","string");
//      HelperPublish.PublishQuickly(seleniumUtil,"string","int");
        HelperReply.sendReply(seleniumUtil,"java");
        HelperReply.clickReplySubmit(seleniumUtil);
        HelperUserLogout.clickLogout(seleniumUtil);
        Thread.sleep(2000);
    }


}
