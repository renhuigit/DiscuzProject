package pageHelper;

import org.openqa.selenium.WebElement;
import page.Page_Search;
import util.SeleniumUtil;

import java.util.List;

/**
 * Created by rh on 2018/5/8.
 */
public class HelperSeach {
    /**输入搜索内容*/
    public static void sendSeachContent(SeleniumUtil seleniumUtil,String searchContent){
        seleniumUtil.sendKeys(Page_Search.SEARCH_TEXT_SEARCHTXT,searchContent);
    }
    /**点击搜索按钮*/
    public static void clickSearchButton(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_Search.SEARCH_BUTTON_SEARCHBUTTON);
    }
    /**搜索类型，默认搜索帖子*/

    /**验证是否相同*/
    public static void isExcepted(SeleniumUtil seleniumUtil, String exceptedContent){
        List<WebElement> elements = seleniumUtil.getWelements(Page_Search.SEARCH_LINK_POSTINGSTITLE);
        for (WebElement element:elements) {
            seleniumUtil.assertForText(element,exceptedContent);
        }
    }

    /**重构搜索方法并验证 默认搜索帖子*/
    public static void search(SeleniumUtil seleniumUtil,String searchContent){
       sendSeachContent(seleniumUtil,searchContent);
        clickSearchButton(seleniumUtil);
        seleniumUtil.switchToNewWindow();
        isExcepted(seleniumUtil,searchContent);
    }

    /**重构搜索方法 搜索用户*/


}
