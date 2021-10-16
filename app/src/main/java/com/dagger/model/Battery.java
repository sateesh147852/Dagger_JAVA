package com.dagger.model;

import android.util.Log;

import javax.inject.Inject;

public class Battery {

    public static final String TAG = "newdagger";

    @Inject
    public Battery(Snapdragen snapdragen,SamsungProcesser samsungProcesser){
        Log.i(TAG, "Battery: ");
        snapdragen.start();
        samsungProcesser.start();
    }
}
