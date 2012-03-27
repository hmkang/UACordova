package com.example.UACordova;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.apache.cordova.api.PluginResult.Status;

public class PushNotificationPlugin extends Plugin {
    final static String TAG = PushNotificationPlugin.class.getSimpleName();

    public static final String ACTION = "registerCallback";

    public void sendResultBack(String msg) {
        JSONObject data = new JSONObject();
        try {
            data.put("msg", msg);
        } catch (JSONException e) {
            Log.e(TAG, e.getMessage());
        }
        String js = String.format("window.plugins.pushNotification.notificationCallback('%s');", data.toString());
        this.sendJavascript(js);
        Log.d(TAG, "Sending javascript " + js);
    }

    @Override
    public PluginResult execute(String action, JSONArray data,
            String callbackId) {

        PluginResult result = null;
        if (ACTION.equals(action)) {
            result = new PluginResult(Status.NO_RESULT);
            result.setKeepCallback(false);
        } else {
            Log.d(TAG, "Invalid action: " + action + " passed");
            result = new PluginResult(Status.INVALID_ACTION);
        }
        return result;
    }
}

