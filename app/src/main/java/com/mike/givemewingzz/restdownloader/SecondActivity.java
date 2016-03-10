package com.mike.givemewingzz.restdownloader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mike.givemewingzz.restdownloader.contentdownloader.content.Downloader;
import com.mike.givemewingzz.restdownloader.contentdownloader.utils.AppUtils;

/**
 * Created by GiveMeWingzz on 3/10/2016.
 */
public class SecondActivity extends AppCompatActivity {

    private static final String TAG = SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Downloader downloader = Downloader.getInstance();
        AppUtils.printLog(TAG, "From Second Activity : " + downloader.getBaseURL(this));

    }
}
