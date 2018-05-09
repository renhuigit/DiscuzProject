package pageHelper;

import org.openqa.selenium.WebElement;
import page.Page_Publish;
import util.SeleniumUtil;

import java.util.List;

/**
 * Created by rh on 2018/5/7.
 */
public class HelperPublish {
    /**其他板块发帖*/
    /**根据索引点击想点击的版块*/
    public static void clickPublishInOther(SeleniumUtil seleniumUtil,int i){
        seleniumUtil.waitForElementLoad(Page_Publish.PUBLISH_LINK_BLOCKS);
        List<WebElement> list= seleniumUtil.getWelements(Page_Publish.PUBLISH_LINK_BLOCKS);
        list.get(i).click();
    }
    /**默认板块 快速发帖*/
    /**点击默认板块*/
    public static void clickDefultBlock(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_Publish.PUBLISH_LINK_BLOCK);
        seleniumUtil.click(Page_Publish.PUBLISH_LINK_BLOCK);
    }
    /**输入标题*/
    public static void sendTitle(SeleniumUtil seleniumUtil,String title){
        seleniumUtil.waitForElementLoad(Page_Publish.PUBLISH_TEXTAREA_TiTLE);
        seleniumUtil.sendKeys(Page_Publish.PUBLISH_TEXTAREA_TiTLE,title);
    }
    /**输入帖子内容*/
    public static void sendContent(SeleniumUtil seleniumUtil,String content){
        seleniumUtil.waitForElementLoad(Page_Publish.PUBLISH_TEXTAREA_CONTENT);
        seleniumUtil.sendKeys(Page_Publish.PUBLISH_TEXTAREA_CONTENT,content);
    }
    /**点击发表帖子按钮*/
    public static void clickPublishSubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_Publish.PUBLISH_BUTTON_PUBLISHSUBMIT);
        seleniumUtil.click(Page_Publish.PUBLISH_BUTTON_PUBLISHSUBMIT);
    }
    /**重构快速发帖方法*/
    public static void PublishQuickly(SeleniumUtil seleniumUtil,String title,String content){
        clickDefultBlock(seleniumUtil);
        sendTitle(seleniumUtil,title);
        sendContent(seleniumUtil,content);
        clickPublishSubmit(seleniumUtil);
    }
    /**其他板块快速发帖重构*/
    public static void publishInOther(SeleniumUtil seleniumUtil,int i,String title,String content){
        clickPublishInOther(seleniumUtil,i);
        sendTitle(seleniumUtil,title);
        sendContent(seleniumUtil,content);
        clickPublishSubmit(seleniumUtil);
    }
    /**发帖按钮发帖*/
    /**点击发帖按钮*/
    public static void clickPublishBlock(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_Publish.PUBLISH_BUTTON_PUBLISHBLOCK);
        seleniumUtil.click(Page_Publish.PUBLISH_BUTTON_PUBLISHBLOCK);
    }
    /**发帖标题文本框*/
    public static void sendPublishTitle(SeleniumUtil seleniumUtil,String title){
        seleniumUtil.waitForElementLoad(Page_Publish.PUBLISH_TEXT_VOTETITLE);
        seleniumUtil.sendKeys(Page_Publish.PUBLISH_TEXT_VOTETITLE,title);
    }
    /**发帖内容文本框*/
    public static void sendPublishContent(SeleniumUtil seleniumUtil,String content){
        seleniumUtil.switchToFrame("e_iframe");
        seleniumUtil.waitForElementLoad(Page_Publish.PUBLISH_TEXT_VOTECONTENT);
        seleniumUtil.sendKeys(Page_Publish.PUBLISH_TEXT_VOTECONTENT,content);
    }
    /**点击发表帖子*/
    public static void clickSubmitByButton(SeleniumUtil seleniumUtil){
        seleniumUtil.switchToDefaultContent();
        seleniumUtil.waitForElementLoad(Page_Publish.PUBLISH_BUTTON_SUBMITBYBUTTON);
        seleniumUtil.click(Page_Publish.PUBLISH_BUTTON_SUBMITBYBUTTON );
    }
    /**重构发帖按钮发帖方法*/
    public static void publishByButton(SeleniumUtil seleniumUtil,int i,String content,String title){
        clickPublishInOther(seleniumUtil,i);
        clickPublishBlock(seleniumUtil);
        sendPublishTitle(seleniumUtil,title);
        sendPublishContent(seleniumUtil,content);
        clickSubmitByButton(seleniumUtil);
    }
    /**发起投票*/
    /**点击发起投票*/
    public static void clickVote(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_Publish.PUBLISH_LINK_VOTE);
        seleniumUtil.click(Page_Publish.PUBLISH_LINK_VOTE);
    }
    /**点击添加选项链接*/
    public static void addOption(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_Publish.VOTE_LINK_ADD);
        seleniumUtil.click(Page_Publish.VOTE_LINK_ADD);
    }

    /**输入选项内容*/
    public static void sendOption(SeleniumUtil seleniumUtil,List<String> optionContent ){
        seleniumUtil.waitForElementLoad(Page_Publish.VOTE_INPUT_OPTION);
        List<WebElement> list = seleniumUtil.getWelements(Page_Publish.VOTE_INPUT_OPTION);
        if(optionContent.size()>list.size()){
            int j = optionContent.size() - list.size();
            for (int i = 0;i <= j; i++ ){
                addOption(seleniumUtil);
            }
        }
        for (int i=0;i<optionContent.size();i++) {
            list.get(i).sendKeys(optionContent.get(i));
        }

    }
    /**输入最多可选项*/
    public static void sendMaxChoices(SeleniumUtil seleniumUtil,String maxchoices){
        seleniumUtil.waitForElementLoad(Page_Publish.VOTE_INPUT_MAXCHICES);
        seleniumUtil.sendKeys(Page_Publish.VOTE_INPUT_MAXCHICES,maxchoices);
    }
    /**输入记票天数*/
    public static void sendPollDatas(SeleniumUtil seleniumUtil,String datas){
        seleniumUtil.waitForElementLoad(Page_Publish.VOTE_INPUT_POLLDATAS);
        seleniumUtil.sendKeys(Page_Publish.VOTE_INPUT_POLLDATAS,datas);
    }
    /**重构发起投票方法*/
    public static void voteByButton(SeleniumUtil seleniumUtil,int i,String content,String title,List<String> optionContent) throws InterruptedException {
        clickPublishInOther(seleniumUtil,i);
        clickPublishBlock(seleniumUtil);
        clickVote(seleniumUtil);
        sendPublishTitle(seleniumUtil,title);
        sendOption(seleniumUtil,optionContent);
        sendPublishContent(seleniumUtil,content);
        clickSubmitByButton(seleniumUtil);
    }

}
