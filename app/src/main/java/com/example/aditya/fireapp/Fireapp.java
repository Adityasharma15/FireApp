package com.example.aditya.fireapp;

import android.app.Application;

import com.firebase.client.Firebase;

public class Fireapp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
        // WE ARE GONNA RUN THIS FOR EVERY PAGE SO WE ADD IT TO ANDROID MANIFEST.