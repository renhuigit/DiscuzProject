package page;

import org.openqa.selenium.By;

/**
 * Created by rh on 2018/5/7.
 */
public class Page_Reply {
    /**默认板块*/
    public static final By COMMENT_LINK_BLOCK = By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[1]/td[2]/h2/a");
    /**帖子*/
    public static final By COMMENT_LINK_POSTINGS = By.xpath("//*[@class=\"s xst\"]");
    /**回复*/
    public static final By COMMENT_LINK_REPLY = By.linkText("回复");
    /**回帖文本框*/
    public static final By COMMENT_TEXTAREA_MESSAGE = By.name("message");
    /**发表回复按钮*/
    public static final By COMMENT_BUTTON_REPLYSUBMIT = By.xpath("//button[@name=\"replysubmit\"]");
    /**回复按钮1*/
    public static final By COMMENT_BUTTON_REPLY1 = By.xpath("//*[@id=\"post_reply\"]/img");





}
