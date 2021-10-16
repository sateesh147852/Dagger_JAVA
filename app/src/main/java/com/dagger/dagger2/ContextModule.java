package com.dagger.dagger2;

import android.content.Context;

import com.dagger.AppController;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

@Module
interface ContextModule {

    @Binds
    @Singleton
    Context baseContext(AppController context);
}
