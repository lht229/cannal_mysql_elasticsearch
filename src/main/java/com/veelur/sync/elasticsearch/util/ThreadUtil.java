package com.veelur.sync.elasticsearch.util;

/**
 * @author: veelur
 * @date: 18-10-22
 * @Description: {相关描述}
 */
public class ThreadUtil {

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
