package pageHelper;

import page.Page_UserLogin;
import util.SeleniumUtil;

/**
 * Created by rh on 2018/5/7.
 */
public class HelperUserLogin {
    /**输入用户名*/
    public static void sendUsername(SeleniumUtil seleniumUtil,String userName){
        seleniumUtil.sendKeys(Page_UserLogin.LOGIN_INPUT_USERNAME,userName);
    }
    /**输入密码*/
    public static void sendPassword(SeleniumUtil seleniumUtil,String password){
        seleniumUtil.sendKeys(Page_UserLogin.LOGIN_INPUT_PASSWORD,password);
    }
    /**点击选择自动登录*/
    public static void selectAutoLogin(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_UserLogin.LOGIN_SELECT_AUTOLOGIN);
    }
    /**点击登录按钮*/
    public static void clickLoginButton(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_UserLogin.LOGIN_BUTTON_LOGIN);
    }
    /**重构登录方法(未选择自动登录)*/
    public static void login(SeleniumUtil seleniumUtil,String userName,String password){
        sendUsername(seleniumUtil,userName);
        sendPassword(seleniumUtil, password);
        clickLoginButton(seleniumUtil);
    }
    /**重构登录方法(未选择自动登录)*/
    public static void loginSelectAuto(SeleniumUtil seleniumUtil,String userName,String password){
        sendUsername(seleniumUtil,userName);
        sendPassword(seleniumUtil, password);
        selectAutoLogin(seleniumUtil);
        clickLoginButton(seleniumUtil);
    }
}
