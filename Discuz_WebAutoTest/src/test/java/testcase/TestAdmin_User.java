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
        HelperPublish.clickDefultBlock(seleniumUtil);
        HelperDelete.delete(seleniumUtil,0);
       // HelperManager.loginPwdSubmit(seleniumUtil,"password");
       // HelperManager.addBlock(seleniumUtil,"北京");
        //HelperUserLogout.clickAdminLogout(seleniumUtil);
        //seleniumUtil.switchToNewWindow();
        //HelperUserLogout.clickLogout(seleniumUtil);
        //HelperUserLogin.login(seleniumUtil,"test","test");
        //HelperPublish.publishInOther(seleniumUtil,1,"selenium+java","testng+selenium框架");
        //Thread.sleep(15000);
        //HelperReply.sendReply(seleniumUtil,"selenium+testng+java框架");
        //HelperReply.clickReplySubmit(seleniumUtil);
        //HelperUserLogout.clickLogout(seleniumUtil);


    }
}
