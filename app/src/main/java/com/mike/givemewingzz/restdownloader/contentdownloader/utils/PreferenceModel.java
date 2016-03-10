package com.mike.givemewingzz.restdownloader.contentdownloader.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by GiveMeWingzz on 3/10/2016.
 */
public class PreferenceModel {

    private Context context;
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;

    public PreferenceModel(Context context) {
        this.context = context;
        prefs = PreferenceManager.getDefaultSharedPreferences(context);
        editor = prefs.edit();
    }

    public void putBoolean(String key, boolean value) {
        editor.putBoolean(key, value).apply();
    }

    public boolean getBoolean(String key) {
        return prefs.getBoolean(key, false);
    }

    public void putString(String key, String value) {
        editor.putString(key, value).apply();
    }

    public String getString(String key) {
        return prefs.getString(key, null);
    }

    public void putLong(String key, long value) {
        editor.putLong(key, value).apply();
    }

    public Long getLong(String key) {
        return prefs.getLong(key, 0l);
    }

    public void putInt(String key, int value) {
        editor.putInt(key, value).apply();
    }

    public int getInt(String key) {
        return prefs.getInt(key, 0);
    }

}
