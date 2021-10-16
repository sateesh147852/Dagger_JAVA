package com.dagger.model;

import android.util.Log;

import javax.inject.Inject;

class OtherUser {

    @Inject
    public OtherUser(){
        Log.i("newdagger", "OtherUser: ");
    }

    public void setOtherUser(User user){
        Log.i("newdagger", "setOtherUser: ");
    }
}
