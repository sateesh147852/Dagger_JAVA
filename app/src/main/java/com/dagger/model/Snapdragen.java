package com.dagger.model;

import android.util.Log;

import javax.inject.Inject;

class Snapdragen  implements Processer{

    public static final String TAG = "newdagger";

    @Inject
    public Snapdragen(){
        Log.i(TAG, "Snapdragen: ");
    }

    @Override
    public void start() {
        Log.i(TAG, "start: "+"snapdragen");
    }
}
