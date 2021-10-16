package com.dagger.dagger2;

import com.dagger.AppController;
import com.dagger.model.SamsungProcesserModule;
import com.dagger.model.SnapdragenDaggerModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;


@Singleton
@Component(modules = {ActivityBuildersModule.class, AndroidSupportInjectionModule.class,
        SecondActivityBindersModule.class,
        SnapdragenDaggerModule.class,
        SamsungProcesserModule.class,
        AppModule.class,
        ContextModule.class,
        FragmentBindersModule.class})
public interface AppComponent extends AndroidInjector<AppController> {

    void inject(AppController appController);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(AppController appController);

        AppComponent build();

    }
}
