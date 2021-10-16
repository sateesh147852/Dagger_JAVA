package com.dagger;

import com.dagger.dagger2.AppComponent;
import com.dagger.dagger2.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class AppController extends DaggerApplication {


    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AppComponent appComponent = DaggerAppComponent.builder().application(this).build();
        appComponent.inject(this);
        return appComponent;
    }
}
