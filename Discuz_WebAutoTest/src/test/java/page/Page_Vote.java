package page;

import org.openqa.selenium.By;

/**
 * Created by rh on 2018/5/8.
 */
public class Page_Vote {
    /**单选框按钮*/
    public static final By VOTE_RADIO_VOTE = By.xpath("//td[@class=\"pslt\"]/input");
    /**提交按钮*/
    public static final By VOTE_BUTTON_SUBMIT = By.id("pollsubmit");
    /**票数信息、投票比例*/
    public static final By VOTE_LINK_MESSAGE = By.xpath("//table[@summary=\"poll panel\"]/tbody/tr/td[2]");
    /**选项名称*/
    public static final By VOTE_LINK_OPTIONNAME = By.xpath("//table/tbody/tr/td[@class=\"pvt\"]");
    /**投票主题名称*/
    public static final By VOTE_LINK_TITLE = By.id("thread_subject");
}
