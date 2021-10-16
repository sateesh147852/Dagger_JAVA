package com.dagger.dagger2;

import com.dagger.ui.SecondActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class SecondActivityBindersModule {

    @ContributesAndroidInjector
    abstract SecondActivity provideSecondActivity();
}
