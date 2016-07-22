package com.example.intentservices.intentservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: " + Thread.currentThread()); //create main/UI thread
    }

    public void triggerStartedService(View view) {
        Intent intent = new Intent(this, MyStartedService.class); //create service
        startService(intent); //start service
    }

    public void triggerIntentService(View view) {
        Intent intent = new Intent(this, MyIntentService.class); //create service
        startService(intent); //start service
    }
}
