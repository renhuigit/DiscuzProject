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
        Thread.sleep(3000);
        HelperPublish.publishByButton(seleniumUtil,2,"string","string");
//      HelperPublish.PublishQuickly(seleniumUtil,"string","int");
        Thread.sleep(3000);
        HelperReply.sendReply(seleniumUtil,"java");
        HelperReply.clickReplySubmit(seleniumUtil);
        Thread.sleep(3000);
        HelperUserLogout.clickLogout(seleniumUtil);
    }


}
