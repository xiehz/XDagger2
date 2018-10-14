package com.example.xiehz.car_dagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = {GasStationComponent.class})
public class AppModule {
    @Provides
    Car providerCar(){
        return new Car();
    }
}
