package com.example.intentservices.intentservices;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyIntentService extends IntentService {
    private static final String TAG = "MyIntentServiceTAG";

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d(TAG, "onHandleIntent: " + Thread.currentThread());

    }

    @Override
    public void onDestroy() {
        super.onCreate();
        Log.d(TAG, "onDestroy: " + Thread.currentThread());
    }
}
