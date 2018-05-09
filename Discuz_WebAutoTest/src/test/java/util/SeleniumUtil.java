package util;


import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by rh on 2018/5/7.
 */
public class SeleniumUtil {
    private static Logger logger = Logger.getLogger(SeleniumUtil.class);
    static WebDriver webDriver = null;
    /**获取驱动*/
    public  WebDriver getWebDriver(String driverType){
        if (driverType.equalsIgnoreCase("chrome")){
            webDriver = new ChromeDriver();
            logger.info("启动chrome浏览器");
        }else if(driverType.equalsIgnoreCase("firefox")){
            webDriver = new FirefoxDriver();
            logger.info("启动firefox浏览器");
        }else if(driverType.equalsIgnoreCase("ie")){
            webDriver = new InternetExplorerDriver();
            logger.info("启动ie浏览器");
        }else if(driverType.equalsIgnoreCase("edge")){
            webDriver = new EdgeDriver();
            logger.info("启动edge浏览器");
        }
    return webDriver;
    }

    /**获取地址*/
    public void Url(String url){
        webDriver.get(url);
        logger.info("打开网址"+webDriver.getCurrentUrl());
    }
    /**获取定位值*/
    public  String getLocatorByElement(WebElement element,String exceptText){
        String text = element.toString();
        String except = null;
        try{
            except=text.substring(text.indexOf(exceptText) + 1,text.length()-1);
            logger.info("成功获取元素的定位值"+except);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("获取元素的定位值失败:"+exceptText);
        }
        return except;
    }

    /**获取页面元素*/

    public  WebElement getWelement(By by){
        WebElement element = null;
        try {
            element = webDriver.findElement(by);
            logger.info("找到页面元素"+getLocatorByElement(element,">"));
        }catch (NoSuchElementException e){
            e.printStackTrace();
            logger.error("未找到页面元素"+getLocatorByElement(element,">"));
            return null;
        }
        return element;
    }
    /**识别一组页面元素*/
    public  List<WebElement> getWelements(By by){
        List<WebElement> elements = null;
        try {
            elements = webDriver.findElements(by);
            logger.info("找到页面元素");
        }catch (NoSuchElementException e){
            e.printStackTrace();
            logger.error("未找到页面元素");
        }
        return elements;
    }

    /**输入内容*/
    public void sendKeys(By by,String text){
        WebElement element = getWelement(by);
        clear(by);
        element.sendKeys(text);
        logger.info("输入内容成功");
    }
    /**清除内容*/
    public void clear(By by){
        WebElement element = getWelement(by);
        element.clear();
        logger.info("清除文本成功");
    }
    /**点击元素*/
    public void click(By by) {
        WebElement ele = getWelement(by);
        try {
            ele.click();
            logger.info("点击元素：" + getLocatorByElement(ele, ">"));
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("点击元素" + getLocatorByElement(ele, ">") + "失败", e);
            Assert.fail("点击元素" + getLocatorByElement(ele, ">"), e);
        }
    }

    /**获取文本内容*/
    public String getText(By by){
        WebElement element = getWelement(by);
        String text = element.getText();
        return text;
    }
    /* 校验文本是否与预期一致 assertForText*/
    public void assertForText(WebElement element,String exceptedContent) {
        String actual=element.getText();
        try{
            Assert.assertEquals(actual,exceptedContent);
        }catch (Exception e){
            e.getStackTrace();
            logger.info("未找到了对应的文本，当前页面是：【"+actual+"】，期望页面是：【"+exceptedContent+"】");
        }
        logger.info("找到了对应得文本，当前页面正确：【"+actual+"】");
    }
    /**切换窗口*/
    public void switchToNewWindow() {
        Set<String> handles = webDriver.getWindowHandles();
        List<String> it = new ArrayList<String>(handles); //将set集合存入list对象
        webDriver.switchTo().window(it.get(it.size()-1)); //切换到弹出的新窗口
        logger.info("成功切换窗口");
    }
    /**切换框架*/
    public void switchToFrame(String frameId){
        //封装进入id=value的frame中
        webDriver.switchTo().frame(frameId);
    }
    public static void iframeNo(By by){
        //封装进入没有id的frame中
        WebElement frame=webDriver.findElement(by);
        webDriver.switchTo().frame(frame);
    }
    /**切换默认iframe主文档*/
    public void switchToDefaultContent(){
        //封装跳出iframe，进入default content
        webDriver.switchTo().defaultContent();
    }
    /**选择下拉框*/
    public void select(By by, String value){
        //封装选择下拉框（ByValue）
        Select select = new Select(webDriver.findElement(by));
        select.selectByValue(value);
    }

    /**设置显示等待元素*/
    public void waitForElementLoad(final By by, int timeOut){
        logger.info("开始查找元素："+by);
        try{
            WebDriverWait wait = new WebDriverWait(webDriver, timeOut, 1000);
            wait.until(new ExpectedCondition<Boolean>() {

                public Boolean apply(WebDriver driver) {
                    WebElement element = driver.findElement(by);
                    return element.isDisplayed();
                }
            });
        } catch (TimeoutException e){
            logger.error("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
            Assert.fail("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
        }
        logger.info("找到了元素 [" + by + "]");
    }
    /**设置显示等待元素,默认10秒*/
    public void waitForElementLoad(By by){
        waitForElementLoad(by, 10);
    }
    /**等待页面元素加载完成*/
    public  void load(By by){
        //封装等待页面元素加载完成
        WebDriverWait wait = new WebDriverWait(webDriver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

}
