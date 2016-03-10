package com.mike.givemewingzz.restdownloader.contentdownloader.service;

/**
 * Created by GiveMeWingzz on 3/10/2016.
 */
public abstract class BaseRequestInterceptor implements retrofit.RequestInterceptor {

    /**
     * Called for every request. Add data using methods on the supplied {@link RequestFacade}.
     *
     * @param request
     */
    @Override
    public void intercept(RequestFacade request) {
        // Subclass Can modify the request when overriding this method.
    }
}
