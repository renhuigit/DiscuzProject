package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperPublish;
import pageHelper.HelperUserLogin;
import pageHelper.HelperVote;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rh on 2018/5/8.
 */
public class TestVote extends BasicTestCase{
    @Test
    public void testVote() throws InterruptedException {
        HelperUserLogin.login(seleniumUtil,"test","test");
        Thread.sleep(3000);
        List<String> list = new ArrayList<String>();
        list.add(0,"这就是街舞");
        list.add(1,"热血街舞团");
        list.add(2,"创造101");
        HelperPublish.voteByButton(seleniumUtil,1,"投票内容：这就是街舞，热血街舞团，101","网综节目投票",list);
       Thread.sleep(3000);
        HelperVote.vote(seleniumUtil,0);
        List list1 = HelperVote.getNumberOfVotes(seleniumUtil);
       String voteTitle = HelperVote.getVoteTitle(seleniumUtil);
        List name = HelperVote.getOptionName(seleniumUtil);
        System.out.println(voteTitle);
        for (int i=0;i<list1.size();i++){
            System.out.println(name.get(i));
            System.out.println(list1.get(i));
        }

    }
}
