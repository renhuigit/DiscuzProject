package util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by rh on 2018/5/7.
 */
public class ProUtil {
    private static Properties properties = null;
    private static Properties readProperties(String filePath){
        properties = new Properties();
        try
        {
            //创建输入流对象
            InputStream inputStream = new FileInputStream(filePath);
//            从输入流中读取属性列表（键和元素对）。
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static String getDriverType(){
        readProperties("./Configuration");
        String driverType = properties.getProperty("browser");
        return driverType;
    }
    public static String getDriverPath(){
        readProperties("./Configuration");
        String path = properties.getProperty("path");
        return path;
    }
    public static String getProperty(){
        readProperties("./Configuration");
        String property = properties.getProperty("property");
        return property;
    }
}
