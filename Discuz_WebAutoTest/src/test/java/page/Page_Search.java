package page;

import org.openqa.selenium.By;

/**
 * Created by rh on 2018/5/8.
 */
public class Page_Search {
    /**搜索框*/
    public static final By SEARCH_TEXT_SEARCHTXT = By.id("scbar_txt");

    /**搜索按钮*/
    public static final By SEARCH_BUTTON_SEARCHBUTTON= By.id("scbar_btn");

    /**搜索类型*/
    public static final By SEARCH_SELECT_SEARCHTYPE = By.id("scbar_type");
    /**搜索到的帖子标题*/
    public static final By SEARCH_LINK_POSTINGS = By.xpath("//h3/a");
    /**搜索到的帖子标题*/
    public static final By SEARCH_LINK_POSTINGSTITLE = By.id("thread_subject");


}
