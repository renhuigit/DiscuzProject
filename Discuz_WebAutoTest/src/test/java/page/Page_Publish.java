package page;

import org.openqa.selenium.By;

/**
 * Created by rh on 2018/5/7.
 */
public class Page_Publish {
    /**默认板块*/
    public static final By PUBLISH_LINK_BLOCK = By.linkText("默认版块");
    /**查找版块*/
    public static final By PUBLISH_LINK_BLOCKS = By.xpath("//td/a/img");

    /**快速发帖*/
    /**快速发帖标题文本框*/
    public static final By PUBLISH_TEXTAREA_TiTLE = By.id("subject");
    /**快速发帖发表内容文本框*/
    public static final By PUBLISH_TEXTAREA_CONTENT = By.id("fastpostmessage");
    /**快速发帖发表贴子按钮*/
    public static final By PUBLISH_BUTTON_PUBLISHSUBMIT = By.id("fastpostsubmit");

    /**通过发表按钮发表帖子*/
    /**发表按钮*/
    public static final By PUBLISH_BUTTON_PUBLISHBLOCK = By.id("newspecial");

    /**投票帖子*/
    /**发起投票连接*/
    public static final By PUBLISH_LINK_VOTE = By.linkText("发起投票");
    /**帖子标题*/
    public static final By PUBLISH_TEXT_VOTETITLE = By.id("subject");
    /**帖子内容*/
    public static final By PUBLISH_TEXT_VOTECONTENT = By.tagName("body");
    /**发表按钮*/
    public static final By PUBLISH_BUTTON_SUBMITBYBUTTON = By.id("postsubmit");
    /**投票选项*/
    public static final By VOTE_INPUT_OPTION = By.xpath("//p/input[@name=\"polloption[]\"]");
    /**+增加一项*/
    public static final By VOTE_LINK_ADD =By.xpath("//*[@id=\"pollm_c_1\"]/p[5]/a");
    /**最多可选项*/
    public static final By VOTE_INPUT_MAXCHICES= By.id("postsubmit");
    /**记票天数*/
    public static final By VOTE_INPUT_POLLDATAS = By.id("polldatas");










}
