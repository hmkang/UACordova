package com.example.UACordova;

import android.os.Bundle;
import org.apache.cordova.*;

public class MainActivity extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        MyApplication myApp = (MyApplication) this.getApplication();
        myApp.getPushNotificationPlugin().ctx = this;
        
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
/*
    @Override
    public void onStart() {
        super.onStart();
        UAirship.shared().getAnalytics().activityStarted(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        UAirship.shared().getAnalytics().activityStopped(this);
    }
*/
}

