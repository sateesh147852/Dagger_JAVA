package com.dagger.model;

import dagger.Module;
import dagger.Provides;

@Module
public class SnapdragenDaggerModule {

    @Provides
    static Processer getSnapdragenDaggerProcesser(Snapdragen snapdragen){
        return snapdragen;
    }

}
