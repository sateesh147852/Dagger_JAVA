package com.dagger.model;

import android.util.Log;

import javax.inject.Inject;

public class SamsungProcesser implements Processer {

    public static final String TAG = "newdagger";

    @Inject
    public SamsungProcesser(){
        Log.i(TAG, "SamsungProcesser: ");
    }

    @Override
    public void start() {
        Log.i(TAG, "start: SamsungProcesser");
    }
}
