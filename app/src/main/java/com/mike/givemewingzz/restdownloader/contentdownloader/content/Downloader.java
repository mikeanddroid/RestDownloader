package com.mike.givemewingzz.restdownloader.contentdownloader.content;

import android.content.Context;

import com.mike.givemewingzz.restdownloader.contentdownloader.RestDownloader;
import com.mike.givemewingzz.restdownloader.contentdownloader.models.BaseUrl;

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
    private static RequestType requestType;

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

    public void setBaseURL(String baseURL) {
        BaseUrl baseUrl = new BaseUrl(RestDownloader.getInstance().getApplicationContext());

        if (baseURL == null) {
            throw new NullPointerException("Endpoint may not be null.");
        }

        baseUrl.setBaseUrl(baseURL);
    }

    public String getBaseURL(Context context) {
        BaseUrl baseUrl = new BaseUrl(context);
        return baseUrl.getBaseUrl();
    }

    public static void setRequestType(RequestType requestType) {
        Downloader.requestType = requestType;
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

    public void buildRequest(RequestType requestType) {

        switch (requestType) {

            case GET:
                break;
            case POST:
                break;
            case PUT:
                break;
            case DELETE:
                break;

        }

    }

    public enum RequestType {

        GET(""),
        POST(""),
        PUT(""),
        DELETE("");

        private String format_result;

        RequestType(String format) {
            this.format_result = format;
        }

        public String getFormat_result() {
            return format_result;
        }

    }

}
