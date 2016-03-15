package com.mike.givemewingzz.restdownloader.contentdownloader.service;

import com.mike.givemewingzz.restdownloader.contentdownloader.RestDownloader;
import com.mike.givemewingzz.restdownloader.contentdownloader.models.BaseUrl;

import retrofit.http.GET;

/**
 * Created by GiveMeWingzz on 3/10/2016.
 */
public interface RetrofitInterface {

    BaseUrl base = new BaseUrl(RestDownloader.getInstance().getApplicationContext());

    @GET("")
    public void doSomething();

}
