package com.mike.givemewingzz.contentdownloader.content;

import com.mike.givemewingzz.contentdownloader.utils.ContentDownloaderRegistry;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by GiveMeWingzz on 3/8/2016.
 */
public class ContentDownloader {

    private static String TAG = ContentDownloader.class.getSimpleName();
    private static Map<Object, Object> queryMap = new LinkedHashMap<>();

    protected ContentDownloader() {
    }

    public synchronized static ContentDownloader getInstance(String classname) {
        return (ContentDownloader) ContentDownloaderRegistry.REGISTRY.getInstance(classname);
    }

    public static void addQueryParams(Object key, Object value) {
        queryMap.put(key, value);
    }

    public Map<Object, Object> getQueryMap(){

        if (queryMap.isEmpty()){
            return new HashMap<>();
        }

        return queryMap;

    }

}
