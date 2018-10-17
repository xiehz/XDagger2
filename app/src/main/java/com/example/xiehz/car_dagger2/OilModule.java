package com.example.xiehz.car_dagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;

@Module
public  class OilModule {

//    @Singleton
    @OilScope
    @Oil92Qualifier
    @Provides
    Oil provider92(){
        return new Oil92();
    }

//    @Singleton
    @OilScope
    @Oil95Qualifier
    @Provides
    Oil provider95(){
        return new Oil95();
    }
}
