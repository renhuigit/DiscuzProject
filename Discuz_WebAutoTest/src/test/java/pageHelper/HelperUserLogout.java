package pageHelper;

import page.Page_UserLogout;
import util.SeleniumUtil;

/**
 * Created by rh on 2018/5/7.
 */
public class HelperUserLogout {
    /**前端点击登出*/
    public static void clickLogout(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_UserLogout.LOGOUT_LINK_LOGOUT);

    }
    /**后台点击登出*/
    public static void clickAdminLogout(SeleniumUtil seleniumUtil){
        seleniumUtil.switchToDefaultContent();
        seleniumUtil.click(Page_UserLogout.LOGOUT_LINK_LOGOUT);
    }
}
