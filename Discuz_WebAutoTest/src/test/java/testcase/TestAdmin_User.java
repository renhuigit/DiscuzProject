package testcase;

import org.testng.annotations.Test;
import pageHelper.*;

/**
 * Created by rh on 2018/5/7.
 */
public class TestAdmin_User extends BasicTestCase{
    @Test
    public void test() throws InterruptedException {
        HelperUserLogin.login(seleniumUtil,"admin","password");
        Thread.sleep(3000);
        HelperPublish.clickDefultBlock(seleniumUtil);
        Thread.sleep(3000);
        HelperDelete.delete(seleniumUtil,2);
        HelperManager.loginPwdSubmit(seleniumUtil,"password");
        Thread.sleep(4000);
        HelperManager.addBlock(seleniumUtil);
        HelperUserLogout.clickAdminLogout(seleniumUtil);
        seleniumUtil.switchToNewWindow();
        Thread.sleep(4000);
        HelperUserLogout.clickLogout(seleniumUtil);
        Thread.sleep(4000);
        HelperUserLogin.login(seleniumUtil,"test","test");
        Thread.sleep(3000);
        HelperPublish.publishInOther(seleniumUtil,1,"selenium+java","testng+selenium框架");
        Thread.sleep(16000);
        HelperReply.sendReply(seleniumUtil,"selenium+testng+java框架");
        Thread.sleep(4000);
        HelperReply.clickReplySubmit(seleniumUtil);
        Thread.sleep(5000);


    }
}
