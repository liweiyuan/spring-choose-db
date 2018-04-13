package com.ssy.prop;

/**
 * 数据源的Handler类
 */
public class DataSourceHandler {

    //数据源私用线程
    public static final ThreadLocal<String> handler = new ThreadLocal<String>();

    /**
     * 在项目启动的时候将配置的读、写数据源加到holder中
     */
    public static void putHandler(String dataSource) {
        handler.set(dataSource);
    }

    /**
     * 从holer中获取数据源字符串
     */
    public static String getHandler() {
        return handler.get();
    }

}
