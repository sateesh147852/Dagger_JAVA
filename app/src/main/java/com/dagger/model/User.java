package com.dagger.model;

import android.util.Log;

import javax.inject.Inject;

public class User {

    public static final String TAG = "newdagger";
    private MaleUser maleUser;
    private FemaleUser femaleUser;

    @Inject
    public User(MaleUser maleUser,FemaleUser femaleUser){
        Log.i(TAG, "User: ");
        this.maleUser = maleUser;
        this.femaleUser = femaleUser;
    }


    public void think(){
        Log.i(TAG, "think: "+"user method is called");
        maleUser.think();
        femaleUser.think();
    }

    @Inject
    public void setOtherUser(OtherUser otherUser){
        otherUser.setOtherUser(this);
    }

}
