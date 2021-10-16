package com.dagger.dagger2;

import com.dagger.ui.MainActivity;
import com.dagger.ui.SecondActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract MainActivity providerMainActivity();

}
