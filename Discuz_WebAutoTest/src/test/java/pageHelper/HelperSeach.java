package pageHelper;

import org.openqa.selenium.By;
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
        seleniumUtil.waitForElementLoad(Page_Search.SEARCH_TEXT_SEARCHTXT);
        seleniumUtil.sendKeys(Page_Search.SEARCH_TEXT_SEARCHTXT,searchContent);
    }
    /**点击搜索按钮*/
    public static void clickSearchButton(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_Search.SEARCH_BUTTON_SEARCHBUTTON);
        seleniumUtil.click(Page_Search.SEARCH_BUTTON_SEARCHBUTTON);
    }
    /**选择搜索类型：用户/贴子/本版搜索*/
    public static void selectSearchType(SeleniumUtil seleniumUtil,String value){
        seleniumUtil.waitForElementLoad(Page_Search.SEARCH_SELECT_SEARCHTYPE);
        seleniumUtil.click(Page_Search.SEARCH_SELECT_SEARCHTYPE);
        seleniumUtil.waitForElementLoad(By.linkText(value));
        seleniumUtil.click(By.linkText(value));
    }
    /**搜索类型，默认搜索帖子*/
    /**点击搜索的帖子*/
    public static void clickSearchPosting(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_Search.SEARCH_LINK_POSTINGS);
        seleniumUtil.click(Page_Search.SEARCH_LINK_POSTINGS);
    }

    /**验证是否相同*/
    public static void isExcepted(SeleniumUtil seleniumUtil, String exceptedContent){
        seleniumUtil.waitForElementLoad(Page_Search.SEARCH_LINK_POSTINGSTITLE);
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
        clickSearchPosting(seleniumUtil);
        seleniumUtil.switchToNewWindow();
        isExcepted(seleniumUtil,searchContent);
    }

    /**重构搜索方法 搜索用户*/
    public static void searchUser(SeleniumUtil seleniumUtil,String searchContent,String value){
        sendSeachContent(seleniumUtil,searchContent);
        selectSearchType(seleniumUtil,value);
        clickSearchButton(seleniumUtil);
    }



}
