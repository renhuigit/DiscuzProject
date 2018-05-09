package pageHelper;

import page.Page_Manager;
import util.SeleniumUtil;

/**
 * Created by rh on 2018/5/7.
 */
public class HelperManager {
    /**点击管理中心*/
    public static void clickManagerCenter(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_Manager.MANAGER_LINK_MANAGER);
    }
   /**输入用户名*/
   public static void sendLoginUserName(SeleniumUtil seleniumUtil,String password){
       seleniumUtil.switchToNewWindow();
       seleniumUtil.sendKeys(Page_Manager.MANAGER_INPUT_LOGINPWD,password);
   }
    /**输入密码*/
    public static void sendLoginPwd(SeleniumUtil seleniumUtil,String password){
        seleniumUtil.sendKeys(Page_Manager.MANAGER_INPUT_LOGINPWD,password);
    }
    /**点击提交按钮*/
    public static void clickSubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_Manager.MANAGER_BUTTON_LOGINSUBMIT);
    }
    /**前台已登录点击管理中心登录后台*/
    public static void loginPwdSubmit(SeleniumUtil seleniumUtil,String password) throws InterruptedException {
        clickManagerCenter(seleniumUtil);
        seleniumUtil.switchToNewWindow();
        Thread.sleep(5000);
        sendLoginPwd(seleniumUtil,password);
        clickSubmit(seleniumUtil);
    }
    /**前台未登录登录后台*/
    public static void loginAdmin(SeleniumUtil seleniumUtil,String userName,String password){
        sendLoginUserName(seleniumUtil,userName);
        sendLoginPwd(seleniumUtil,password);
        clickSubmit(seleniumUtil);
    }
    /**添加新版块*/
    /**点击论坛*/
    public static void clickForum(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_Manager.MANAGER_LINK_FORUM);
    }
    /**点击添加新版块*/
    public static void clickaddBlock(SeleniumUtil seleniumUtil){
        seleniumUtil.switchToFrame(Page_Manager.MANAGER_IFRAME_FORUM);
         seleniumUtil.click(Page_Manager.MANAGER_LINK_ADDMOD);
    }
    /**提交修改*/
    public static void submitAddBlock(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_Manager.MANAGER_BUTTON_SUMIT);
    }
    /**重构添加新版块方法*/
    public static  void addBlock(SeleniumUtil seleniumUtil){
        clickForum(seleniumUtil);
        clickaddBlock(seleniumUtil);
        submitAddBlock(seleniumUtil);
    }

}
