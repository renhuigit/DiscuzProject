package page;

import org.openqa.selenium.By;

/**
 * Created by rh on 2018/5/7.
 */
public class Page_UserLogin {
    /**用户名*/
    public static final By LOGIN_INPUT_USERNAME = By.id("ls_username");
    /**密码*/
    public static final By LOGIN_INPUT_PASSWORD = By.id("ls_password");
    /**登录按钮*/
    public static final By LOGIN_BUTTON_LOGIN = By.xpath("//*[@id=\"lsform\"]/div/div/table/tbody/tr[2]/td[3]/button");
    /**自动登录*/
    public static final By LOGIN_SELECT_AUTOLOGIN = By.id("ls_cookietime");
    /**找回密码*/
    public static final By LOGIN_LINK_FINGPWD = By.linkText("找回密码");
    /**立即注册*/
    public static final By LOGIN_LINK_REGIST = By.linkText("立即注册");
}
