package com.mike.givemewingzz.restdownloader.contentdownloader.models;

import android.content.Context;

import com.mike.givemewingzz.restdownloader.contentdownloader.utils.PreferenceModel;

/**
 * Created by GiveMeWingzz on 3/10/2016.
 */
public class BaseUrl {

    private static PreferenceModel preferenceModel;
    public static final String BASE_URL_KEY = "BASE_URL_KEY";

    public BaseUrl(Context context) {
        Context c = context;
        preferenceModel = new PreferenceModel(c);
    }

    public static String getBaseUrl() {
        return preferenceModel.getString(BASE_URL_KEY);
    }

    public void setBaseUrl(String baseUrl) {
        String tempBaseUrl = baseUrl;
        preferenceModel.putString(BASE_URL_KEY, tempBaseUrl);
    }
}
