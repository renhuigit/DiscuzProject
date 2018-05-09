package testcase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.LogConfiguration;
import util.ProUtil;
import util.SeleniumUtil;

/**
 * Created by rh on 2018/5/7.
 */
public class BasicTestCase {
    private Logger logger = Logger.getLogger(BasicTestCase.class);
    WebDriver driver = null;
    SeleniumUtil seleniumUtil = null;
    ProUtil proUtil = null;

    @BeforeMethod
    public void setUp(){
        LogConfiguration.initLog();
        proUtil = new ProUtil();
        String value = proUtil.getDriverType();
        String path = proUtil.getDriverPath();
        String property = proUtil.getProperty();
        seleniumUtil = new SeleniumUtil();
        System.setProperty(property, path);
       driver = seleniumUtil.getWebDriver(value);
//        seleniumUtil.Url("http://127.0.0.1:8086/bbs/forum.php?mod=viewthread&tid=29&extra=page%3D1");

        seleniumUtil.Url("http://127.0.0.1:8086/bbs/forum.php");
    }
    @AfterMethod
    public void clearDriver(){
        if (driver!=null){
//            driver.quit();
            logger.info("driver退出成功");
        }else {
            logger.error("driver没有获取对象，退出失败");
        }

    }
}
