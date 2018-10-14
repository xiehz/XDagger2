package com.example.xiehz.car_dagger2;

import dagger.Component;

@Component
public interface GasStationComponent {
    void inject(Car car);
}
