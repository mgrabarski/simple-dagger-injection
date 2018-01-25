package com.mateusz.grabarski.daggersimpleinjection.base.di;

import android.content.Context;
import android.content.SharedPreferences;

import com.mateusz.grabarski.daggersimpleinjection.base.App;
import com.mateusz.grabarski.daggersimpleinjection.base.Constants;
import com.mateusz.grabarski.daggersimpleinjection.settings.SettingsManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mateusz Grabarski on 25.01.2018.
 */
@Module
public class AppModule {

    private App mApp;

    public AppModule(App mApp) {
        this.mApp = mApp;
    }

    @Provides
    SharedPreferences provideSharedPreferences() {
        return mApp.getSharedPreferences(Constants.SHARE_PREFS_FILE, Context.MODE_PRIVATE);
    }

    @Provides
    @Singleton
    SettingsManager provideSettingsManager(SharedPreferences sharedPreferences) {
        return new SettingsManager(sharedPreferences);
    }
}
