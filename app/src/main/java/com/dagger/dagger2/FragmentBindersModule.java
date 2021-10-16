package com.dagger.dagger2;

import com.dagger.ui.HomeFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class FragmentBindersModule {

    @ContributesAndroidInjector
    abstract HomeFragment provideHomeFragment();
}


