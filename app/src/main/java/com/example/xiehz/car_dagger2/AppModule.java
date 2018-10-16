package com.example.xiehz.car_dagger2;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @CarScope
//    @Named("玛莎拉蒂")
    @CarQualifier
    @Provides
    Car providerCar(){
        return new Car();
    }
}
