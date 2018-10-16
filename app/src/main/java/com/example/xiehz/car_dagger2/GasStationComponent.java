package com.example.xiehz.car_dagger2;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Subcomponent;

@OilScope
@Component(modules = {OilModule.class})
public interface GasStationComponent {
    void inject(Car car);

    @Oil92Qualifier
    Oil get92();

    @Oil95Qualifier
    Oil get95();
}
