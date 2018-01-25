package com.mateusz.grabarski.daggersimpleinjection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mateusz.grabarski.daggersimpleinjection.base.App;
import com.mateusz.grabarski.daggersimpleinjection.base.di.DaggerAppComponent;
import com.mateusz.grabarski.daggersimpleinjection.settings.SettingsManager;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    SettingsManager settingsManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getAppComponent().inject(this);

        settingsManager.doSomething();
    }
}
