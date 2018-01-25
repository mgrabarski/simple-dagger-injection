package com.mateusz.grabarski.daggersimpleinjection.base;

import android.app.Application;

import com.mateusz.grabarski.daggersimpleinjection.base.di.AppComponent;
import com.mateusz.grabarski.daggersimpleinjection.base.di.AppModule;
import com.mateusz.grabarski.daggersimpleinjection.base.di.DaggerAppComponent;
import com.mateusz.grabarski.daggersimpleinjection.settings.SettingsManager;

import javax.inject.Inject;

import dagger.android.DaggerApplication;

/**
 * Created by Mateusz Grabarski on 25.01.2018.
 */

public class App extends Application {

    @Inject
    SettingsManager settingsManager;

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = getAppComponent();
        mAppComponent.inject(this);
    }

    public AppComponent getAppComponent() {
        if (mAppComponent == null) {
            mAppComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(this))
                    .build();
        }
        return mAppComponent;
    }
}
