package util;


import org.apache.log4j.PropertyConfigurator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * Created by rh on 2018/5/7.
 */
public class LogConfiguration {
    public static void initLog(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
        String date = format.format(new Date());
        final String logFileName = "./result/Logs/"+date+".log";
//        创建配置Properties对象
        Properties pro = new Properties();
        pro.setProperty("log4j.rootLogger","info,toConsole,toFile");
        pro.setProperty("log4j.appender.toConsole","org.apache.log4j.ConsoleAppender");
        pro.setProperty("log4j.appender.toConsole.layout","org.apache.log4j.PatternLayout");
        pro.setProperty("log4j.appender.toConsole.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        pro.setProperty("log4j.appender.toFile","org.apache.log4j.DailyRollingFileAppender");
        pro.setProperty("log4j.appender.toFile.layout","org.apache.log4j.PatternLayout");
        pro.setProperty("log4j.appender.toFile.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        pro.setProperty("log4j.appender.toFile.file",logFileName);
//        生效配置
        PropertyConfigurator.configure(pro);

    }

}
