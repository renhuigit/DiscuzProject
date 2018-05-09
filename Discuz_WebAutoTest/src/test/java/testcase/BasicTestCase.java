package testcase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
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
    String value;
    String path;
    String property;

    @BeforeMethod
    public void setUp(){
        LogConfiguration.initLog();
        value = ProUtil.getDriverType();
        path = ProUtil.getDriverPath();
        property = ProUtil.getProperty();
        seleniumUtil = new SeleniumUtil();
        System.setProperty(property, path);
        driver = seleniumUtil.getWebDriver(value);
        seleniumUtil.Url("http://127.0.0.1:8086/bbs/forum.php");
    }
    @AfterMethod
    public void clearDriver(){
        if (driver!=null){
            driver.quit();
            logger.info("driver退出成功");
        }else {
            logger.error("driver没有获取对象，退出失败");
        }

    }
}
