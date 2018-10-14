package com.example.xiehz.car_dagger2;

import dagger.Module;
import dagger.Provides;

@Module
public  class OilModule {

    @Provides
    Oil providerOil(){
        return new Oil();
    }
}
