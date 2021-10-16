package com.dagger.model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

class MaleUser {

    @Inject
    public MaleUser(@Named("FirstName") String name){
        Log.i("newdagger", "MaleUser: "+name);
    }

    public void think(){
        Log.i("newdagger", "think: "+"called in MaleUser");
    }
}
