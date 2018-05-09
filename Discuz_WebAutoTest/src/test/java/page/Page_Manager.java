package page;

import org.openqa.selenium.By;

/**
 * Created by rh on 2018/5/7.
 */
public class Page_Manager {
    /**创建新版块*/
    /**管理中心*/
    public static final By MANAGER_LINK_MANAGER = By.xpath("//*[@id=\"um\"]/p[1]/a[6]");
    /**登录管理账号后台*/
    /**用户名*/
    public static final By MANAGER_INPUT_LOGINNAME = By.name("admin_username");
    /**密码*/
    public static final By MANAGER_INPUT_LOGINPWD = By.name("admin_password");
    /**提交按钮*/
    public static final By MANAGER_BUTTON_LOGINSUBMIT = By.name("submit");
    /**论坛*/
    public static final By MANAGER_LINK_FORUM = By.id("header_forum");
    /**添加新版块*/
    public static final By MANAGER_LINK_ADDMOD = By.className("addtr");
    /**论坛iframeID*/
    public static final String MANAGER_IFRAME_FORUM = "main";
    /**提交按钮*/
    public static final By MANAGER_BUTTON_SUMIT = By.name("editsubmit");






}
