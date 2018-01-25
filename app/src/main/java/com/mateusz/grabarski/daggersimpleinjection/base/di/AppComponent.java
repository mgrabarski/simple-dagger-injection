package com.mateusz.grabarski.daggersimpleinjection.base.di;

import com.mateusz.grabarski.daggersimpleinjection.MainActivity;
import com.mateusz.grabarski.daggersimpleinjection.base.App;

import dagger.Component;

/**
 * Created by Mateusz Grabarski on 25.01.2018.
 */
@Component(modules = {
        AppModule.class
})
public interface AppComponent {
    void inject(App app);
    void inject(MainActivity activity);
}
