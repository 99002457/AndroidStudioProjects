package com.lnt.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public final static String HOMEACTIVITY=MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Log.d(HOMEACTIVITY,"Activity Created");
        showLog("Activity Created");

    }

    @Override
    protected void onResume(){
        super.onResume();
           // Log.d(HOMEACTIVITY,"Activity Resumed");
        showLog("Activity Resumed");
    }

    @Override
    protected void onPause(){
        super.onPause();
        // Log.d(HOMEACTIVITY,"Activity Resumed");
        showLog("Activity Pause");
    }

    @Override
    protected void onStart() {
        super.onStart();
       // Log.d(HOMEACTIVITY, "Activity Started");
        showLog("Activity start");
    }

    @Override
    protected void onStop(){
        super.onStop();
            //Log.d(HOMEACTIVITY,"Activity Stopped");
        showLog("Activity Stopped");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        //Log.d(HOMEACTIVITY,"Activity Destroyed");
        showLog("Activity Destroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        //Log.d(HOMEACTIVITY,"Activity Restarted");
        showLog("Activity Restarted");
    }

    public void showLog(String s)
    {
        Log.d(HOMEACTIVITY,s);
    }

}