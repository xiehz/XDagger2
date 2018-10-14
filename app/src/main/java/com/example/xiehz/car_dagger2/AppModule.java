package com.example.xiehz.car_dagger2;

import dagger.Module;
import dagger.Provides;

@Module(includes = OilModule.class)
public class AppModule {
    @Provides
    Car providerCar(){
        return new Car();
    }
}
