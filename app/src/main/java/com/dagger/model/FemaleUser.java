package com.dagger.model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

class FemaleUser {

    @Inject
    public FemaleUser(@Named("LastName") String name){
        Log.i("newdagger", "FeMaleUser: "+name);
    }

    public void think(){
        Log.i("newdagger", "think: "+"called in FemaleUser");
    }
}
