package pageHelper;

import page.Page_Publish;
import page.Page_Reply;
import util.SeleniumUtil;

/**
 * Created by rh on 2018/5/7.
 */
public class HelperReply {
    /**快速回复*/
    /**点击默认板块*/
    public static void clickDefultBloc(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_Reply.COMMENT_LINK_BLOCK);
    }
    /**点击第一条帖子*/
    public static void clickFirstPosting(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_Reply.COMMENT_LINK_POSTINGS);
    }
    /**输入回复内容*/
    public static void sendReply(SeleniumUtil seleniumUtil,String reply){
        seleniumUtil.sendKeys(Page_Reply.COMMENT_TEXTAREA_MESSAGE,reply);
    }
    /**点击回复按钮*/
    public static void clickReplySubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_Reply.COMMENT_BUTTON_REPLYSUBMIT);
    }
    /**快速回复方法重构*/
    public static void replyQuickly(SeleniumUtil seleniumUtil,String content){
        clickDefultBloc(seleniumUtil);
        clickFirstPosting(seleniumUtil);
        sendReply(seleniumUtil,content);
        clickReplySubmit(seleniumUtil);
    }

}
