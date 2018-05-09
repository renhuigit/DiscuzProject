package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page.Page_Vote;
import pageHelper.HelperSeach;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rh on 2018/5/8.
 */
public class test extends BasicTestCase{
    @Test
    public void test(){
        HelperSeach.sendSeachContent(seleniumUtil,"test");
        HelperSeach.selectSearchType(seleniumUtil,"用户");


//        List<WebElement> elements = seleniumUtil.getWelements(Page_Vote.VOTE_LINK_MESSAGE);
//
//        for (WebElement el:elements) {
//            System.out.println(el.getText());
//        }
//        System.out.println(elements.size());
//        List<String> votes = new ArrayList<String>();
//        int j=0;
//        for (int i=0;i<elements.size();i++){
//
//                if ((i+1)%2==0){
//                        votes.add(j, elements.get(i).getText());
//                        j++;
//            }
//        }
//        for (int i=0;i<votes.size();i++){
//            System.out.println("vote"+votes.get(i));
//        }
    }
}
