package com.mike.givemewingzz.contentdownloader.content;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by GiveMeWingzz on 3/8/2016.
 */
public class Downloader {

    private static String TAG = ContentDownloader.class.getSimpleName();
    private static Map<Object, Object> queryMap = new LinkedHashMap<>();

    private static Downloader instance = null;

    protected Downloader() {
    }

    public static Downloader getInstance() {
        if (instance == null) {
            // Thread Safe. Might be costly operation in some case
            synchronized (Downloader.class) {
                if (instance == null) {
                    instance = new Downloader();
                }
            }
        }
        return instance;
    }

    public static void addQueryParams(Object key, Object value) {
        queryMap.put(key, value);
    }

    public Map<Object, Object> getQueryMap() {

        if (queryMap.isEmpty()) {
            return new HashMap<>();
        }

        return queryMap;

    }

}
