package com.sagnak.service;

import com.sagnak.MainActivity;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module( injects = { MainActivity.class } )
public class WelcomeModule {

    @Provides
    @Singleton
    Welcomer provideWelcomer(){
        return new DefaultWelcomer();
    }

}
