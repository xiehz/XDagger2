package com.example.xiehz.car_dagger2;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);
    GasStationComponent.GasStationBuilder gasstationBuilder();
}
