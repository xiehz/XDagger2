package com.example.xiehz.car_dagger2;

import dagger.Component;

@Component(modules = {OilModule.class})
public interface GasStationComponent {
    void inject(Car car);
}
