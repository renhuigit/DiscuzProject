package page;

import org.openqa.selenium.By;

/**
 * Created by rh on 2018/5/7.
 */
public class Page_Delete {
    /**删除*/
    public static final By DELETE_LINK_DELETE = By.xpath("//*[@id=\"mdly\"]/p[1]/strong[1]/a");
    /**复选框*/
    public static final By DELETE_CHECKED_SELECT = By.xpath("//*[@name=\"moderate[]\"]");
    /**弹出的确定按钮*/
    public static final By DELETE_BUTTON_SUBMIT = By.id("modsubmit");
}
