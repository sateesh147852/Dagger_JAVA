package com.dagger.dagger2;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.util.Util;
import com.dagger.R;
import com.dagger.adapter.NamesAdapter;
import com.dagger.utilites.Utility;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
class AppModule {

    @Provides
    @Named("FirstName")
    String getFirstName() {
        return "sateesh";
    }

    @Provides
    @Named("LastName")
    String getLastName() {
        return "Chikkalagi";
    }

    @Provides
    @Singleton
    RequestOptions provideRequestOptions(){
        return RequestOptions.errorOf(R.drawable.ic_launcher_background)
                .placeholder(R.drawable.ic_launcher_background);
    }

    @Provides
    @Singleton
    RequestManager provideRequestManager(Context context){
        return Glide.with(context).applyDefaultRequestOptions(provideRequestOptions());
    }

    @Provides
    @Singleton
    Utility provideUtility(){
        return new Utility();
    }

    @Provides
    NamesAdapter provideNamesAdapter(){
        return new NamesAdapter();
    }


}
