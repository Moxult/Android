package com.example.user.myapplication;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

/**
 * Created by User on 06.03.2018.
 */

public class MyApplication extends Application {

    private  static final String TAG = "MyApplication";
    @Override
    public void onCreate() {
        super.onCreate();

        Log.d(TAG, "onCreate()");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.d(TAG, "onTerminate()");
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Log.d(TAG, "onLowMemory()");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d(TAG, "onConfigurationChanged()");
    }
}
