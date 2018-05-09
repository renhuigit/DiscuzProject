package pageHelper;

import org.openqa.selenium.WebElement;
import page.Page_Vote;
import util.SeleniumUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rh on 2018/5/8.
 */
public class HelperVote {
    /**选择选项*/
    public  static void clickChoiceMessage(SeleniumUtil seleniumUtil,int i){
        List<WebElement> element = seleniumUtil.getWelements(Page_Vote.VOTE_RADIO_VOTE);
        element.get(i).click();
    }
    /**点击投票*/
    public  static void clickPollSubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_Vote.VOTE_BUTTON_SUBMIT);
    }
    /**重构投票方法*/
    public  static void vote(SeleniumUtil seleniumUtil,int i){
        clickChoiceMessage(seleniumUtil,i);
        clickPollSubmit(seleniumUtil);
    }
    /**获取票数比例*/
    public static List<String> getNumberOfVotes(SeleniumUtil seleniumUtil){
        List<WebElement> elements = seleniumUtil.getWelements(Page_Vote.VOTE_LINK_MESSAGE);
        List<String> votes = new ArrayList<String>();
        int j = 0;
        for (int i=0;i<elements.size();i++){
                if ((i+1)%2==0){
                votes.add(j, elements.get(i).getText());
                j++;
            }
        }
        return votes;
    }
    /**获取投票主题*/
    public static String getVoteTitle(SeleniumUtil seleniumUtil){
       String title = seleniumUtil.getText(Page_Vote.VOTE_LINK_TITLE);
        return title;
    }

    /**获取选项名称*/
    public static List<String> getOptionName(SeleniumUtil seleniumUtil){
        List<WebElement> elements = seleniumUtil.getWelements(Page_Vote.VOTE_LINK_OPTIONNAME);
        List<String> names = new ArrayList<String>();
        for (int i=0;i<elements.size();i++){
            names.add(i,elements.get(i).getText());
        }
        return names;
    }

}
