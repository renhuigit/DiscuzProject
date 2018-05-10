package testcase;

import org.openqa.selenium.By;
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
        seleniumUtil.assertPage("论坛 - Powered by Discuz!");
        Thread.sleep(2000);
//        HelperPublish.publishByButton(seleniumUtil,0,"string","string");
        HelperPublish.PublishQuickly(seleniumUtil,"string","int");
        HelperReply.sendReply(seleniumUtil,"java");
        Thread.sleep(2000);
        HelperReply.clickReplySubmit(seleniumUtil);
        HelperUserLogout.clickLogout(seleniumUtil);
        Thread.sleep(2000);
    }


}
