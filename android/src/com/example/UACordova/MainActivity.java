package com.example.UACordova;

import android.os.Bundle;
import org.apache.cordova.*;

import com.urbanairship.UAirship;

public class MainActivity extends DroidGap
{
    //@SuppressWarnings("deprecation")
	@Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
        // phonegap plugins
        //super.addService("PushNotificationPlugin", "com.hmkang.HiWorld.PushNotificationPlugin");
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

