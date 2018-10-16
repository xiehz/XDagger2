package com.example.xiehz.car_dagger2;

import dagger.Component;

@CarScope
@Component(modules = {AppModule.class},dependencies = {GasStationComponent.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);
    void inject(Main2Activity mainActivity);
}
