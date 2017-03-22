package com.example.williams.taqueria;

import android.app.Application;

import com.facebook.FacebookSdk;

import com.facebook.appevents.AppEventsLogger;

/**
 * Created by Williams on 28/02/2017.
 */

public class taqueriaapp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FacebookSdk.sdkInitialize(this.getApplicationContext());
        AppEventsLogger.activateApp(this);


    }



}
