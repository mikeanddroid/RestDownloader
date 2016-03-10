package com.mike.givemewingzz.restdownloader.contentdownloader;

import android.app.Application;
import android.content.Context;

/**
 * Created by GiveMeWingzz on 3/10/2016.
 */
public class RestDownloader extends Application {

    public static final String TAG = RestDownloader.class.getSimpleName();
    private static Context context;
    private static RestDownloader mainApplication;

    @Override
    public void onCreate() {
        super.onCreate();

        mainApplication = this;
        context = this.getApplicationContext();
    }

    /**
     * Convenience mehtod for application static instance.
     *
     * @return
     */
    public static RestDownloader getInstance() {
        return mainApplication;
    }

}
