package pageHelper;

import org.openqa.selenium.WebElement;
import page.Page_Delete;
import util.SeleniumUtil;

import java.util.List;

/**
 * Created by rh on 2018/5/7.
 */
public class HelperDelete {
    /**选择删除*/
    /**点击选中复选框*/
    public static void clickChecked(SeleniumUtil seleniumUtil,int i){
        List <WebElement> list = seleniumUtil.getWelements(Page_Delete.DELETE_CHECKED_SELECT);
        list.get(i).click();
    }
    /**点击删除*/
    public static void clickDelete(SeleniumUtil seleniumUtil){

        seleniumUtil.click(Page_Delete.DELETE_LINK_DELETE);
    }
    /**点击确定删除*/
    public static void clickSubmit(SeleniumUtil seleniumUtil){

        seleniumUtil.click(Page_Delete.DELETE_BUTTON_SUBMIT);
    }
    /**重构删除方法*/
    public static void delete(SeleniumUtil seleniumUtil,int i) throws InterruptedException {
        clickChecked(seleniumUtil,i);
        Thread.sleep(2000);
        clickDelete(seleniumUtil);
        Thread.sleep(2000);
        clickSubmit(seleniumUtil);
    }
}
