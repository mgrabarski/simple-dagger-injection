package com.mateusz.grabarski.daggersimpleinjection.settings;

import android.content.SharedPreferences;
import android.util.Log;

/**
 * Created by Mateusz Grabarski on 25.01.2018.
 */

public class SettingsManager {

    private SharedPreferences mSharedPreferences;

    public SettingsManager(SharedPreferences mSharedPreferences) {
        this.mSharedPreferences = mSharedPreferences;
    }

    public void doSomething() {
        Log.d(SettingsManager.class.getSimpleName(), "doSomething: ");
    }
}
