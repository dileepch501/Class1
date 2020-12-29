package com.sukshi.classoneproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LifeCycle extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.e("LifeCycle","Activity in OnCreate Method");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("LifeCycle","Activity in OnStart Method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("LifeCycle","Activity in OnResume Method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("LifeCycle","Activity in OnPause Method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        int a=20;
        int b=30;
        int c=a+b;
        Log.e("LifeCycle","Activity in OnStop Method");
        Log.e("Addition", String.valueOf(c));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("LifeCycle","Activity in OnDestroy Method");
    }
}