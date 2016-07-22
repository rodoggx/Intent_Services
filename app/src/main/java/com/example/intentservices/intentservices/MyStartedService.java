package com.example.intentservices.intentservices;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyStartedService extends Service {
    private static final String TAG = "MyStartedServiceTAG";

    public MyStartedService() {
    }


    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: " + Thread.currentThread());
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
        @Override
        public void onDestroy() {
        super.onCreate();
        Log.d(TAG, "onDestroy: " + Thread.currentThread());
    }

}
