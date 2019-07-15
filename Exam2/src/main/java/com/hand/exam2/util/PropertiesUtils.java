package com.hand.exam2.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author 王灏
 * @Date 2019/7/15 14:53
 * @Version 1.0.0
 */
public class PropertiesUtils {
    public static String getValue(String key) throws IOException {
        //1. 创建Properties集合类。
        Properties pro = new Properties();
        //获取src路径下的文件的方式--->ClassLoader 类加载器
        ClassLoader classLoader = JDBCUtils.class.getClassLoader();
        URL res = classLoader.getResource("jdbc.properties");
        String path = res.getPath();
        //2. 加载文件
        pro.load(new FileReader(path));
        return pro.getProperty(key);
    }
}
