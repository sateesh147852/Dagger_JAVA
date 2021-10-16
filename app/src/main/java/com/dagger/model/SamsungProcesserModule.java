package com.dagger.model;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class SamsungProcesserModule {

    @Binds
    abstract Processer getSamsungProcesser(SamsungProcesser processer);

}
